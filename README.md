# Micro-Serivce-EurekaServer

https://www.youtube.com/watch?v=bXEBK6hhZXk&list=PL9l1zUfnZkZnW828ZmQBFTPCCoc5y6Ycg
https://www.kindsonthegenius.com/2019/06/07/how-to-build-microservices-in-java-using-spring-eureka-step-by-step-procedure/

=>EurekaService
http://localhost:8761

=>admission service which fetch list patients has admited.
http://localhost:8081/admissions/patients
http://localhost:8081/admissions/patients/P1

=>hr service which fetch list of employee (doctors with specility) of the hospital.
http://localhost:8082/hr/employees
http://localhost:8082/hr/employees/E1

=>pathology service which fetch list of diseases.
http://localhost:8083/pathology/diseases
http://localhost:8083/pathology/diseases/D1

=>fetch the list of diseases by admission service (using RestTamplate)
http://localhost:8081/admissions/diseases

=>fetch the list of physician (employees) by admission service (using RestTamplate)
http://localhost:8081/admissions/physicians
