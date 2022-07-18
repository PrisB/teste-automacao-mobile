package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;

import static steps.CalculationSteps.driver;

import java.net.URL;

public class CalculationPage {

	public CalculationPage(AppiumDriver<RemoteWebElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Calculator\"]")
    private RemoteWebElement cliqueNoAppCalculadora;

    @AndroidFindBy(id = "com.android.calculator2:id/digit_1")
    private RemoteWebElement selecionarPrimeiroNumero;

    @AndroidFindBy(id = "plus")
    private RemoteWebElement selecionarOperadorMatematico;

    @AndroidFindBy(id = "com.android.calculator2:id/digit_2")
    private RemoteWebElement selecionarSegundoNumero;
    
    @AndroidFindBy(id = "com.android.calculator2:id/digit_3")
    private RemoteWebElement selecionarTerceiroNumero;

    @AndroidFindBy(id = "com.android.calculator2:id/eq")
    private RemoteWebElement cliqueNoIgual;

    @AndroidFindBy(id = "com.android.calculator2:id/result")
    private RemoteWebElement validaResultado;

    public void abrirCalculadora() {
        cliqueNoAppCalculadora.click();
    }
    public void selecionarPrimeiroNumero() {
    	selecionarPrimeiroNumero.click();
    }
    public void selecionaOperadorMatematico() {
        selecionarOperadorMatematico.click();
    }
    public void selecionarSegundoNumero() {
    	selecionarSegundoNumero.click();
    }
    public void selecionarTerceiroNumero() {
    	selecionarTerceiroNumero.click();
    }
    public void clicaNoIgual() {
        cliqueNoIgual.click();
    }
    public void validaResultado(){
        validaResultado.getText();
        Assert.assertEquals("9", validaResultado);
    }
    
}
