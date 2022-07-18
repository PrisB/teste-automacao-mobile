package steps;

import org.openqa.selenium.remote.RemoteWebElement;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.CalculationPage;

public class CalculationSteps {
	
	public static CalculationPage calculation;
    public static AppiumDriver<RemoteWebElement> driver;
	
	@Dado("que o usuário clique no número dois")
    public void queOUsuárioCliqueNoPrimeiroNumero() {
		calculation.abrirCalculadora();
        calculation.selecionarPrimeiroNumero();
    }
	
	@E("clique no operador de soma")
    public void cliqueNoOperadorDeSoma() throws InterruptedException {
		calculation.selecionaOperadorMatematico();
    }
    
    @E("clique no número três")
    public void cliqueNoSegundoNumero() throws InterruptedException {
    	calculation.selecionarSegundoNumero();
    }
    
    @E("clique no número quatro")
    public void cliqueNoTerceiroNumero() throws InterruptedException {
    	calculation.selecionarTerceiroNumero();
    }

    @Quando("clicar no sinal de igual")
    public void cliqueNoIgual() {
    	calculation.clicaNoIgual();
    }

    @Entao("irá apresentar o resultado da soma igual a nove")
    public void validarResultado() {
    	calculation.validaResultado();

    }

}
