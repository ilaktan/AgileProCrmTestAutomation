package Crm.pages;

import Crm.utilities.ConfigurationReader;
import Crm.utilities.GenericFunctions;
import org.openqa.selenium.By;

public class Login extends GenericFunctions {

    public void enterEmail(){

        waitFor(2);
        driver.findElement(By.xpath("//input[@name='USER_LOGIN']")).sendKeys(ConfigurationReader.get("username"));
    }
    public void enterPassword(){
        waitFor(2);
        driver.findElement(By.xpath("//input[@name='USER_PASSWORD']")).sendKeys(ConfigurationReader.get("password"));
    }
    public void user_click_with_the(String linkText ){
        click("//input[@class='login-btn']");


    }
    public void user_click_logout(String linkText ){
        click("//span[@id='user-name']");
        waitFor(2);
        click("//span[text()='Log out']");


    }
    public void user_verify_message(String linkText){

        assertGetLinkTextWith(linkText);




    }
    public void enterPasswordWithData(String password){
       // waitFor(1);
        //driver.findElement(By.xpath("//input[@id='passwd']")).clear();
        waitFor(1);
        driver.findElement(By.xpath("//input[@name='USER_PASSWORD']")).sendKeys(password);
    }

    public void clearEmailBox(){
        driver.findElement(By.xpath("//input[@name='USER_LOGIN']")).clear();
    }
    public void clearPasswordBox(){
        driver.findElement(By.xpath("//input[@name='USER_PASSWORD']")).clear();
    }
    public void enterEmailWithData(String username){
        driver.findElement(By.xpath("//input[@name='USER_LOGIN']")).sendKeys(username);
    }
    public void user_click_with_the_text(String linkText ){
        //clickLinkWithText(linkText);
        waitFor(1);
        clickLinkWithText2(linkText);


    }
    public void userClickTheStepBackButton(){
        waitFor(2);
        driver.navigate().back();




    }

}
