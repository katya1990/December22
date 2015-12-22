import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wd = new FirefoxDriver();
		wd.get("http://www.orbitz.com");
		wd.findElement(By.id("search.type.air")).click();
		Thread.sleep(2000);
		wd.findElement(By.id("search.ar.type.code.oneWay")).click();
		Thread.sleep(4000);
		wd.findElement(By.name("ar.ow.leaveSlice.orig.key")).sendKeys(new String[] {"JFK"});
		wd.findElement(By.name("ar.ow.leaveSlice.dest.key")).sendKeys("SFO");
		wd.findElement(By.name("ar.ow.leaveSlice.date")).sendKeys("09/30/2015");
		wd.findElement(By.name("ar.ow.leaveSlice.time")).sendKeys("1am");
		wd.findElement(By.name("search")).click();
		Thread.sleep(2000);
		String price = wd.findElement(By.xpath("//span[@class='money small-cents small-symbol']")).getText();
		System.out.println("The lowest price is " + price);
		
	}

}
