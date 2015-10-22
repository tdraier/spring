package org.jahia.modules.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * TODO Comment me
 *
 * @author toto
 */
public class TestBean {
    private static Logger logger = LoggerFactory.getLogger(Activator.class);

    public void start() {
        logger.info("Bean started");
    }

}
