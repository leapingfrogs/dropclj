package dropclj;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/hello")
public class HelloResource {
    @GET
    public String get() {
        return "Hello World";
    }
}
