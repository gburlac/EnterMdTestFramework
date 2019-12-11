package util;

import java.util.Iterator;
import java.util.Set;

public class WindowsHandler {
    public static void switchWindow() {
        String mainWindow = Driver.getDriver().getWindowHandle();
        Set<String> windows = Driver.getDriver().getWindowHandles();
        for (String w : windows) {
            if (w.equals(mainWindow) != true) {
                Driver.getDriver().switchTo().window(w);
                break;
            }
        }
    }

//    public static void switchBack(){
//        String loginWindow = Driver.getDriver().getWindowHandle();
//        Set <String> windows = Driver.getDriver().getWindowHandles();
//        for (String w : windows) {
//            if (w.equals(loginWindow) != true){
//                Driver.getDriver().switchTo().window(w);
//                break;
//            }
//        }
//    }

    public static void getParentWindow() {
        Set<String> windows = Driver.getDriver().getWindowHandles();
        Iterator<String> iter = windows.iterator();
        String parentID = iter.next();
    }

    public static void getChildWindow() {
        Set<String> windows = Driver.getDriver().getWindowHandles();
        Iterator<String> iter = windows.iterator();
        String childID = iter.next();
    }
}
