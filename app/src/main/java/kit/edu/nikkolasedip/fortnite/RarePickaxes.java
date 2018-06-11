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

public class RarePickaxes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rare_pickaxes);
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
        final ImageButton imageButton19 = (ImageButton) findViewById(R.id.imageButton19);
        final ImageButton imageButton20 = (ImageButton) findViewById(R.id.imageButton20);
        final ImageButton imageButton21 = (ImageButton) findViewById(R.id.imageButton21);
        final ImageButton imageButton22 = (ImageButton) findViewById(R.id.imageButton22);
        final ImageButton imageButton23 = (ImageButton) findViewById(R.id.imageButton23);
        final ImageButton imageButton24 = (ImageButton) findViewById(R.id.imageButton24);
        final ImageButton imageButton25 = (ImageButton) findViewById(R.id.imageButton25);
        final ImageButton imageButton26 = (ImageButton) findViewById(R.id.imageButton26);
        final ImageButton imageButton27 = (ImageButton) findViewById(R.id.imageButton27);
        final ImageButton imageButton28 = (ImageButton) findViewById(R.id.imageButton28);

        click(imageButton1,"fortnite_harvesting_anarchy_axe_hd");
        click(imageButton2,"fortnite_harvesting_autocleave_full");
        click(imageButton3,"fortnite_harvesting_axeroni");
        click(imageButton4,"fortnite_harvesting_carrot_stick");
        click(imageButton5,"fortnite_harvesting_cutting_edge");
        click(imageButton6,"fortnite_harvesting_dragon_axe_768x629");
        click(imageButton7,"fortnite_harvesting_empire_axe");
        click(imageButton8,"fortnite_harvesting_gale_force");
        click(imageButton9,"fortnite_harvesting_glow_stick");
        click(imageButton10,"fortnite_harvesting_instigator");
        click(imageButton11,"fortnite_harvesting_lollipopper");
        click(imageButton12,"fortnite_harvesting_persuader_full");
        click(imageButton13,"fortnite_harvesting_plunja");
        click(imageButton14,"fortnite_harvesting_positron");
        click(imageButton15,"fortnite_harvesting_sawtooth_hd");
        click(imageButton16,"fortnite_harvesting_silver_fang");
        click(imageButton17,"fortnite_harvesting_ski_boot");
        click(imageButton18,"fortnite_harvesting_spectre_full");
        click(imageButton19,"fortnite_harvesting_spiky");
        click(imageButton20,"fortnite_harvesting_tactical_spectral_axe");
        click(imageButton21,"fortnite_harvesting_tat_axe_768x629");
        click(imageButton22,"fortnite_harvesting_tenderizer");
        click(imageButton23,"fortnite_harvesting_tool_axecalibur_768x629");
        click(imageButton24,"fortnite_harvesting_tool_batsickle");
        click(imageButton25,"fortnite_harvesting_tool_cliffhanger");
        click(imageButton26,"fortnite_harvesting_tool_close_shave");
        click(imageButton27,"fortnite_harvesting_tool_reaper_768x629");
        click(imageButton28,"fortnite_harvesting_tooth_pick");

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

        Intent i = new Intent(RarePickaxes.this, PopUpActivity.class);

        i.putExtra("resId", resID);
        startActivity(i);
    }

}
