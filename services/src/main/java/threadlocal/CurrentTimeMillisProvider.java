package threadlocal;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class CurrentTimeMillisProvider {

    @AroundInvoke
    public Object injectMap(InvocationContext ic) throws Exception {
        ThreadLocalContextHolder.put(RegistryKey.KEY.name(), System.currentTimeMillis());
        return ic.proceed();
    }

}
