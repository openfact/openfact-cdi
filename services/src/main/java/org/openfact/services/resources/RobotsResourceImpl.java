package org.openfact.services.resources;

import javax.ejb.Stateless;

@Stateless
public class RobotsResourceImpl implements RobotsResource {

    private static final String robots = "User-agent: *\n" + "Disallow: /";

    public String getRobots() {
        return robots;
    }

}
