/**
 * Copyright (C) 2020 Techcombank
 */
package org.openshift;

import java.util.HashMap;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * @author: TruongLX2
 *
 * Date: Dec 22, 2020
 */

@RequestScoped
@Path("/insult")
public class InsultResource {
	@GET()
	@Produces("application/json")
	public HashMap<String, String> getInsult() {
		HashMap<String, String> theInsult = new HashMap<String, String>();
		theInsult.put("insult", new InsultGenerator().generateInsult());
		return theInsult;
	}
}