/**
 * 
 */
package com.ibm.tpd.primarydb.util;

import org.junit.Test;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.io.IOException;
import java.util.Iterator;

/**
 * @author AMRITENDUPANDA
 *
 */

public class PersistMsgUtilTest {

	
	
	@Test
	public void whenExtractListValuesFromJsonCalledVerified(){
		
		ObjectMapper objectMapper = new ObjectMapper();
		JsonNode node = (JsonNode)objectMapper.createObjectNode();
		ArrayNode listNode = objectMapper.createArrayNode();
		
		for(int i=0;i<3;i++) {
					
			int increment = 1;
			String value ="upui1" + increment++;
			String jsonString = "{\"upUI1\":\""+ value +"\"}";
			JsonNode tempNode = null;
			try {
				tempNode = objectMapper.readTree(jsonString);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			listNode.add(tempNode);
		}
		((ObjectNode)node).set("upUI1s", listNode);
		
		PersistMsgUtil.extractListValuesFromJson(node, "upUI1s", "upUI1");		
		Iterator<JsonNode> it = node.get("upUI1s").elements();
		String actualValue="";
		while(it.hasNext()) {
			actualValue = it.next().asText();
			break;
			
		}
		assertEquals("upui11", actualValue);
		
	}
	
	
	@Test
	public void convertToUTCTimeStampInStringFormatTest() {
		String time = "18093010";
		
		String expectedTimestamp = "2018-09-30T10:00:00+0000";
		assertEquals(expectedTimestamp, PersistMsgUtil.convertToUTCTimeStampInStringFormat(time));
				
	}
	
	@Test
	public void whenReArrangeJsonPropertyCalledVerified(){
		
		ObjectMapper objectMapper = new ObjectMapper();
		JsonNode node = (JsonNode)objectMapper.createObjectNode();
		JsonNode childNode = (JsonNode)objectMapper.createObjectNode();
		String jsonString1 = "{\"key1\":\"value1"+"\"}";
		String jsonString2 = "{\"key2\":\"value2"+"\"}";
		JsonNode childNodeLevel1 = null;
		try {
			childNodeLevel1 = objectMapper.readTree(jsonString1);
		} catch (IOException e) {
			e.printStackTrace();
		}
		JsonNode childNodeLevel2 = null;
		try {
			childNodeLevel2 = objectMapper.readTree(jsonString2);
		} catch (IOException e) {
			e.printStackTrace();
		}
		((ObjectNode)childNode).set("innerField1", childNodeLevel1);
		((ObjectNode)childNode).set("innerField2", childNodeLevel2);
		
		((ObjectNode)node).set("example", childNode);
		
		PersistMsgUtil.reArrangeJsonProperty(childNodeLevel1, childNode, "key1");
		assertEquals("value1", childNode.get("key1").asText());
	}
	
	
	@Test
	public void whenFormatJsonPropertyValueCalledVerify() throws Exception{
		
		ObjectMapper objectMapper = new ObjectMapper();
		JsonNode node = (JsonNode)objectMapper.createObjectNode();
		JsonNode childNode = (JsonNode)objectMapper.createObjectNode();
		String jsonString1 = "{\"key1\":\"value1"+"\"}";
		String jsonString2 = "{\"key2\":\"value2"+"\"}";
		JsonNode childNodeLevel1 = objectMapper.readTree(jsonString1);
		
		JsonNode childNodeLevel2 = objectMapper.readTree(jsonString2);
		
		((ObjectNode)childNode).set("innerField1", childNodeLevel1);
		((ObjectNode)childNode).set("innerField2", childNodeLevel2);
		
		((ObjectNode)node).set("example", childNode);
		
		PersistMsgUtil.formatJsonPropertyValue(childNodeLevel1, childNode, "key1", "SomeotherValue");
		assertEquals("SomeotherValue", childNode.get("key1").asText());
	}
	
	@Test
	public void whenFlattenJsonNodeCalledVerify() throws Exception{
		
		ObjectMapper objectMapper = new ObjectMapper();
		JsonNode node = (JsonNode)objectMapper.createObjectNode();
		JsonNode childNode = (JsonNode)objectMapper.createObjectNode();
		String jsonString1 = "{\"key1\":\"value1"+"\"}";
		String jsonString2 = "{\"key2\":\"value2"+"\"}";
		JsonNode childNodeLevel1 = objectMapper.readTree(jsonString1);
		
		JsonNode childNodeLevel2 = objectMapper.readTree(jsonString2);
		
		((ObjectNode)childNode).set("innerField1", childNodeLevel1);
		((ObjectNode)childNode).set("innerField2", childNodeLevel2);
		
		((ObjectNode)node).set("example", childNode);
		
		PersistMsgUtil.flattenJsonNode(childNode, "innerField1");
		assertEquals("value1",childNode.get("key1").asText());
		
	}
	
	
	@Test
	public void whenModifyJsonPropertyValueCalledVerify() throws Exception{
		
		ObjectMapper objectMapper = new ObjectMapper();
		JsonNode node = (JsonNode)objectMapper.createObjectNode();
		JsonNode childNode = (JsonNode)objectMapper.createObjectNode();
		String jsonString1 = "{\"key1\":\"value1"+"\"}";
		String jsonString2 = "{\"key2\":\"value2"+"\"}";
		JsonNode childNodeLevel1 = objectMapper.readTree(jsonString1);
		
		JsonNode childNodeLevel2 = objectMapper.readTree(jsonString2);
		
		((ObjectNode)childNode).set("innerField1", childNodeLevel1);
		((ObjectNode)childNode).set("innerField2", childNodeLevel2);
		
		((ObjectNode)node).set("example", childNode);
		
		PersistMsgUtil.modifyJsonPropertyValue(childNodeLevel1, "key1", "SomeotherValue");
		
		assertEquals("SomeotherValue", childNodeLevel1.get("key1").asText());
		
	}
	
	
}
