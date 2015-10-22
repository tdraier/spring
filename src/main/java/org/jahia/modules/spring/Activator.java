package org.jahia.modules.spring;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.net.URLStreamHandler;

/**
 * TODO Comment me
 *
 * @author toto
 */
public class Activator implements BundleActivator {
    private static Logger logger = LoggerFactory.getLogger(Activator.class);
    private BundleXmlApplicationContext applicationContext;

    @Override
    public void start(BundleContext context) throws Exception {
        logger.info("Bundle started");
        applicationContext = new BundleXmlApplicationContext(context.getBundle(),"/META-INF/spr/spring.xml");
        applicationContext.start();
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        logger.info("Bundle stopped");
        applicationContext.stop();
    }
}
