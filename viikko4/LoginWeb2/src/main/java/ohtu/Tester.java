
package ohtu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Tester {
    public static void main(String[] args) {

        WebDriver driver0 = new HtmlUnitDriver();
        driver0.get("http://localhost:8080");
        System.out.println( driver0.getPageSource() );
        WebElement element0 = driver0.findElement(By.linkText("login"));       
        element0.click(); 
        
        System.out.println("==");
        
        System.out.println( driver0.getPageSource() );
        element0 = driver0.findElement(By.name("username"));
        element0.sendKeys("pekka");

        
        element0 = driver0.findElement(By.name("password"));
        element0.sendKeys("akkep");

        element0 = driver0.findElement(By.name("login"));
        element0.submit();
        
        System.out.println("==");
        System.out.println( driver0.getPageSource() );
        
        System.out.println("==");
        System.out.println( driver0.getPageSource() );
           //------------Wrong Password-----------------
        WebDriver driver3 = new HtmlUnitDriver();

        driver3.get("http://localhost:8080");
        System.out.println( driver3.getPageSource() );
        WebElement element3 = driver3.findElement(By.linkText("login"));       
        element3.click(); 
        
        System.out.println("==");
        
        System.out.println( driver3.getPageSource() );
        element3 = driver3.findElement(By.name("username"));
        element3.sendKeys("pekka");

        
        element3 = driver3.findElement(By.name("password"));
        element3.sendKeys("wrongPass");

        element3 = driver3.findElement(By.name("login"));
        element3.submit();
        
        System.out.println("==");
        System.out.println( driver3.getPageSource() );
        
        System.out.println("==");
        System.out.println( driver3.getPageSource() );
        //-------------User does not exists-----------
            WebDriver driver1 = new HtmlUnitDriver();

        driver1.get("http://localhost:8080");
        System.out.println( driver1.getPageSource() );
        WebElement element1 = driver1.findElement(By.linkText("login"));       
        element1.click(); 
        
        System.out.println("==");
        
        System.out.println( driver1.getPageSource() );
        element1 = driver1.findElement(By.name("username"));

        element1.sendKeys("asdsad");
        
        element1 = driver1.findElement(By.name("password"));
        element1.sendKeys("akksadfe3p");

        element1 = driver1.findElement(By.name("login"));
        element1.submit();
        
        System.out.println("==");
        System.out.println( driver1.getPageSource() );
        
        System.out.println("==");
        System.out.println( driver1.getPageSource() );
        
        //------Create new user---------
        WebDriver driver = new HtmlUnitDriver();

        driver.get("http://localhost:8080");
        System.out.println( driver.getPageSource() );
        WebElement element = driver.findElement(By.linkText("register new user"));       
        element.click(); 
        
        System.out.println("==");
        
        System.out.println( driver.getPageSource() );
        element = driver.findElement(By.name("username"));
        element.sendKeys("amira");
        element = driver.findElement(By.name("password"));
        element.sendKeys("pipi12343");
        element = driver.findElement(By.name("passwordConfirmation"));
        element.sendKeys("pipi12343");
        element = driver.findElement(By.name("add"));
        element.submit();
        //--------------Login with new user-----------
        WebDriver driver2 = new HtmlUnitDriver();

        driver2.get("http://localhost:8080");
        System.out.println( driver2.getPageSource() );
        WebElement element2 = driver2.findElement(By.linkText("login"));       
        element2.click(); 
        
        System.out.println("==");
        
        System.out.println( driver2.getPageSource() );
        element2 = driver2.findElement(By.name("username"));
        element2.sendKeys("amira");

        element2 = driver2.findElement(By.name("password"));
        element2.sendKeys("pipi12343");

        element2 = driver2.findElement(By.name("login"));
        element2.submit();
        
        System.out.println("==");
        System.out.println( driver2.getPageSource() );
        
        System.out.println("==");
        System.out.println( driver2.getPageSource() );
        

        
    }
}
