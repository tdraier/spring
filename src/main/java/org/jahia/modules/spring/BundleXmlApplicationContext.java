package org.jahia.modules.spring;

import org.osgi.framework.Bundle;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.util.Assert;

/**
 * TODO Comment me
 *
 * @author toto
 */
public class BundleXmlApplicationContext extends AbstractXmlApplicationContext {
    private Resource[] resources;

    public BundleXmlApplicationContext() {
    }

    public BundleXmlApplicationContext(Bundle bundle, String configLocation) throws BeansException {
        resources = new Resource[]{ new UrlResource(bundle.getResource(configLocation)) };
        setClassLoader(getClass().getClassLoader());
        this.refresh();
    }

    protected Resource[] getConfigResources() {
        return resources;
    }
}
