package kit.edu.nikkolasedip.fortnite;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.edu.nikkolasedip.fortnite.R;

public class EpicPickaxes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_epic_pickaxes);

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

        click(imageButton1,"fortnite_harvesting_acdc_768x629");
        click(imageButton2,"fortnite_harvesting_bitemark");
        click(imageButton3,"fortnite_harvesting_bottom_feeder");
        click(imageButton4,"fortnite_harvesting_chomp_jr");
        click(imageButton5,"fortnite_harvesting_eva_hd");
        click(imageButton6,"fortnite_harvesting_global_axe_full");
        click(imageButton7,"fortnite_harvesting_onslaught");
        click(imageButton8,"fortnite_harvesting_pick_squeak");
        click(imageButton9,"fortnite_harvesting_pot_o_gold");
        click(imageButton10,"fortnite_harvesting_rainbow_smash");
        click(imageButton11,"fortnite_harvesting_renegade_roller");
        click(imageButton12,"fortnite_harvesting_tool_candy_axe_768x629");
        click(imageButton13,"fortnite_harvesting_tool_death_valley");
        click(imageButton14,"fortnite_harvesting_tool_disco_brawl");
        click(imageButton15,"fortnite_harvesting_tool_party_animal");
        click(imageButton16,"fortnite_harvesting_tool_pink_flamingo");
        click(imageButton17,"fortnite_harvesting_tool_raiders_revenge_768x629");
        click(imageButton18,"fortnite_harvesting_trusty_no_2_hd");

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

        Intent i = new Intent(EpicPickaxes.this, PopUpActivity.class);

        i.putExtra("resId", resID);
        startActivity(i);
    }
}
