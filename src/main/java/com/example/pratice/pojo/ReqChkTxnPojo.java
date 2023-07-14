package com.example.pratice.pojo;


import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class ReqChkTxnPojo {

	private Head Head;
	private Txn Txn;
	private Payer Payer;
	private Payee Payee;
	
	
}
