package org.openfact.services.resources;

public class RobotsResourceImpl implements RobotsResource {

    private static final String robots = "User-agent: *\n" + "Disallow: /";

    public String getRobots() {
        return robots;
    }

}
