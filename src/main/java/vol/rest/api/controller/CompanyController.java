package vol.rest.api.controller;

import org.json.simple.JSONArray;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import vol.rest.api.service.CompanyService;

/**
 * Root resource (exposed at "compagnie" path)
 */
@Path("compagnie")
public class CompanyController {
	
	/**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
	@GET
	@Produces("application/json; charset=UTF-8")
	public String showCompaniesInfo() {
		return new CompanyService().toJson().toJSONString();
	}
	
    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
	@GET
	@Produces("text/html; charset=UTF-8")
	@Path("/{name}")
	public String showCompanyInfo(@PathParam("name") String name) {
	   return "Information à propos de : " + name;
	}
}