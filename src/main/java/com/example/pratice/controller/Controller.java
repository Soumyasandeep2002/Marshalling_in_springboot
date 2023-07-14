package com.example.pratice.controller;

import javax.xml.bind.JAXBException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pratice.service.ServiceImpl;

@RestController
public class Controller {

	@Autowired
	private ServiceImpl service;
	
	@GetMapping("/")
	public String WelCome() {
		return "ReqChkTxn is Active";
	}
	
	@GetMapping("/xml")
	public String objectToXml() throws JAXBException
	{
		return service.converter();
	}
}
