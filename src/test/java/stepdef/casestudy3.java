package stepdef;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class casestudy3 {
	WebDriver driver;
	  @Given("the user launches the testmeapp")
	  public void user_opens_the_testmeapp_on_chrome_browser() {
	   System.setProperty("webdriver.chrome.driver","C:\\seldrivers\\chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.get("http://10.232.237.143:443/TestMeApp/login.htm");     
	  }
	  @Then("logins in with the credentials")
	  public void user_enters_the_username_and_password() {
	   driver.findElement(By.name("userName")).sendKeys("lalitha");
	   driver.findElement(By.name("password")).sendKeys("Password123");
	   driver.findElement(By.name("Login")).click();
	  }
	  @Then("searches for the product")
	  public void search() {
		  driver.findElement(By.name("products")).sendKeys("Headphone");
		  driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
		 }
	  
	  @Then("adds the product to the cart")
	  public void addtocart()
	  {
		  driver.findElement(By.xpath( "/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
	  }
	  @Then("the user then checksout the product")
	  public void checkout()
	  {
	  
		  driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/a[2]")).click();
	  }
	  @When("payment is being done")
	  public void payment() throws InterruptedException
	  {
		 driver.findElement(By.xpath("//*[@id='cart']/tfoot/tr[2]/td[5]/a")).click();
		 //driver.findElement(By.partialLinkText("Checkout")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//input[@value='Proceed to Pay']")).click();
		 //driver.findElement(By.xpath("//*[@id='swit']/div[1]/div/label")).click();
		 Thread.sleep(20000);
		 driver.findElement(By.xpath("//label[contains(text(),'Andhra Bank')]")).click();
		 driver.findElement(By.id("btn")).click();
		 driver.findElement(By.name("username")).sendKeys("123456");
		 driver.findElement(By.name("password")).sendKeys("Pass@456");
		 driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		 driver.findElement(By.name("transpwd")).sendKeys("Trans@456");
		 driver.findElement(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[2]/input")).click();
		 //String title=driver.getTitle();
		 ////input[@value='Proceed to Pay']")).  Proceed to Pay Thread.sleep(20000);
	  } 
	  @Then("the product is purchased sucessfully")
	  public void exit()
	  {
		  driver.close();
	  }
}
	  
	  //driver.findElement(By.linkText("Add to cart")).click();
	  //driver.findElement(By.partialLinkText("Cart")).click();
	  //driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/a[2]")).click();
