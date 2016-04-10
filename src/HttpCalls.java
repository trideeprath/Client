import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;


public class HttpCalls {
	
	private final String USER_AGENT = "Mozilla/5.0";
	
	public Response getAllStudents() throws IOException{
		
		
		String url = "http://localhost:8080/restservices/Student";
		
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		//add request header
		con.setRequestProperty("User-Agent", USER_AGENT);
		
		// optional default is GET
		con.setRequestMethod("GET");

		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'GET' request to URL : " + url);
		System.out.println("Response Code : " + responseCode);

		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append("\n"+inputLine);
		}
		in.close();
		
		Response responseObj = new Response(response.toString(), responseCode);
		//print result
		System.out.println(response.toString());
		
		
		return responseObj;
	}
	
	public Response getStudent(String id) throws IOException{
		
		
		String url = "http://localhost:8080/restservices/Student/"+id;
		
		URL obj=null;
		try {
			obj = new URL(url);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		HttpURLConnection con;
		con = (HttpURLConnection) obj.openConnection();
		
		//add request header
		con.setRequestProperty("User-Agent", USER_AGENT);
		
		// optional default is GET
		con.setRequestMethod("GET");

		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'GET' request to URL : " + url);
		System.out.println("Response Code : " + responseCode);

		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append("\n"+inputLine);
		}
		in.close();
		
		Response responseObj = new Response(response.toString(), responseCode);
		//print result
		System.out.println(response.toString());
		
		
		return responseObj;
	}

	public Response addStudent(String id, String name) throws IOException{
		String url = "http://localhost:8080/restservices/Student";
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		//add reuqest header
		con.setRequestMethod("POST");
		con.setRequestProperty("User-Agent", USER_AGENT);
		con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");

		String urlParameters = "name="+name +"&id="+id;
		
		// Send post request
		con.setDoOutput(true);
		DataOutputStream wr = new DataOutputStream(con.getOutputStream());
		wr.writeBytes(urlParameters);
		wr.flush();
		wr.close();

		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'POST' request to URL : " + url);
		System.out.println("Post parameters : " + urlParameters);
		System.out.println("Response Code : " + responseCode);

		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		

		Response responseObj = new Response(response.toString(), responseCode);
		
		in.close();
		
		//print result
		System.out.println(response.toString());
		return responseObj;
	}

	public Response addExam(String exam, String percentage) throws IOException{
		String url = "http://localhost:8080/restservices/Exam";
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		//add reuqest header
		con.setRequestMethod("POST");
		con.setRequestProperty("User-Agent", USER_AGENT);
		con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");

		String urlParameters = "name="+exam +"&percentage="+percentage;
		
		// Send post request
		con.setDoOutput(true);
		DataOutputStream wr = new DataOutputStream(con.getOutputStream());
		wr.writeBytes(urlParameters);
		wr.flush();
		wr.close();

		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'POST' request to URL : " + url);
		System.out.println("Post parameters : " + urlParameters);
		System.out.println("Response Code : " + responseCode);

		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		

		Response responseObj = new Response(response.toString(), responseCode);
		
		in.close();
		
		//print result
		System.out.println(response.toString());
		return responseObj;
	}
	
	public Response enterMarks(String id, String exam, String feedback, String grade) throws IOException{
		
		String url = "http://localhost:8080/restservices/Student/" + id +"/"+exam;
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		//add reuqest header
		con.setRequestMethod("PUT");
		con.setRequestProperty("User-Agent", USER_AGENT);
		con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");

		String urlParameters = "feedback="+feedback +"&marks="+grade;
		
		
		
		// Send post request0
		con.setDoOutput(true);
		DataOutputStream wr = new DataOutputStream(con.getOutputStream());
		wr.writeBytes(urlParameters);
		wr.flush();
		wr.close();

		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'PUT' request to URL : " + url);
		System.out.println("PUT parameters : " + urlParameters);
		System.out.println("Response Code : " + responseCode);

		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		

		Response responseObj = new Response(response.toString(), responseCode);
		
		in.close();
		
		//print result
		System.out.println(response.toString());
		return responseObj;
	}

	
	public Response deleteMarks(String id, String exam) throws IOException{
		
		String url = "http://localhost:8080/restservices/Student/" + id +"/"+exam;
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		//add reuqest header
		con.setRequestMethod("DELETE");
		con.setRequestProperty("User-Agent", USER_AGENT);
		con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");

		//String urlParameters = "feedback="+feedback +"&marks="+grade;
		
		
		
		// Send post request0
		//con.setDoOutput(true);
		//DataOutputStream wr = new DataOutputStream(con.getOutputStream());
		//wr.writeBytes("");
		//wr.flush();
		//wr.close();

		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'DEL' request to URL : " + url);
		//System.out.println("PUT parameters : " + urlParameters);
		System.out.println("Response Code : " + responseCode);

		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		

		Response responseObj = new Response(response.toString(), responseCode);
		
		in.close();
		
		//print result
		System.out.println(response.toString());
		return responseObj;
	}

	

	public Response deleteExam(String exam) throws IOException{
		
		//http://localhost:8080/restservices/Exam/?exam=Mid
		
		String url = "http://localhost:8080/restservices/Exam/"+exam;
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		//add reuqest header
		con.setRequestMethod("DELETE");
		con.setRequestProperty("User-Agent", USER_AGENT);
		con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");

		
		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'DEL' request to URL : " + url);
		//System.out.println("PUT parameters : " + urlParameters);
		System.out.println("Response Code : " + responseCode);

		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		

		Response responseObj = new Response(response.toString(), responseCode);
		
		in.close();
		
		//print result
		System.out.println(response.toString());
		return responseObj;
	}

}
