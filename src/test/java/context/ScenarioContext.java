package context;

import enums.Context;

import java.util.HashMap;
import java.util.Map;

public class ScenarioContext {

    public static Map<String, Object> scenarioContext = new HashMap<>();

    public static void setContext(Context key, Object value) {
        scenarioContext.put(key.toString(), value);
    }

    public static Object getContex(Context key) {
        return scenarioContext.get(key.toString());
    }

    public static Boolean isContains(Context key) {
        return scenarioContext.containsKey(key.toString());
    }
}