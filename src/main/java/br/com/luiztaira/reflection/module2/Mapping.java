package br.com.luiztaira.reflection.module2;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class Mapping {

    public Map<Class<?>, Class<?>> map = new HashMap<>();

    public void load(String fileName) throws Exception {
        Properties p = new Properties();
        p.load(new FileInputStream(fileName));
        for (Object key: p.keySet()){
            Class<?> _interface = Class.forName(key.toString());
            Class<?> _impl = Class.forName(p.get(key).toString());
            if (!_interface.isInterface())
                throw new RuntimeException(_interface + " is not a interface");
            if (!_interface.isAssignableFrom(_impl))
                throw new RuntimeException(_impl + " does not implement " + _interface);
            map.put(_interface, _impl);
        }
    }

    public Class<?> getImpl(Class _interface){
        return map.get(_interface);
    }
}
