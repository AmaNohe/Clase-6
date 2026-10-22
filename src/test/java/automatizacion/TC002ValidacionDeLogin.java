package automatizacion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TC002ValidacionDeLogin {
//Script para validar el login Page
    WebDriver driver;

//Acciones que se vean a ejecutar antes de cada Test.
    @BeforeEach
    public void inicializarNavegador(){
        driver = new chromeDriver ();
        driver.manage(). window(). maximize();
    }
 // Test 1: Validar el titulo de la pagina ante de realizar el login
    @Test
    public void validarTituloDeLaPagina(){
        //abrir navegador
        driver.get("https://practicetestautomation.com/practice-test-login/");

        //obtener titulo del sitio web
        String tituloActual = driver.getTitle();
        String tituloEsperado ="Test Login | Practice Test Automation";
        
        // Validar el titulo del sitio web
        Assertions.assertEquals (
            tituloEsperado, 
            tituloActual, 
            "El titulo encontrado no coincide con lo esperado");

        System.out.printIn("titulo fue validado correctamente");

    }

    //Test 2// Validar un login exitoso
    @Test
    public void loginExitoso(){
        //abrir navegador
        driver.get("https://practicetestautomation.com/practice-test-login/");

        //Ingresar las credenciales de autenticación
        driver.findElement(By.id("usarname"))
              .sendKeys ("student");

         driver.findElement(By.id("password"))
              .sendKeys ("Password123");

        driver.findElement(By.id("submit"))
              .click ();



    }

    Acciones que se vean a ejecutar después de cada Test. 
    @afterEach
    public void cerrarSesion(){
    driver.quit();
   }

    
}
