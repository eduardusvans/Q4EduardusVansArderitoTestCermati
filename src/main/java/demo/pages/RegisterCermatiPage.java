package demo.pages;

import demo.driver.WebDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterCermatiPage {
    public void openRegisterPage(){
        WebDriverInstance.webdriver.get("https://www.cermati.com/gabung");
    }
    public boolean isOnRegisterPage() {
        WebDriverWait wait = new WebDriverWait(WebDriverInstance.webdriver, 30);
        return wait.until(
                ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(text(),'Kembali ke Halaman Login')]")))
                .isDisplayed();
    }
    public void inputEmail(String email){
        waitAbit(2000);
        WebDriverInstance.webdriver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
    }
    public void inputPassword(String password){
        waitAbit(2000);
        WebDriverInstance.webdriver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
    }
    public void inputConfirmPassword(String confirmPassword){
        waitAbit(2000);
        WebDriverInstance.webdriver.findElement(By.xpath("//input[@id='confirm-password']")).sendKeys(confirmPassword);
    }
    public void inputFirstName(String firstName){
        waitAbit(2000);
        WebDriverInstance.webdriver.findElement(By.xpath("//input[@id='first-name']")).sendKeys(firstName);
    }
    public void inputLastName(String lastName){
        waitAbit(2000);
        WebDriverInstance.webdriver.findElement(By.xpath("//input[@id='last-name']")).sendKeys(lastName);
    }
    public void inputPhoneNumber(String phoneNumber){
        waitAbit(2000);
        WebDriverInstance.webdriver.findElement(By.xpath("//input[@id='mobile-phone']")).sendKeys(phoneNumber);
    }
    public void inputResidenceCity(String residenceCity){
        waitAbit(2000);
        WebDriverInstance.webdriver.findElement(By.xpath("//input[@id='residence-city']")).sendKeys(residenceCity);
    }
    public void tapRegisterButton(){
        WebDriverInstance.webdriver.findElement(By.xpath("//button[contains(@class,'btn btn-full btn-submit btn-track')]")).click();
    }
    public boolean isOnHomePage() {
        WebDriverWait wait = new WebDriverWait(WebDriverInstance.webdriver, 30);
        return wait.until(
                ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(@class,'btn btn-full')]")))
                .isDisplayed();
    }
    public void waitAbit(int milis) {
        try {
            Thread.sleep(milis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
