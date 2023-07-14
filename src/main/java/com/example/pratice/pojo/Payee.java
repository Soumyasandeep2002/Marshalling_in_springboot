package com.example.pratice.pojo;

import lombok.Data;

@Data
public class Payee {

	private String seqName;
	private String type;
	private String code;
	private Amount Amount;
	private Ac Ac;
	
}
