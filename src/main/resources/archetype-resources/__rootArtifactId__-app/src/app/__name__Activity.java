#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.app;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.widget.LinearLayout;


/**
 * MorseFlashActivity is the actual activity that flashes the screen in morse code.
 *
 * @author Manfred Moser <manfred@simpligility.com>
 */
public class ${name}Activity extends Activity {

    private LinearLayout page;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.morseflash);
        page = (LinearLayout) findViewById(R.id.page);

        ${name}Application application = (${name}Application) getApplication();
        String message = application.message;

       
    }

}

