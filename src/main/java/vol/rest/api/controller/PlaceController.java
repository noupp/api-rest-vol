package vol.rest.api.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import vol.rest.api.service.PlaceService;

/**
 * Root resource (exposed at "Place" path)
 */
@Path("places")
public class PlaceController {
	/**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "application/json" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
	@GET
	@Produces("application/json; charset=UTF-8")
	public String showPlacesInfo() {
		return new PlaceService().toJson(new PlaceService().getAllPlaces()).toJSONString();
	}
	
	/**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "application/json" media type.
     *
     * @return String that will be returned as a application/json response.
     */
	@GET
	@Produces("application/json; charset=UTF-8")
	@Path("/{id}")
	public String showPlaceInfo(@PathParam("id") int id) {
	   return new PlaceService().placeToJson(new PlaceService().getPlaceById(id)).toJSONString();
	}
}