package vol.rest.api.controller;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import vol.rest.api.service.CompanyService;
import vol.rest.api.service.FlightService;
import vol.rest.api.service.PlaceService;

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
	
	/**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a application/json response.
     */
	@GET
	@Produces("application/json; charset=UTF-8")
	@Path("/{id}")
	public String showFlightInfo(@PathParam("id") int id) {
	   return new FlightService().flightToJson(new FlightService().getFlightById(id)).toJSONString();
	}
	
	/**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a application/json response.
     */
	@GET
	@Produces("application/json; charset=UTF-8")
	@Path("/{id}/places")
	public String showFlightPlacesInfo(@PathParam("id") int id) {
	   return new PlaceService().toJson(new FlightService().getAllPlacesFromFlight(id)).toJSONString();
	}
}