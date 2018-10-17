/**
 * 
 */
package com.ibm.tpd.primarydb.util;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;


/**
 * @author AMRITENDUPANDA
 *
 */
public class PersistMsgUtil {

	public static void extractListValuesFromJson(JsonNode parentNode, String jsonProperty, String innerProperty) {
		ObjectMapper objectMapper = new ObjectMapper();
		JsonNode listNode = (ArrayNode)parentNode.path(jsonProperty);
		ArrayNode mynode = objectMapper.createArrayNode();
					
		Iterator<JsonNode> itr = listNode.elements();
		while(itr.hasNext()) {
			JsonNode entry = itr.next().get(innerProperty);
			mynode.add(entry);
			
		}
			
		((ObjectNode)parentNode).remove(jsonProperty);
		((ObjectNode)parentNode).set(jsonProperty,mynode);
	}
	
	public static ArrayNode getListValuesFromJson(JsonNode parentNode, String jsonProperty, String innerProperty) {
		ObjectMapper objectMapper = new ObjectMapper();
		JsonNode listNode = (ArrayNode)parentNode.path(jsonProperty);
		ArrayNode arrayValNode = objectMapper.createArrayNode();
					
		Iterator<JsonNode> itr = listNode.elements();
		while(itr.hasNext()) {
			JsonNode entry = itr.next().get(innerProperty);
			arrayValNode.add(entry);
			
		}
			
		return arrayValNode;
	}
	
	public static String convertToUTCTimeStampInStringFormat(String time) {
		String returnTime = "20";
		returnTime+= time.substring(0, 2) + "-" + time.substring(2,4) + "-"+ time.substring(4,6) + "T" + time.substring(6,8) + ":00:00+0000";
		return returnTime;
	}
	
	

	public static void reArrangeJsonProperty(JsonNode removalNode, JsonNode additionNode, String jsonProperty) {
		((ObjectNode)additionNode).set(jsonProperty, removalNode.get(jsonProperty));
		((ObjectNode)removalNode).remove(jsonProperty);
	}
	
	public static void flattenJsonNode(JsonNode rootNode, String jsonProperty) {
		JsonNode node = rootNode.path(jsonProperty);
		Iterator<Map.Entry<String, JsonNode>> itr = node.fields();
		while(itr.hasNext()) {
			Map.Entry<String, JsonNode> entry = itr.next();
			((ObjectNode)rootNode).set(entry.getKey(),entry.getValue());
		}
		((ObjectNode)rootNode).remove(jsonProperty);
	}
	
	public static void formatJsonPropertyValue(JsonNode removalNode, JsonNode additionNode, String propertyName, String propertyValue) throws IOException{
		ObjectMapper objectMapper = new ObjectMapper();
		String jsonString = "{\""+propertyName+"\":\""+ propertyValue +"\"}";
		JsonNode tempNode = objectMapper.readTree(jsonString);
		
		((ObjectNode)additionNode).set(propertyName, tempNode.get(propertyName));
		((ObjectNode)removalNode).remove(propertyName);
	}
	
	public static void modifyJsonPropertyValue(JsonNode node, String propertyName, String propertyValue) throws IOException{
		ObjectMapper objectMapper = new ObjectMapper();
		String jsonString = "{\""+propertyName+"\":\""+ propertyValue +"\"}";
		JsonNode tempNode = objectMapper.readTree(jsonString);
		
		((ObjectNode)node).set(propertyName, tempNode.get(propertyName));
		
	}
}
