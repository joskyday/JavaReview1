import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

// page_url = https://etsy.com
public class Etsy {
    @FindBy(xpath = "//h2[contains(@class, 'wt-show-xs')]")
    public WebElement h2FindYouLoveSupport;


    public Etsy(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    
    
    
}