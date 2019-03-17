package org.deri.grefine.rdf;

import java.io.IOException;

import org.deri.grefine.util.TestUtils;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class LinkTest {
	
	private ObjectMapper mapper = new ObjectMapper();
	
	@Test
	public void serializeLinkNoTarget() throws JsonParseException, JsonMappingException, IOException {
		String json = "{\n" + 
				"       \"curie\" : \"http://my.curie/\",\n" + 
				"       \"uri\" : \"http://my.uri/\"\n" + 
				"     }";
		Link link = mapper.readValue(json, Link.class);
		TestUtils.isSerializedTo(link, json);
	}
}
