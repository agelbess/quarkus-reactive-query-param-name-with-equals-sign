package org.acme;

import io.smallrye.mutiny.Uni;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import java.util.HashMap;
import java.util.Map;

@Path("")
public class ReactiveGreetingResource {

    @RestClient
    PsRestClient psRestClient;

    @GET
    @Path("/start")
    public Uni<Map<String, String>> get() {
        return psRestClient.ps("1", "2", "3", "4", "5", "6");
    }

    @GET
    @Path("/ps")
    public Map<String, String> getPs(
            @QueryParam("p1") String p1,
            @QueryParam("p2(") String p2,
            @QueryParam("p3[") String p3,
            @QueryParam("p4?") String p4,
            @QueryParam("p5=") String p5,
            @QueryParam("p6-") String p6) {
        Map<String, String> map = new HashMap<>();
        map.put("p1", p1);
        map.put("p2", p2);
        map.put("p3", p3);
        map.put("p4", p4);
        map.put("p5", p5);
        map.put("p6", p6);
        return map;
    }
}
