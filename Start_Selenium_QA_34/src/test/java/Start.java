import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Start {
    WebDriver wd;

    @Test
    public void start() {
        wd = new ChromeDriver();
        // wd.get("https://contacts-app.tobbymarshall815.vercel.app/home");--without history


        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/home");// with history
        wd.navigate().back();
        wd.navigate().refresh();
        wd.navigate().forward();

        //wd.close();
        wd.quit();
    }

    @Test
    public void firstTest() {
        wd = new ChromeDriver();
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/home");


        //open from--->clik login button
        WebElement loginTab=wd.findElement(By.cssSelector("[href='/login']"));
        loginTab.click();

        //fill valid email
        WebElement emailTextBox=wd.findElement(By.cssSelector("[placeholder='Email']"));
        emailTextBox.click();
        emailTextBox.clear();
        emailTextBox.sendKeys("vkynitzki@mail.ru");

        //fill valid password
        WebElement passwordTextBox= wd.findElement(By.cssSelector("[placeholder='Password']"));
        passwordTextBox.click();
        passwordTextBox.clear();
        passwordTextBox.sendKeys("Vitalik83$");


        //click login button
        WebElement loginButton=wd.findElement(By.cssSelector("button"));
        loginButton.click();


    }
@Test
    public void firstTestRegistrationSuccess(){
        
}

}
