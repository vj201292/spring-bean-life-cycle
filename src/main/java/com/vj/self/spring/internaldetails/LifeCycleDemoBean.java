package com.vj.self.spring.internaldetails;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {
    
    static {
        System.out.println("**********LifeCycleDemoBean class loaded in memory");
    }


    public LifeCycleDemoBean() {
        System.out.println("***********I'm in the LifeCycleBean Constructor");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("*************afterPropertiesSet() method called");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("**************Destroy method called");
        
    }
    
    @PostConstruct
    public void postConstruct(){
        System.out.println("*******************postConstruct() of-- LifeCycleDemoBean Class called");
        
    }
    
    @PreDestroy
    public void preDestroy(){
        System.out.println("********************preDestroy() called");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("********************setBeanName() called"+s);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("********************setBeanFactory() called");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("********************setApplicationContext() called");
    }

    public void beforeInit(){
        System.out.println("## - Before Init - Called by Bean Post Processor");
    }

    public void afterInit(){
        System.out.println("## - After init called by Bean Post Processor");
    }
}
