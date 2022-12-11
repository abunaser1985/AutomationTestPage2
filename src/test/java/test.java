import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class test extends Page {

	
	
	 @Test
	   	public void login2() {
	       	
	    	WebElement addCategory = driver.findElement(AddCategory);
	    	addCategory.sendKeys("Expensive_Items345");
	    	WebElement AddCategorybutton = driver.findElement(Button);
	    	AddCategorybutton.click();
	    	String a = driver.findElement(expensiveItemBody).getText();
			
	    	Assert.assertEquals("add category already exist validation successful","Expensive_Items345", a);
	    }
}
