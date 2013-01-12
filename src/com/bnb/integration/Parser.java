package com.bnb.integration;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.bnb.util.Util;
import com.bnb.ws.cnpj.ArrayOfBNBCNPJPerfil1;
import com.bnb.ws.cpf.ArrayOfBNBPessoaPerfil1;

public class Parser {
	
	/**
	 * Changing implementation according message input formatting
	 * 
	 * @param mqText data from the MQ
	 * @return List of message to be used as argument in the WS
	 */
	public List<String> parseFromMQToWS(List<String> mqText)
	{
		 
		List<String> wsMessages = new ArrayList<String>();
		
		for (String each : mqText)
		{
			each = getMessage(each);
			Util.info("Dados recebidos: " + each);
			wsMessages.add(each);
		}
		
		return wsMessages;
	}
	
	
	
	/**
	 * Read the message and returns its data
	 * @param message
	 * @return String with the messages datas
	 */
	public String getMessage(String message){
		
		//Exemplo de uma mensagem de entrada: 2003603050001040351133739910351133739903511337399103511337399035113373991035113373990351133739920036030500010403511337399
		
		Pattern pattern = Pattern.compile("1\\d{22}|2\\d{25}");

		Matcher matcher = pattern.matcher(message);
		
		StringBuilder out = new StringBuilder("");

		//Vai lendo a mensagem por blocos de tipos de dados e vai retornando os dados contido na mensagem.
		while (matcher.find()) {
			out.append("[" + translateData(matcher.group()) + "]");
		}
		
		return out.toString();
		
	}
	
	/**
	 * Understands the message data
	 * @param data
	 * @return String with the message data
	 */
	public String translateData(String data){
		String tipoDado = data.substring(0, 1);
		
		if ("1".equals(tipoDado)) {			
			return "TIPO_DADO: " + tipoDado + " CPF: " + data.substring(1, 12) + " CPF_Usuario: " + data.substring(12, 23);

		} else if ("2".equals(tipoDado)) {
			return "TIPO_DADO: " + tipoDado + " CNPJ: " + data.substring(1, 15) + " CPF_Usuario: " + data.substring(15, 26);
		}
		
		return "mensagem inv�lida";
		
	}
	
	
	public String parseFromWSToMQ(Object wsText)
	{
		//tipodedado//cpf/cnpj//status//mensagem_erro
		if (wsText instanceof ArrayOfBNBCNPJPerfil1)
		{			
			StringBuilder builderMessage = new StringBuilder();

			
			
		} else if (wsText instanceof ArrayOfBNBPessoaPerfil1)
		{
			//do a for loop to public each data into MQArrayOfBNBPessoaPerfil2
		}
		
		return null;
	}
	

}