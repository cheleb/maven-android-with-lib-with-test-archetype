#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.app;

import android.app.Application;
import android.content.pm.ApplicationInfo;
import ${package}.app.os.StrictModeWrapper;

/**
 * The MorseFlashApplication is a simple way to hold some data and make it accessible to any activity.
 *
 * @author Manfred Moser <manfred@simpligility.com>
 */
public class ${name}Application extends Application {

    public String message;

    private static boolean strictModeAvailable;

    // use the StrictModeWrapper to see if we are running on Android 2.3 or higher and StrictMode is available
    static {
        try {
            StrictModeWrapper.checkAvailable();
            strictModeAvailable = true;
        } catch (Throwable throwable) {
            strictModeAvailable = false;
        }
    }

    @Override
    public void onCreate() {
        if (strictModeAvailable) {
            // check if android:debuggable is set to true
            int applicationFlags = getApplicationInfo().flags;
            if ((applicationFlags & ApplicationInfo.FLAG_DEBUGGABLE) != 0) {
                StrictModeWrapper.enableDefaults();
            }
        }
        super.onCreate();
    }
}
