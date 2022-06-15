# grpc-logger
Description : create a common logger with grpc. This is an application via which we can create a custom logger app. we can make log centralized. It is consits with 
following projects
logger-interface 
logger-service
logger-client

# Technology :
java 11
Spring boot
GRPC for inter service communication

# future scope :
any DB will use for logger storing mechanism 
need to handle customised logger 

# How to use :

1. add into pom.xml
    <dependency>
	<groupId>logger-client</groupId>
	<artifactId>logger-client</artifactId>
	<version>0.0.1</version>
</dependency>

2. Add configuration java file     
@Configuration
public class LoggerConfig {

	@Bean
	public LogGenerater logGenerater() {
	    return LogGeneraterImpl.builder().build();
	}
	
	@Bean
	public LogMessageGenerater logMessageGenerater() {
	    return LogMessageGeneraterImpl.builder().build();
	}
}

3. Add @Import at main class  
  @SpringBootApplication
  @Import(value= {LoggingAspect.class})
  
4. Simple Annotation to handle logger
    @Log(name = "XXX")  By Useing it before method we can log input/output details
6. Normal logger facility
   By calling info() and error() method we can store log 
   
