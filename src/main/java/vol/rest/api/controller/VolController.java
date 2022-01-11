package vol.rest.api.controller;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import vol.rest.api.service.VolService;

/**
 * Root resource (exposed at "Vol" path)
 */
@Path("flights")
public class VolController {
	/**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
	@GET
	@Produces("application/json; charset=UTF-8")
	public String showVolsInfo() {
		return new VolService().toJson(new VolService().getAllVols()).toJSONString();
	}
}