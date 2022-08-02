package org.test.openapi;

import javax.inject.Inject;
import javax.ws.rs.Path;

@Path("/hello")
public class NewRestApi extends RestApi{

    @Inject
    public NewRestApi(FirstBean firstBean) {

    }
}
