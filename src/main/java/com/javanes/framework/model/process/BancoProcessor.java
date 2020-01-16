package com.javanes.framework.model.process;

import java.util.List;
import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.javanes.framework.model.Banco;

public class BancoProcessor implements Processor{

	@SuppressWarnings("unchecked")
	@Override
	public void process(Exchange exchange) throws Exception {
		
		Map<String, List<Map<String,Object>>> map;
		List<Map<String,Object>> list;

		map = (Map<String, List<Map<String,Object>>>) exchange.getIn().getBody(Map.class);
		list = map.get("#result-set-1");

		if( list != null && list.size()==1) {
			Banco banco;
			banco =  new Banco();
			banco.setCcodret((String)list.get(0).get("ccodret"));
			banco.setCvebanco((String)list.get(0).get("cvebanco"));
			banco.setDescripcion((String)list.get(0).get("descripcion"));
			banco.setTipobanco((String)list.get(0).get("tipobanco"));
			banco.setCvesif((Integer)list.get(0).get("cvesif"));
			banco.setNombrecorto((String)list.get(0).get("nombrecorto"));
			banco.setFlagdomir((String)list.get(0).get("flagdomir"));
			banco.setFlagdomip((String)list.get(0).get("flagdomip"));
			exchange.getOut().setBody(banco);
		}else {
 			throw new Exception("No se obtuvo un resultado del Stored Procedure.");
		}
	}

}
