package threadlocal.boundary;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.jws.WebService;

import threadlocal.CurrentTimeMillisProvider;
import threadlocal.control.ServiceThreadLocal;

@Stateless
@WebService
@Interceptors(CurrentTimeMillisProvider.class)
public class ServiceFacadeThreadLocal {

    @EJB
    private ServiceThreadLocal service;

    public void performSomeWork() {
        service.serviceInvocation();
    }
}
