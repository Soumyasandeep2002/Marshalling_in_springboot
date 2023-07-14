package com.example.pratice.pojo;

import lombok.Data;

@Data
public class Txn {

	private String custRef;
	private String id;
	private String initiationMode;
	private String note;
	private String orgRrn;
	private String orgtxnId;
	private String orgTxnDate;
	private String purpose;
	private String refCategory;
	private String refId;
	private String refUrl;
	private String subType;
	private String ts;
	private String type;
	
}
