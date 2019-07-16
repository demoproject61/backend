package com.example.demo.controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.model.login;
import com.example.demo.repo.EmployeeRepo;




@CrossOrigin
@RestController
@RequestMapping({ "/employees" })
public class TestController {
    @Autowired
	EmployeeRepo repo;
    
		
	@PostMapping
	public int signup(@RequestBody Employee emp) {
		 Iterable<Employee> findAll = repo.findAll();
		  for (Employee employee : findAll) {
	    	  
			if(employee.getUname().equals(emp.getUname()))
			{
				return 0;
			}
			
		}
		
		System.out.println("user creater");
	repo.save(emp);
	return 1;
		
		
	}
	@PostMapping({"/logincheck"})

	
	public int logincheck(@RequestBody login login)
	{  System.out.println("asfasf");
	
	int id1=0;
      String idd = login.getUser();

      String pass = login.getPasswd();
      //
    System.out.println("1");
     Iterable<Employee> findAll = repo.findAll();
   
    for (Employee employee : findAll) {
    	  System.out.println(employee.getUname()+idd);
		if(employee.getUname().equals(idd))
		{
			id1=employee.getId();
		}
		
	}
    if(id1==0)
    {return 0;}
    Optional<Employee> e2 = repo.findById(id1);
    Employee employee = e2.get();
    
    

     String pass2 = employee.getPass();
     if(pass.equals(pass2))
     {
    	 System.out.println("asdfasdfasdfsdg");
    	 
    	 return 1;
    	 
     }
     else {
    	 System.out.println("nikal ");
     return 0;
     }
	}
}
