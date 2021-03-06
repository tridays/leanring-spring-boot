package demo.dal.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

import demo.common.Config;

@Configuration
@Import(Config.class)
@ComponentScan(basePackages = {"demo.dal.aspect"})
@EnableAspectJAutoProxy
public class AspectConfig {

}
