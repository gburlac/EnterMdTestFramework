package util;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;


import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class TakeScreens {
    public static void takeScreenshot(WebDriver driver, String screenshotName) {
        try {
            File fileSource = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileHandler.copy(fileSource, new File("./Screenshots/" + screenshotName + ".png"));
        } catch (IOException e) {
            System.out.println("Error while taking screenshot " + e.getMessage());
        }
    }
}
