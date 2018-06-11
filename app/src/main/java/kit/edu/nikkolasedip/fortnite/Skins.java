package kit.edu.nikkolasedip.fortnite;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import kit.edu.nikkolasedip.fortnite.R;

public class Skins extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skins);

        //Creating Buttons
        Button btnDefaultSkins = (Button) findViewById(R.id.btnDefaultSkins);
        Button btnUncommonSkins = (Button) findViewById(R.id.btnUncommonSkins);
        Button btnRareSkins = (Button) findViewById(R.id.btnRareSkins);
        Button btnEpicSkins = (Button) findViewById(R.id.btnEpicSkins);
        Button btnLegendarySkins = (Button) findViewById(R.id.btnLegendarySkins);

        //Create onClickListenets

        btnDefaultSkins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAnotherActivity("DefaultSkins");
            }
        });

        btnUncommonSkins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAnotherActivity("UncommonSkins");
            }
        });

        btnRareSkins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAnotherActivity("RareSkins");
            }
        });

        btnEpicSkins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAnotherActivity("EpicSkins");
            }
        });

        btnLegendarySkins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAnotherActivity("LegendarySkins");
            }
        });
    }

    //Creating openAnotherActivity method
    public void openAnotherActivity(String activityName){
        try {
            Class<?> activityClass = Class.forName("kit.edu.nikkolasedip.fortnite."+activityName);
            Intent intent = new Intent(this, activityClass);
            startActivity(intent);
        } catch (ClassNotFoundException e ) {
            e.printStackTrace();
        }
    }
}
