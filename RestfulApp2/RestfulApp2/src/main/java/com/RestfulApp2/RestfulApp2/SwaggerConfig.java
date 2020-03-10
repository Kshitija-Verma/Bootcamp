//package com.RestfulApp2.RestfulApp2;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.service.Contact;
//import springfox.documentation.service.VendorExtension;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
////import javax.xml.bind.annotation.XmlType;
//import java.util.ArrayList;
//
//@Configuration
//@EnableSwagger2
//public class SwaggerConfig {
//
//    public static final Contact DEFAULT_CONTACT = new Contact("Kshitija Verma", "http://tothenew.com", "kshitija.verma@tothenew.com");
//    public static final ApiInfo DEFAULT_API_INFO = new ApiInfo("RestFul Api ",
//            "RestFul api part 2 Documentation", "1.0", "urn:tos",
//            DEFAULT_CONTACT, "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0", new ArrayList<VendorExtension>());
//
//    @Bean
//   public Docket api(){
//        return new Docket(DocumentationType.SWAGGER_2).apiInfo(DEFAULT_API_INFO);
//    }
//
//}
