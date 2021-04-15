package ro.ase.acs.main;

import ro.ase.acs.proxy.Authentication;
import ro.ase.acs.proxy.AuthenticationProxy;
import ro.ase.acs.proxy.SecurityAuthenticationException;
import ro.ase.acs.proxy.WebAuthentication;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Authentication authentication = new AuthenticationProxy(new WebAuthentication());
        String username ="";
        String password ="";

        try {
            do {
                System.out.print("Username: ");
                Scanner scanner = new Scanner(System.in);
                username = scanner.nextLine();
                System.out.print("Password: ");
                password = scanner.nextLine();

                System.out.println(authentication.login(username, password) ? "Accepted" : "Failed");
            } while (!authentication.login(username, password));
        }catch (SecurityAuthenticationException e){
            System.out.println(e.getMessage());
        }
    }
}
