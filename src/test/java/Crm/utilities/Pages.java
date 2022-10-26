package Crm.utilities;

import Crm.pages.Login;
import io.cucumber.java.en.Given;

public class Pages
{
    Login login;
    GenericFunctions genericFunctions;


    public GenericFunctions genericFunctions() {
        if (genericFunctions == null) {
            genericFunctions = new GenericFunctions();
        }
        return genericFunctions;
    }
    public Login login() {
        if (login == null) {
            login = new Login();
        }
        return login;
    }
}
