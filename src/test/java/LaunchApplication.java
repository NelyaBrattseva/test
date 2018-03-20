import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchApplication {
    public static void main(String[] args) {
        method1();
        method2();

    }

    public static void method1() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\SeleniumDrivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
    }

    public static void method2() {
        for (int x = 1; x < 101; x++) {
            System.out.println("Поехали... " + x);
        }

        for (int x = 100; x > 0; x--) {
            System.out.println("И обратно... " + x);
        }

    }
}