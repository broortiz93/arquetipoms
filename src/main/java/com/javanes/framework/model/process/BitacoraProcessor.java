package com.javanes.framework.model.process;

import java.util.List;
import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.javanes.framework.model.Bitacora;

public class BitacoraProcessor implements Processor{

	@SuppressWarnings("unchecked")
	@Override
	public void process(Exchange exchange) throws Exception {
		
		Map<String, List<Map<String,Object>>> map;
		List<Map<String,Object>> list;

		map = (Map<String, List<Map<String,Object>>>) exchange.getIn().getBody(Map.class);
		list = map.get("#result-set-1");

		if( list != null && list.size()==1) {
			Bitacora bitacora;
			bitacora =  new Bitacora();
			bitacora.setRespuesta((String)list.get(0).get("(expression)"));
			exchange.getOut().setBody(bitacora);
		}else {
 			throw new Exception("No se obtuvo un resultado del Stored Procedure.");
		}
	}

}
