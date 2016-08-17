package cn.homjie.boot.start.config;

import java.io.Serializable;

public class GsonEntity implements Serializable {

	private static final long serialVersionUID = 6007477287460833205L;

	public String toJson() {
		return Constants.GSON.toJson(this);
	}
}
