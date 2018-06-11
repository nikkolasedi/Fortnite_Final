package kit.edu.nikkolasedip.fortnite;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

import kit.edu.nikkolasedip.fortnite.R;

public class UncommonGliders extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uncommon_gliders);
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

        click(imageButton1,"fortnite_glider_checker_full");
        click(imageButton2,"fortnite_glider_fighter_kite");
        click(imageButton3,"fortnite_glider_fossil_flyer_full_1");
        click(imageButton4,"fortnite_glider_glow_rider");
        click(imageButton5,"fortnite_glider_hot_rod_full");
        click(imageButton6,"fortnite_glider_jolly_roger_hd");
        click(imageButton7,"fortnite_glider_mainframe_full");
        click(imageButton8,"fortnite_glider_meltdown_full");
        click(imageButton9,"fortnite_glider_modern_full");
        click(imageButton10,"fortnite_glider_petunia_full");
        click(imageButton11,"fortnite_glider_raptor");
        click(imageButton12,"fortnite_glider_roadtrip_full");
        click(imageButton13,"fortnite_glider_snow_squall");
        click(imageButton14,"fortnite_glider_solid_strider_full");
        click(imageButton15,"fortnite_glider_stealth_full");
        click(imageButton16,"fortnite_glider_storm_sigil");
        click(imageButton17,"fortnite_glider_warthog_full");
        click(imageButton18,"fortnite_glider_wasp_full");
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

        Intent i = new Intent(UncommonGliders.this, PopUpActivity.class);

        i.putExtra("resId", resID);
        startActivity(i);
    }
}
