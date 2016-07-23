package org.openfact.models.auth;

import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alex Pariona-"alexpariona@openfact.com" on 23/07/2016.
 */

public class HeaderHandlerResolver implements HandlerResolver {

    @Override
    public List<Handler> getHandlerChain(PortInfo portInfo) {
        List<Handler> handlerChain = new ArrayList<>();
        HeaderHandler hh = new HeaderHandler();
        handlerChain.add(hh);
        return handlerChain;
    }

}