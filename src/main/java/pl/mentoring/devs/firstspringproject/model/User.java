package pl.mentoring.devs.firstspringproject.model;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class User implements BeanNameAware, ApplicationContextAware,
        InitializingBean, DisposableBean {

    @Override
    public void setBeanName(String name) {
        System.out.println("Setting bean name: " + name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Setting application context. ");
    }

    @PostConstruct
    public void postConstructUser() {
        System.out.println("Saving user into data store.");
    }

    @PreDestroy
    public void preDestroyUser() {
        System.out.println("Removing user from data store.");
    }

    public void initUser() {
        System.out.println("Initializing user.");
    }

    public void destroyUser() {
        System.out.println("Removing user account.");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroying bean.");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Setting up user account.");
    }
}
