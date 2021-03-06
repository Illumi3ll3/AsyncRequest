package sv3.sv3;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
	@GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/{id}")
    public String getIt(@PathParam("id") String MessageId) throws InterruptedException{ 
         
           System.out.println(Thread.currentThread().getName());
        return "Got it!"+ MessageId;
    }
}
