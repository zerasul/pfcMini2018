package pfcmini2018.common;

import java.util.HashMap;
import java.util.Map;

public class Request {

	private String backend;
	private String operation;
	private Map<String, Object> Parameters;
	
	public Request() {
		this.Parameters= new HashMap<>();
	}
	public String getBackend() {
		return backend;
	}
	public void setBackend(String backend) {
		this.backend = backend;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	public Map<String, Object> getParameters() {
		return Parameters;
	}
	public void setParameters(Map<String, Object> parameters) {
		Parameters = parameters;
	}
	@Override
	public String toString() {
		return "Request [backend=" + backend + ", operation=" + operation + ", Parameters=" + Parameters + "]";
	}
	
	
}
