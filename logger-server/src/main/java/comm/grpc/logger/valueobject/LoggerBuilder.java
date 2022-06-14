package comm.grpc.logger.valueobject;

import com.google.gson.GsonBuilder;

import lombok.Builder;

@Builder
public class LoggerBuilder {
   private String appName;
   private String className;
   private String methodName;
   private String type;
   private String requestLogMessage;
   private String responseLogMessage;
   private String logTime;
   
	@Override
	public String toString() {
		return new GsonBuilder().create().toJson(this);
	}
   
   
}
