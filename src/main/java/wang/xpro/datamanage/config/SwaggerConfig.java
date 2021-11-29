package wang.xpro.datamanage.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.ArrayList;
/*

@Configuration
public class SwaggerConfig {
    @Bean
    public Docket docketDefault(Environment environment) {
        Profiles profiles = Profiles.of("dev", "test");

        boolean acceptsProfiles = environment.acceptsProfiles(profiles);

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("Latest")//组名称
                .enable(acceptsProfiles)
                .select()
                */
/**
                 * RequestHandlerSelectors配置扫描接口的方式
                 *      basePackage 配置要扫描的包
                 *      any 扫描全部
                 *      none 不扫描
                 *      withClassAnnotation 扫描类上的注解
                 *      withMethodAnnotation 扫描方法上的注解
                 *//*

                .apis(RequestHandlerSelectors.basePackage("wang.xpro.datamanage.controller"))
                */
/**
                 * paths() 扫描过滤方式
                 *      any过滤全部
                 *      none不过滤
                 *      regex正则过滤
                 *      ant过滤指定路径
                 *//*

                //                .paths(PathSelectors.ant("/login/**"))
                .build();
    }

    @Bean
    public Docket docketVersion1(Environment environment) {
        Profiles profiles = Profiles.of("dev", "test");

        boolean acceptsProfiles = environment.acceptsProfiles(profiles);

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("v1.0")//组名称
                .enable(acceptsProfiles)
                .select()
                */
/**
                 * RequestHandlerSelectors配置扫描接口的方式
                 *      basePackage 配置要扫描的包
                 *      any 扫描全部
                 *      none 不扫描
                 *      withClassAnnotation 扫描类上的注解
                 *      withMethodAnnotation 扫描方法上的注解
                 *//*

                .apis(RequestHandlerSelectors.basePackage("wang.xpro.datamanage.controller"))
                */
/**
                 * paths() 扫描过滤方式
                 *      any过滤全部
                 *      none不过滤
                 *      regex正则过滤
                 *      ant过滤指定路径
                 *//*

                //                .paths(PathSelectors.ant("/login/**"))
                .build();
    }

    @Bean
    public Docket docketVersion2(Environment environment) {
        Profiles profiles = Profiles.of("dev", "test");

        boolean acceptsProfiles = environment.acceptsProfiles(profiles);

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("v2.0")//组名称
                .enable(acceptsProfiles)
                .select()
                */
/**
                 * RequestHandlerSelectors配置扫描接口的方式
                 *      basePackage 配置要扫描的包
                 *      any 扫描全部
                 *      none 不扫描
                 *      withClassAnnotation 扫描类上的注解
                 *      withMethodAnnotation 扫描方法上的注解
                 *//*

                .apis(RequestHandlerSelectors.basePackage("wang.xpro.datamanage.controller"))
                */
/**
                 * paths() 扫描过滤方式
                 *      any过滤全部
                 *      none不过滤
                 *      regex正则过滤
                 *      ant过滤指定路径
                 *//*

                //                .paths(PathSelectors.ant("/login/**"))
                .build();
    }


    */
/**
     * 配置swagger2信息 =apiInfo
     * @return
     *//*

    public ApiInfo apiInfo(){
        */
/*作者信息*//*

        //        Contact contact = new Contact("XXX", "http://baidu.com", "email");
        Contact contact = new Contact("b1tzer", "https://blog.xpro.wang", "wk983843@gmail.com");
        return new ApiInfo(
                "DataManage's API Doc",
                "",
                "V1.0",
                "https://blog.xpro.wang",
                contact,
                "Apache 2.0",
                "https://www.apache.org/licenses/LICENSE-2.0",
                new ArrayList());
    }
}
*/
