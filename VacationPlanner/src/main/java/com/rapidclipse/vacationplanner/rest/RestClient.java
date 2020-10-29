
package com.rapidclipse.vacationplanner.rest;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import com.rapidclipse.vacationplanner.entities.LinkPreviewResult;


public class RestClient
{
	public static LinkPreviewResult link(final String url)
	{
		final String linkPrevURL = "http://api.linkpreview.net/?key=eb95dc80c81e0c65e064ec1c1b0b9c7a";

		final WebTarget target  = ClientBuilder.newClient().target(linkPrevURL).queryParam("q", url);
		final Builder   request = target.request(MediaType.APPLICATION_JSON);

		return request.get(LinkPreviewResult.class);
	}
}
