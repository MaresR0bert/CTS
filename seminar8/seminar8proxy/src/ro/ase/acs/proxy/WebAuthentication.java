package ro.ase.acs.proxy;

public class WebAuthentication implements Authentication{
    @Override
    public boolean login(String username, String password) {
        return "admin".equals(username) && "admin".equals(password);
    }
}
