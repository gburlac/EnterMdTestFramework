package util;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.time.format.DateTimeFormatter;

public class TakeScreens {
    public static void takeScreenshot(WebDriver driver, String screenshotName) {
        DateTimeFormatter dateTime = DateTimeFormatter.ofPattern("hh_mm_ss_dd_mm_yy");
        try {
            File fileSource = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileHandler.copy(fileSource, new File("./Screenshots/" + "_" + screenshotName + ".png"));
        } catch (IOException e) {
            System.out.println("Error while taking screenshot " + e.getMessage());
        }
    }

    public static void takeFullScreenshot(WebDriver driver, String screenshotName) {
        Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
        try {
            ImageIO.write(screenshot.getImage(), "PNG", new File("./Screenshots/" + screenshotName + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
