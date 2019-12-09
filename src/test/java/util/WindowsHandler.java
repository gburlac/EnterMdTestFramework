package util;

import java.util.ArrayList;
import java.util.Set;

public class WindowsHandler {
    public static void switchWindow() {
        String mainWindow = Driver.getDriver().getWindowHandle();
        Set<String> windows = Driver.getDriver().getWindowHandles();
        for (String w : windows) {
            if (!w.equals(mainWindow)) {
                Driver.getDriver().switchTo().window(w);
                break;
            }
        }
    }

    public static void switchBackToMain(){
        Set<String> windows = Driver.getDriver().getWindowHandles();
        ArrayList<String> windowsaray = new ArrayList<>(windows);
        Driver.getDriver().switchTo().window(windowsaray.get(0));
    }
}
