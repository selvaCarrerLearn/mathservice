package boris.maths;

public class Result {

	private int mathResult;
	private String message;
	
	
	public Result(int mathResult, String message) {
		super();
		this.mathResult = mathResult;
		this.message = message;
	}
	public int getMathResult() {
		return mathResult;
	}
	public void setMathResult(int mathResult) {
		this.mathResult = mathResult;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
