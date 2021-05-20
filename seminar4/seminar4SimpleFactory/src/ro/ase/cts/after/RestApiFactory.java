package ro.ase.cts.after;

import ro.ase.cts.after.contracts.RestApi;

public class RestApiFactory {
    public static final String DEVELOPMENT = "development";
    public static final String RELEASE = "release";

    public static RestApi createConnection(String serverType){
        if(serverType.equals(DEVELOPMENT)){
            return new RestApiDevelopment();
        } else if(serverType.equals(RELEASE)){
            return new RestApiRelease();
        }
        return null;
    }

}
