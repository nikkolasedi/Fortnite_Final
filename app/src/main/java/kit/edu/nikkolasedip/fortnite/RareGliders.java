package kit.edu.nikkolasedip.fortnite;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

import com.edu.nikkolasedip.fortnite.R;

public class RareGliders extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rare_gliders);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        final ImageButton imageButton1 = (ImageButton) findViewById(R.id.imageButton1);
        final ImageButton imageButton2 = (ImageButton) findViewById(R.id.imageButton2);
        final ImageButton imageButton3 = (ImageButton) findViewById(R.id.imageButton3);
        final ImageButton imageButton4 = (ImageButton) findViewById(R.id.imageButton4);
        final ImageButton imageButton5 = (ImageButton) findViewById(R.id.imageButton5);
        final ImageButton imageButton6 = (ImageButton) findViewById(R.id.imageButton6);
        final ImageButton imageButton7 = (ImageButton) findViewById(R.id.imageButton7);
        final ImageButton imageButton8 = (ImageButton) findViewById(R.id.imageButton8);
        final ImageButton imageButton9 = (ImageButton) findViewById(R.id.imageButton9);
        final ImageButton imageButton10 = (ImageButton) findViewById(R.id.imageButton10);
        final ImageButton imageButton11 = (ImageButton) findViewById(R.id.imageButton11);
        final ImageButton imageButton12 = (ImageButton) findViewById(R.id.imageButton12);
        final ImageButton imageButton13 = (ImageButton) findViewById(R.id.imageButton13);
        final ImageButton imageButton14 = (ImageButton) findViewById(R.id.imageButton14);
        final ImageButton imageButton15 = (ImageButton) findViewById(R.id.imageButton15);
        final ImageButton imageButton16 = (ImageButton) findViewById(R.id.imageButton16);
        final ImageButton imageButton17 = (ImageButton) findViewById(R.id.imageButton17);
        final ImageButton imageButton18 = (ImageButton) findViewById(R.id.imageButton18);

        click(imageButton1,"fortnite_glider_aerial_assault_one");
        click(imageButton2,"fortnite_glider_blue_streak_768x629");
        click(imageButton3,"fortnite_glider_carbon");
        click(imageButton4,"fortnite_glider_cozy_coaster_full");
        click(imageButton5,"fortnite_glider_feathered_flyer_full");
        click(imageButton6,"fortnite_glider_googly_full");
        click(imageButton7,"fortnite_glider_gum_drop_full");
        click(imageButton8,"fortnite_glider_half_shell_full");
        click(imageButton9,"fortnite_glider_mako");
        click(imageButton10,"fortnite_glider_prismatic_full");
        click(imageButton11,"fortnite_glider_rainbow_rider");
        click(imageButton12,"fortnite_glider_stage_dive_hd");
        click(imageButton13,"fortnite_glider_sugar_crash");
        click(imageButton14,"fortnite_glider_voyager_full");
        click(imageButton15,"fortnite_glider_zephyr_full");
        click(imageButton16,"fortnite_season2_battlepass_free001");
        click(imageButton17,"fortnite_season2_battlepass_paid003");
        click(imageButton18,"fortnite_season2_battlepass_paid006");

    }

    public void click(final ImageButton imageButton, final String imageName){
        imageButton.setOnClickListener(new View.OnClickListener() {
                                           public void onClick(View v) {
                                               send(imageButton, imageName);
                                               //openAnotherActivity("PopUpActivity");

                                           }
                                       }
        );
    }

    public void send(View v, String imageName){
        int resID = getResources().getIdentifier(imageName, "drawable", getPackageName());

        Intent i = new Intent(RareGliders.this, PopUpActivity.class);

        i.putExtra("resId", resID);
        startActivity(i);
    }

}
