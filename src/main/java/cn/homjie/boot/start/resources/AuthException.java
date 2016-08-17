package cn.homjie.boot.start.resources;

public class AuthException extends RuntimeException {

	private static final long serialVersionUID = -3737370477852678925L;

	public AuthException() {
		super("没有权限");
	}

}
