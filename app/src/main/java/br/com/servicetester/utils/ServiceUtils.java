package br.com.servicetester.utils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

import br.com.servicetester.asynctask.Servico;

public class ServiceUtils {
	
	public static String executarPost(String path, String json, String token) throws Exception{
		String retorno;
		
		HttpClient httpclient = new DefaultHttpClient();
		HttpPost httpPost = new HttpPost(path);
		httpPost.addHeader("Content-Type", "application/json");
		
		if (token != null){
			if (!token.equals("")){
				httpPost.addHeader("Authorization", "Token " + token);
			}
		}
		
		httpPost.setEntity(new StringEntity(json, "UTF8"));
		HttpResponse response = httpclient.execute(httpPost);
		StatusLine statusLine = response.getStatusLine();

		// se o status da chamada for 200
		if (statusLine.getStatusCode() == HttpStatus.SC_OK) {
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			response.getEntity().writeTo(out);
			out.close();
			retorno = out.toString();
		} else if (statusLine.getStatusCode() == HttpStatus.SC_NO_CONTENT){
			return "204";
		} else {
			// fecha conexoes
			response.getEntity().getContent().close();
			throw new IOException(statusLine.getReasonPhrase());
		}

		return retorno;
	}
	
	public int executarGet(String path, String token) {
		
		HttpClient httpclient = new DefaultHttpClient();
		HttpGet httpGet = new HttpGet(path);
		httpGet.addHeader("Content-Type", "application/json;");
		httpGet.setParams(setTimeout());
		
		if (token != null){
			if (!token.equals("")){
				httpGet.addHeader("Authorization", "Token " + token);
			}
		}
		HttpResponse response;
		try {
			response = httpclient.execute(httpGet);
			StatusLine statusLine = response.getStatusLine();
			
			// se o status da chamada for 200
			if (statusLine.getStatusCode() == HttpStatus.SC_OK ||
					statusLine.getStatusCode() == HttpStatus.SC_NO_CONTENT) {
				ByteArrayOutputStream out = new ByteArrayOutputStream();
				response.getEntity().writeTo(out);
				out.close();
				
				return Servico.OK;
			} else {
				// fecha conexoes
				response.getEntity().getContent().close();
				return Servico.ERRO;
			}
		} catch (Exception e) {
			return Servico.ERRO;
		}
	}
	
	private HttpParams setTimeout() {
		HttpParams httpParameters = new BasicHttpParams();
		int timeoutConnection = 10000;
		HttpConnectionParams.setConnectionTimeout(httpParameters, timeoutConnection);
		int timeoutSocket = 10000;
		HttpConnectionParams.setSoTimeout(httpParameters, timeoutSocket);

		return httpParameters;
		}
}