package projetonetshoes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class DSL {
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	public DSL(WebDriver driver) {
		this.driver = driver;
	}

	public void emailNetshoes(String id_email, String email) {
		driver.findElement(By.id(id_email)).sendKeys(email);
		Assert.assertEquals(email, driver.findElement(By.id(id_email)).getAttribute("value"));
	}
	
	public void senhaNetshoes(String id_senha, String senha) {
		driver.findElement(By.id(id_senha)).sendKeys(senha);
		Assert.assertEquals(senha, driver.findElement(By.id(id_senha)).getAttribute("value"));
	}
	
	public void logarNetshoes() {
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@href='#header-user-anonymous']")));
		driver.findElement(By.xpath("//*[@href='#header-user-anonymous']")).click();
		driver.findElement(By.xpath("//*[@href='/login']")).click();
	}
	
	public void deslogarNetshoes() {
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@href='#header-user-logged']")));
		driver.findElement(By.xpath("//*[@href='#header-user-logged']")).click();
		driver.findElement(By.xpath("//*[@href='/logout']")).click();
	}
	public void clicarBotao(String id_botao) {
		driver.findElement(By.id(id_botao)).click();
	}
}
