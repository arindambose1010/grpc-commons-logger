package comm.grpc.logger.entity;

import java.io.Serializable;

import com.google.gson.GsonBuilder;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class LogMessageBuilder implements Serializable{
	private static final long serialVersionUID = 1L;
	private String type;
	private String logMessage;
	private String logTime;
	
	@Override
	public String toString() {
		return new GsonBuilder().create().toJson(this);
	}
   
 
}
