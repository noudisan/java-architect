package com.base.util;

import org.springframework.stereotype.Component;

import java.io.InputStream;
import java.util.Properties;

@Component
public class GlobalConfiguration {

    public volatile static String IMAGE_ARCHITECT_URL;

    public GlobalConfiguration() {
    }

    static {
        try {
            org.apache.ibatis.logging.LogFactory.useLog4JLogging();
            InputStream stream = GlobalConfiguration.class.getClassLoader().getResourceAsStream("/config/conf.properties");
            if (stream != null) {
                Properties properties = new Properties();
                properties.load(stream);
                IMAGE_ARCHITECT_URL = properties.getProperty("image.architect.url");
            }
        } catch (Exception e) {
            new Exception("初始化资源发生异常");
            System.exit(1);
        }
    }
}
