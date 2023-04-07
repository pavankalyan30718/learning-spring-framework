
package com.pk.spring.learnspringframework.enterprise.example.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pk.spring.learnspringframework.enterprise.example.Data.DataService;

@Component
public class BusinessService{

	private DataService dataService;
	
	@Autowired
	public BusinessService(DataService dataService) {
		super();
		System.out.println("BusinessService Constructor Injection");
		this.dataService = dataService;
	}
	
	/*
	public void setDataService(DataService dataService) {
		System.out.println("Setter Injection");
		this.dataService = dataService;
	}
	*/
	
	public long calculateSum()
	{
		List <Integer> data = dataService.getData();
		return data.stream().reduce(Integer::sum).get();
		
	}
}

