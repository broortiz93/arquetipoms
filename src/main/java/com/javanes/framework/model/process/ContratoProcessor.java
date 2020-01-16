package com.javanes.framework.model.process;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.javanes.framework.model.Contrato;

public class ContratoProcessor implements Processor{

	@SuppressWarnings("unchecked")
	@Override
	public void process(Exchange exchange) throws Exception {
		List<Map<String,Object>> list;
		List<Contrato> outList;
		
		list = exchange.getIn().getBody(List.class);
		outList =  new ArrayList<>();
		
		for( Map<String, Object> x: list) {
			Contrato contrato;
			contrato = new Contrato();
			contrato.setFolioContrato((String) x.get("folio_contrato"));
			contrato.setIdStatus( (Short) x.get("id_status"));
			outList.add(contrato);
		}
		
		exchange.getOut().setBody(outList);
		
	}

}
