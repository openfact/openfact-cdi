package org.openfact.wildfly.swarm.it;

import java.util.List;

public class Log {

    private final List<String> lines;

    public Log(List<String> lines) {
        this.lines = lines;
    }

    public List<String> getLines() {
        return this.lines;
    }
    
}
