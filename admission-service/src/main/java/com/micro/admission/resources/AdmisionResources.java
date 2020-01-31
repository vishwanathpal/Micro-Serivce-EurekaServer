package com.micro.admission.resources;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.micro.admission.models.DiseasesList;
import com.micro.admission.models.EmployeesList;
import com.micro.admission.models.Patient;

@RestController
@RequestMapping("/admissions")
public class AdmisionResources {
	
	@Autowired
	private RestTemplate restTemplate;
	
	List<Patient> patients = Arrays.asList(
			new Patient("P1", "Gabore", "Hungarian"),
			new Patient("P2", "Ameka", "Nigerian"),
			new Patient("P3", "Emily", "American")
			);
	
	@RequestMapping("/physicians")
	public EmployeesList getPhysicians(){
		
		//before using micro-service (Eurka server)
		//EmployeesList employeeList = restTemplate.getForObject("http://localhost:8082/hr/employees", EmployeesList.class);
		
		//after using micro-service (Eurka server)
		EmployeesList employeeList = restTemplate.getForObject("http://hr-service/hr/employees", EmployeesList.class);
		return employeeList;
		 
	}
	
	@RequestMapping("/diseases")
	public DiseasesList getDiseases(){
		
		//before using micro-service (Eurka server)
		//DiseasesList diseasesList = restTemplate.getForObject("http://localhost:8083/pathology/diseases", DiseasesList.class);
		
		//after using micro-service (Eurka server)
		DiseasesList diseasesList = restTemplate.getForObject("http://pathology-service/pathology/diseases", DiseasesList.class);
		return diseasesList;
	}
		
	@RequestMapping("/patients")
	public  List<Patient>getPatients(){
		return patients;
	} 

	@RequestMapping("/patients/{Id}")
	public Patient getPatientById(@PathVariable("Id") String id) {
		
		Patient patient = patients.stream()
						  .filter(p -> id.equals(p.getId()))
						  .findAny()
						  .orElse(null);
		return patient;
	}
}
