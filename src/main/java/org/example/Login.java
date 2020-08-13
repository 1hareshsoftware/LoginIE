package org.example;


import org.openqa.selenium.By;

import static org.example.Utils.utils.*;

public class Login extends Utils {

    private By _enterLoginID = By.id("txtUsername");
    private By _enterPassword = By.id("txtPassword");
    private By _loginButton = By.id("btnLogin");

    public void enterLoginID(String username){
        waitForElementToBevisible(_enterLoginID, 20);
        enterText(_enterLoginID, (username));
    }

    public void enterPassword (String password){
        waitForElementToBevisible(_enterPassword, 20);
        enterText(_enterPassword,(password));
    }

    public void loginButton(){
        ClickOnElement((_loginButton));
    }
}
