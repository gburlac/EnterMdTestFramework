package util;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class TakeScreens {
    private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_mm_ss");
    private static LocalDateTime now = LocalDateTime.now();
    private static String nowTime = dtf.format(now);
    private static File directory = new File(String.valueOf("src/test/Screenshots/"+ nowTime));
    public static void takeScreenshot(WebDriver driver, String screenshotName) {
        try {
            if(!directory.exists()){

                directory.mkdir();
            }
            File fileSource = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileHandler.copy(fileSource, new File("src/test/Screenshots/" +"/"+ nowTime +"/"+ screenshotName + ".png"));
        } catch (IOException e) {
            System.out.println("Error while taking screenshot " + e.getMessage());
        }
    }
}
