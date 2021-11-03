package org.acme;

import io.smallrye.mutiny.Uni;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import java.util.Map;

@RegisterRestClient
public interface PsRestClient {

    @GET
    @Path("ps")
    public Uni<Map<String, String>> ps(@QueryParam("p1") String p1,
                                       @QueryParam("p2(") String p2,
                                       @QueryParam("p3[") String p3,
                                       @QueryParam("p4?") String p4,
                                       @QueryParam("p5=") String p5,
                                       @QueryParam("p6-") String p6);
}
