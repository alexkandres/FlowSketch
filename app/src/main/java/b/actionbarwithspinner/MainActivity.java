package b.actionbarwithspinner;

import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Spinner;


public class MainActivity extends AppCompatActivity {

    /** Options Spinner **/
    int option_icons[] = {R.mipmap.options_icon, 0, 0, 0, 0, 0};
    String option_text_logIn[] = {" ", "New", "Log Out", "Save", "Load", " "};
    String option_text[] = {"New", "Log In"};
    /*********************/

    /** Text Spinner **/
    int text_icons[] = {R.mipmap.text_icon, 0};
    String text_text[] = {" ", " "};
    /*********************/

    /** Lines Spinner **/
    int line_icons[] = {R.mipmap.lines_icon, 0};
    String line_text[] = {" ", " "};
    /*********************/

    /** Shapes Spinner **/
    int shape_icons[] = {R.mipmap.shapes_icon, 0};
    String shape_text[] = {" ", " "};
    /*********************/

    /** Tools Spinner **/
    int tool_icons[] = {R.mipmap.tools_icon, 0};
    String tool_text[] = {" ", " "};
    /*********************/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        MenuItemCompat r = new MenuItemCompat();

        /** Options Spinner **/
        MenuItem options_item = menu.findItem(R.id.options);
        Spinner options = (Spinner) r.getActionView(options_item);
        IconCustomAdapter custom_options = new IconCustomAdapter(getApplicationContext(), option_icons, option_text_logIn);
        options.setAdapter(custom_options);
        /*********************/

        /** Text Spinner **/
        MenuItem text_item = menu.findItem(R.id.text);
        Spinner text = (Spinner) r.getActionView(text_item);
        IconCustomAdapter custom_text = new IconCustomAdapter(getApplicationContext(), text_icons, text_text);
        text.setAdapter(custom_text);
        /*********************/

        /** Lines Spinner **/
        MenuItem lines_item = menu.findItem(R.id.lines);
        Spinner lines = (Spinner) r.getActionView(lines_item);
        IconCustomAdapter custom_lines = new IconCustomAdapter(getApplicationContext(), line_icons, line_text);
        text.setAdapter(custom_lines);
        /*********************/

        /** Shapes Spinner **/
        MenuItem shapes_item = menu.findItem(R.id.shapes);
        Spinner shapes = (Spinner) r.getActionView(shapes_item);
        IconCustomAdapter custom_shapes = new IconCustomAdapter(getApplicationContext(), shape_icons, shape_text);
        text.setAdapter(custom_shapes);
        /*********************/

        /** Tools Spinner
        MenuItem tools_item = menu.findItem(R.id.tools);
        Spinner tools = (Spinner) r.getActionView(tools_item);
        IconCustomAdapter custom_tools = new IconCustomAdapter(getApplicationContext(), tool_icons, tool_text);
        text.setAdapter(custom_tools);
        /*********************/

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();


        if(id == R.id.options) {

            return true;
        }

        if(id == R.id.text) {
            return true;
        }


            return super.onOptionsItemSelected(item);
    }
}
