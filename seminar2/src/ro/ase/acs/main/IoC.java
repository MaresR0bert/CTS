package ro.ase.acs.main;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class IoC {

    private static Map<Class, Class> mapTemplate = new HashMap<>();

    public void register(Class<?> contract, Class<?> implementation) {
        mapTemplate.put(contract, implementation);
    }

    public <T> T resolve(Class<?> contract) {
        try {
            return (T) mapTemplate.get(contract).getDeclaredConstructor().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return null;
    }
}