package cn.homjie.boot.start.config;

public class CustomErrorType extends GsonEntity {

	private static final long serialVersionUID = -7194644162083074552L;

	private int errorCode;

	private String errorMessage;

	public CustomErrorType(int errorCode, String errorMessage) {
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

}
