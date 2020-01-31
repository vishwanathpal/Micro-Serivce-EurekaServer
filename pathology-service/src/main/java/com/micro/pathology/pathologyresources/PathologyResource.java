package com.micro.pathology.pathologyresources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.micro.pathology.model.Disease;
import com.micro.pathology.model.DiseasesList;

@RestController
@RequestMapping("/pathology")
public class PathologyResource {
	
	List<Disease> diseases = Arrays.asList(
							new Disease("D1", "Ashma", "warm water bath"),
							new Disease("D2", "Thipodia", "Casper key tab"),
							new Disease("D3", "Coff", "caff syerpes")
			);
	
	/*
	 * @RequestMapping("/diseases") public List<Disease> getDisease(){ return
	 * diseases; }
	 */
	
	@RequestMapping("/diseases")
	public DiseasesList getDisease(){
		
		DiseasesList diseasesList = new DiseasesList();
		diseasesList.setDiseases(diseases);
		return diseasesList;
	}
	
	@RequestMapping("/diseases/{Id}")
	public Disease getDiseaseById(@PathVariable("Id") String Id) {
		Disease d = diseases.stream()
					.filter(disease -> Id.equals(disease.getId()))
					.findAny()
					.orElse(null);
		return d;
	}
}
