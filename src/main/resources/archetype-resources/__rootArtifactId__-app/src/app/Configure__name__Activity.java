#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 *
 *
 * @author Manfred Moser <manfred@simpligility.com>
 */
public class Configure${name}Activity extends Activity {

    private EditText message;
    private ${name}Application application;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        message = (EditText) findViewById(R.id.message);
        Button morse = (Button) findViewById(R.id.morse);

        morse.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View view) {

                        application = (${name}Application) getApplication();
                        application.message = message.getText().toString();

                        startActivity(new Intent(Configure${name}Activity.this, ${name}Activity.class));
                    }
                }
        );

    }
}