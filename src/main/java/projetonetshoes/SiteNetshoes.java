package projetonetshoes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class SiteNetshoes {
	
	private WebDriver driver;
	private DSL dsl;
	
	@Before
	public void antes() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netshoes.com.br/");
		dsl = new DSL(driver);
	}
	
	@After
	public void depois() {
		driver.quit();
	}
	
	@Test
	public void testeLogin() {
		dsl.logarNetshoes();
		dsl.emailNetshoes("username", "victor@email.com");
		dsl.senhaNetshoes("password", "123456");
		dsl.clicarBotao("login-button");
	}
	@Test
	public void testeLogout() {
		dsl.logarNetshoes();
		dsl.emailNetshoes("username", "victor@eamil.com");
		dsl.senhaNetshoes("password", "123456");
		dsl.clicarBotao("login-button");
		dsl.deslogarNetshoes();
	}
	
}
