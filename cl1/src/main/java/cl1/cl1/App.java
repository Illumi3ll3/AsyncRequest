package cl1.cl1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   final Client client=ClientBuilder.newClient();
		   final AtomicInteger i=new AtomicInteger();
		
			   ExecutorService service=Executors.newFixedThreadPool(4);
			   while(true)
			   service.execute(new Runnable() {
				int j=i.incrementAndGet();
				public void run() {
					// TODO Auto-generated method stub
					try{
						
					   Response response=  client.target("http://localhost:8080/sv3/webapi/myresource/"+j).request().get();
				        System.out.println(j+" "+ response.readEntity(String.class));	
					}
				        catch(Exception e){
				        	
				        }
				}
			});
	     
		  }
}
