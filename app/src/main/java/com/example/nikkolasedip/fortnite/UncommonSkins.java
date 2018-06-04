package com.example.nikkolasedip.fortnite;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class UncommonSkins extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uncommon_skins);


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

        click(imageButton1,"fortnite_outfit_assault_trooper");
        click(imageButton2,"fortnite_outfit_commando");
        click(imageButton3,"fortnite_outfit_crimson_scout");
        click(imageButton4,"fortnite_outfit_devestrator");
        click(imageButton5,"fortnite_outfit_dominator_1");
        click(imageButton6,"fortnite_outfit_highrise_assault_trooper");
        click(imageButton7,"fortnite_outfit_jungle_scout");
        click(imageButton8,"fortnite_outfit_lite_show_full");
        click(imageButton9,"fortnite_outfit_nitelite_full");
        click(imageButton10,"fortnite_outfit_nog_ops_hd");
        click(imageButton11,"fortnite_outfit_pathfinder");
        click(imageButton12,"fortnite_outfit_ranger");
        click(imageButton13,"fortnite_outfit_renegade");
        click(imageButton14,"fortnite_outfit_scarlet_defender");
        click(imageButton15,"fortnite_outfit_scout");
        click(imageButton16,"fortnite_outfit_sgt_green_clover");
        click(imageButton17,"fortnite_outfit_tactics_officer");
        click(imageButton18,"fortnite_outfit_tower_recon_specialist");
        click(imageButton19,"fortnite_outfit_tracker");
        click(imageButton20,"fortnite_outfit_trooper");
        click(imageButton21,"fortnite_outfit_whiplash_full");
        click(imageButton22,"fortnite_outfit_yuletide_ranger_hd");
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

        Intent i = new Intent(UncommonSkins.this, PopUpActivity.class);

        i.putExtra("resId", resID);
        startActivity(i);
    }
}
