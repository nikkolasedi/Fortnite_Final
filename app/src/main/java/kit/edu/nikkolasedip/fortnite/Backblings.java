package kit.edu.nikkolasedip.fortnite;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;


public class Backblings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_backblings);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);



        //Creating Buttons
        Button btnRareBackblings = (Button) findViewById(R.id.btnRareBackblings);
        Button btnEpicBackblings = (Button) findViewById(R.id.btnEpicBackblings);
        Button btnLegendaryBackblings = (Button) findViewById(R.id.btnLegendaryBackblings);

        //Creating OnClickListener for Buttons
        btnRareBackblings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAnotherActivity("RareBackblings");
            }
        });

        btnEpicBackblings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAnotherActivity("EpicBackblings");
            }
        });

        btnLegendaryBackblings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAnotherActivity("LegendaryBackblings");
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
