package com.example.pratice.service;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.springframework.stereotype.Service;

import com.example.pratice.pojo.Ac;
import com.example.pratice.pojo.Amount;
import com.example.pratice.pojo.Detail;
import com.example.pratice.pojo.Device;
import com.example.pratice.pojo.Head;
import com.example.pratice.pojo.Identity;
import com.example.pratice.pojo.Info;
import com.example.pratice.pojo.Payee;
import com.example.pratice.pojo.Payer;
import com.example.pratice.pojo.Rating;
import com.example.pratice.pojo.ReqChkTxnPojo;
import com.example.pratice.pojo.Txn;

@Service
public class ServiceImpl {

	
	public String converter() throws JAXBException {
		ReqChkTxnPojo req = new ReqChkTxnPojo();
		Info info = new Info();
		Rating rating = new Rating();
		Ac ac = new Ac();
		Detail detail = new Detail();
		Device device1 = new Device();
		Amount amount = new Amount();
		Payee payee = new Payee();
		
		Head head = new Head();
		head.setVer("3.0");
		head.setTs("12-07-2023");
		head.setMsgid("45672131");
		head.setOrgId("56A512765");
		
		Txn txn = new Txn();
		txn.setCustRef("IPPB00125");
		txn.setId("6538152361287");
		txn.setInitiationMode("off");
		txn.setNote("Bike Payment");
		txn.setOrgRrn("2536521IPPB71237");
		txn.setOrgTxnDate("12-07-2023");
		txn.setOrgtxnId("56A512765");
		txn.setPurpose("Bike Buy");
		txn.setRefCategory("121");
		txn.setRefId("6538152361287");
		txn.setRefUrl("no url");
		txn.setTs("12-07-2023");
		txn.setType("A");
		txn.setSubType("no");
		
		Payer payer = new Payer();
		payer.setAddr("BBSR");
		payer.setName("soumya");
		payer.setSeqName("231");
		payer.setType("COLLECT");
		payer.setCode("1");
		
		Identity identity = new Identity();
		identity.setId("163871");
		identity.setName("soumya");
		identity.setVerifiedName("guru");
		rating.setVerifiedAddress("BBSR");
		
		
		ac.setAddrtype("home");
		
		detail.setName("soumya");
		detail.setValue("0");
		ac.setDetail(detail);
		
		device1.setName("one plue");
		device1.setValue("nil");
		
		amount.setCurr("indian");
		amount.setValue("10");
		
		
		payee.setCode("1");
		payee.setSeqName("203");
		payee.setType("r3r");
		
		info.setIdentity(identity);
		info.setRating(rating);
		
		payer.setInfo(info);
		payer.setDevice(device1);
		payer.setAmount(amount);
		payer.setAc(ac);
		
		payee.setAmount(amount);
		payee.setAc(ac);
		
		
		
		req.setHead(head);
		req.setTxn(txn);
		req.setPayee(payee);
		req.setPayer(payer);
		
		
		JAXBContext jaxbContext = JAXBContext.newInstance(req.getClass());
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
    
        StringWriter stringWriter = new StringWriter();
        marshaller.marshal(req, stringWriter);
        String xml = stringWriter.toString();

        return xml;
	}
}
