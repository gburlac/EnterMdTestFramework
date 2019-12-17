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
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
public class TakeScreens {
    private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_mm_ss");
    private static LocalDateTime now = LocalDateTime.now();
    private static String nowTime = dtf.format(now);
    private static File directory = new File(String.valueOf("./Screenshots/" + nowTime));
    public static void takeScreenshot(WebDriver driver, String screenshotName) {
        String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
        try {
            if (!directory.exists()) {
                directory.mkdir();
            }
            File fileSource = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileHandler.copy(fileSource, new File("./Screenshots/"  + nowTime + "/" + timestamp + "_" + screenshotName + ".png"));
        } catch (IOException e) {
            System.out.println("Error while taking screenshot " + e.getMessage());
        }
    }
    public static void takeFullScreenshot(WebDriver driver, String screenshotName) {
        String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
        Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
        try {
            ImageIO.write(screenshot.getImage(), "PNG", new File("./Screenshots/"  + nowTime + "/" + timestamp + "_" + screenshotName + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}