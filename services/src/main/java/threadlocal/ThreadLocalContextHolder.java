package threadlocal;

import java.util.HashMap;
import java.util.Map;

public class ThreadLocalContextHolder {

    private static final ThreadLocal<Map<String, Object>> THREAD_WITH_CONTEXT = new ThreadLocal<Map<String, Object>>();

    private ThreadLocalContextHolder() {
    }

    public static void put(String key, Object payload) {
        if (THREAD_WITH_CONTEXT.get() == null) {
            THREAD_WITH_CONTEXT.set(new HashMap<String, Object>());
        }
        THREAD_WITH_CONTEXT.get().put(key, payload);
    }

    public static Object get(String key) {
        return THREAD_WITH_CONTEXT.get().get(key);
    }

    public static void cleanupThread() {
        THREAD_WITH_CONTEXT.remove();
    }

}
