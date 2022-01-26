package vol.rest.api.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import vol.rest.api.service.CompanyService;
import vol.rest.api.service.FlightService;

/**
 * Root resource (exposed at "companies" path)
 */
@Path("companies")
public class CompanyController {
	
	/**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "application/json" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
	@GET
	@Produces("application/json; charset=UTF-8")
	public String showCompaniesInfo() {
		return new CompanyService().toJson(new CompanyService().getAllCompanies()).toJSONString();
	}
	
    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a application/json response.
     */
	@GET
	@Produces("application/json; charset=UTF-8")
	@Path("/{name}")
	public String showCompanyInfo(@PathParam("name") String name) {
	   return new CompanyService().companyToJson(new CompanyService().getCompanyByName(name.toLowerCase())).toJSONString();
	}
	
    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "application/json" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
	@GET
	@Produces("application/json; charset=UTF-8")
	@Path("/{name}/flights")
	public String showCompanyFlightsInfo(@PathParam("name") String name) {
	   return new FlightService().toJson(new CompanyService().getAllFlightsFromCompany(name.toLowerCase())).toJSONString();
	}
}