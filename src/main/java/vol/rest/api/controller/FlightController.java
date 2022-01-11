package vol.rest.api.controller;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import vol.rest.api.service.FlightService;

/**
 * Root resource (exposed at "flights" path)
 */
@Path("flights")
public class FlightController {
	/**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "application/json" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
	@GET
	@Produces("application/json; charset=UTF-8")
	public String showFlightsInfo() {
		return new FlightService().toJson(new FlightService().getAllFlights()).toJSONString();
	}
}