package edu.bjtu.activiti.config;

import lombok.AllArgsConstructor;
import org.activiti.spring.SpringProcessEngineConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

@Configuration
@AllArgsConstructor
public class ActivitiConfig {
    private DataSource dataSource;
    private PlatformTransactionManager platformTransactionManager;

    @Bean
    public SpringProcessEngineConfiguration getProcessEngineConfiguration() {
        SpringProcessEngineConfiguration config = new SpringProcessEngineConfiguration();
        // 流程图字体设置
        config.setActivityFontName("宋体");
        config.setAnnotationFontName("宋体");
        config.setLabelFontName("黑体");

        config.setDataSource(dataSource);
        config.setTransactionManager(platformTransactionManager);
        config.setDatabaseType("mysql");
        config.setDatabaseSchemaUpdate("true");
        return config;
    }
}
