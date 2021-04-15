package ro.ase.acs.proxy;

public class AuthenticationProxy implements Authentication {
    private Authentication authentication = null;
    private int failedAuthenticationCounter = 0;

    public AuthenticationProxy(Authentication authentication) {
        this.authentication = authentication;
    }

    @Override
    public boolean login(String username, String password) throws SecurityAuthenticationException {
        if(failedAuthenticationCounter > 3){
            throw new SecurityAuthenticationException("Number of bad logins exceeded");
        }
        if (authentication.login(username, password)) {
            failedAuthenticationCounter = 0;
            return true;
        } else {
            failedAuthenticationCounter++;
            return false;
        }
    }
}
