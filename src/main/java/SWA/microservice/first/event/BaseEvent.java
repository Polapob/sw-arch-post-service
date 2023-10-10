package SWA.microservice.first.event;

import java.io.Serializable;
import java.util.Date;

import org.json.JSONObject;

public abstract class BaseEvent implements Serializable {
	private static final long serialVersionUID = 2582721326749681766L;
	public Date publishAt;
	public String publishBy;
	public transient JSONObject data;
	
	public BaseEvent(Date publishAt, String publishBy, JSONObject data) {
		this.publishAt = publishAt;
		this.publishBy = publishBy;
		this.data = data;
	}
}
