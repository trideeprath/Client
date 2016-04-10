
public class Response {
	public String responseString;
	public int code;
	
	Response(String response, int code){
		this.responseString = response;
		this.code = code;
	}
	
	public String getResponse(){
		return responseString;
	}
	public int getCode(){
		return code;
	}
}
