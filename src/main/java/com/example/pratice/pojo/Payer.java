package com.example.pratice.pojo;

import lombok.Data;

@Data
public class Payer {

	private String addr;
	private String name;
	private String seqName;
	private String type;
	private String Code;
	private Info Info;
	private Device Device;
	private Ac Ac;
	private Amount Amount;
}
