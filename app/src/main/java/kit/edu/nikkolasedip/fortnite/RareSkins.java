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

public class RareSkins extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rare_skins);

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
        final ImageButton imageButton29 = (ImageButton) findViewById(R.id.imageButton29);
        final ImageButton imageButton30 = (ImageButton) findViewById(R.id.imageButton30);
        final ImageButton imageButton31 = (ImageButton) findViewById(R.id.imageButton31);

        click(imageButton1,"fortnite_outfit_recon_scout");
        click(imageButton2,"fortnite_outfit_recon_specialist");
        click(imageButton3,"fortnite_outfit_red_nosed_raider_hd");
        click(imageButton4,"fortnite_outfit_renegade_raider");
        click(imageButton5,"fortnite_outfit_royale_knight");
        click(imageButton6,"fortnite_outfit_sash_sergeant");
        click(imageButton7,"fortnite_outfit_snorkel_ops");
        click(imageButton8,"fortnite_outfit_special_forces");
        click(imageButton9,"fortnite_outfit_radiant_striker");
        click(imageButton10,"fortnite_outfit_recon_expert");
        click(imageButton11,"fortnite_outfit_absolute_zero_1");
        click(imageButton12,"fortnite_outfit_aerial_assault_trooper");
        click(imageButton13,"fortnite_outfit_arctice_assassin");
        click(imageButton14,"fortnite_outfit_blue_squire");
        click(imageButton15,"fortnite_outfit_blue_team_leader");
        click(imageButton16,"fortnite_outfit_brawler");
        click(imageButton17,"fortnite_outfit_brilliant_striker");
        click(imageButton18,"fortnite_outfit_brite_bomber_hd");
        click(imageButton19,"fortnite_outfit_chromium_full");
        click(imageButton20,"fortnite_outfit_cipher_full");
        click(imageButton21,"fortnite_outfit_circuit_breaker_hd");
        click(imageButton22,"fortnite_outfit_codename_elf_hd");
        click(imageButton23,"fortnite_outfit_dazzle");
        click(imageButton24,"fortnite_outfit_desperado");
        click(imageButton25,"fortnite_outfit_diecast_full");
        click(imageButton26,"fortnite_outfit_first_strike_specialist");
        click(imageButton27,"fortnite_outfit_hyperion");
        click(imageButton28,"fortnite_outfit_infiltrator");
        click(imageButton29,"fortnite_outfit_midnight_ops_full");
        click(imageButton30,"fortnite_outfit_munitions_expert");
        click(imageButton31,"fortnite_outfit_survival_specialist");



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

        Intent i = new Intent(RareSkins.this, PopUpActivity.class);

        i.putExtra("resId", resID);
        startActivity(i);
    }

}
