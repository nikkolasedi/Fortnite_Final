package com.example.nikkolasedip.fortnite;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class LegendarySkins extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legendary_skins);

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

        click(imageButton1,"fortnite_outfit_battle_hound");
        click(imageButton2,"fortnite_outfit_black_knight");
        click(imageButton3,"fortnite_outfit_carbide");
        click(imageButton4,"fortnite_outfit_crackshot_hd");
        click(imageButton5,"fortnite_outfit_cuddle_team_leader");
        click(imageButton6,"fortnite_outfit_dark_vanguard_full");
        click(imageButton7,"fortnite_outfit_dark_voyager_hd");
        click(imageButton8,"fortnite_outfit_havoc");
        click(imageButton9,"fortnite_outfit_leviathan_full");
        click(imageButton10,"fortnite_outfit_love_ranger");
        click(imageButton11,"fortnite_outfit_omega");
        click(imageButton12,"fortnite_outfit_power_chord_hd");
        click(imageButton13,"fortnite_outfit_raptor");
        click(imageButton14,"fortnite_outfit_raven_full");
        click(imageButton15,"fortnite_outfit_red_knight_hd");
        click(imageButton16,"fortnite_outfit_rex");
        click(imageButton17,"fortnite_outfit_the_reaper_hd");
        click(imageButton18,"fortnite_outfit_tricera_ops_full");
        click(imageButton19,"fortnite_outfit_valor");
        click(imageButton20,"fortnite_outfit_wukong");

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

        Intent i = new Intent(LegendarySkins.this, PopUpActivity.class);

        i.putExtra("resId", resID);
        startActivity(i);
    }

}
