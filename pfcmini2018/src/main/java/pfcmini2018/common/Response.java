package pfcmini2018.common;

public class Response {

	private Request request;
	private String state;
	private String jsonresponse;
	
	public Response() {
		this.state="OK";
		this.request=new Request();
	}
	
	public Response(Request request){
		this();
		this.request=request;
	}
	public Request getRequest() {
		return request;
	}
	public void setRequest(Request request) {
		this.request = request;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getJsonresponse() {
		return jsonresponse;
	}
	public void setJsonresponse(String jsonresponse) {
		this.jsonresponse = jsonresponse;
	}

	@Override
	public String toString() {
		return "Response [request=" + request + ", state=" + state + ", jsonresponse=" + jsonresponse + "]";
	}
	
	
}
