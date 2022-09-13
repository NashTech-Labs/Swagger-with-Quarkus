package org.knoldus.swagger;

import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.info.License;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import javax.ws.rs.core.Application;

@OpenAPIDefinition(
        tags = {
                @Tag(name = "Student Menu",
                        description = "This API has Student and course details")
        },
        info = @Info(
                title = "Swagger with Quarkus",
                version = "1.0.1",
                contact = @Contact(
                        name = "Swagger",
                        url = "",
                        email = "deepak@knoldus.com"),
                license = @License(
                        name = "Apache 2.0",
                        url = "http://www.apache.org/licenses/LICENSE-2.0.html")))

public class CustomApi extends Application {
}
