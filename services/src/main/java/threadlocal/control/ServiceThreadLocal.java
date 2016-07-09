package threadlocal.control;

import javax.ejb.Stateless;

import threadlocal.RegistryKey;
import threadlocal.ThreadLocalContextHolder;

@Stateless
public class ServiceThreadLocal {

    public void serviceInvocation() {
        Long millis = (Long) ThreadLocalContextHolder.get(RegistryKey.KEY.name());
        System.out.print("Content is " + millis);
    }

}
