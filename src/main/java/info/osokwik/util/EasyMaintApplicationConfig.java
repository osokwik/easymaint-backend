package info.osokwik.util;

import info.osokwik.backend.UserService;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/rest")
public class EasyMaintApplicationConfig extends Application {
	
    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> set = new HashSet<>();
        set.add(UserService.class);
        return set;
    }
}

