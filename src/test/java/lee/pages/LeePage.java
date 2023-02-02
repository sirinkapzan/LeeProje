package lee.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LeePage extends CommonPageElements{
    @FindBy(css = "[alt=\"Hesabım\"]")
    public WebElement hesabimButonu;

    @FindBy(css = "[id=\"Email\"]")
    public WebElement loginMailTextBox;

    @FindBy(css = "[id=\"Password\"]")
    public WebElement loginPasswordTextBox;

    @FindBy(css = "[value=\"GİRİŞ YAP\"]")
    public WebElement loginGirisYapButonu;

    @FindBy(xpath = "//img[@title=\"Sepetim\"]")
    public WebElement sepetimButonu;

    @FindBy(xpath = "//img[@src=\"https://f-lwr-l.mncdn.com/webfiles/NewSiteIcons/delete-gri.svg\"]")
    public List<WebElement> sepetSilmeButonu;

    @FindBy(xpath = "//i[starts-with(@id,'icon-close-button')]")
    public WebElement closeAdButton;
}
