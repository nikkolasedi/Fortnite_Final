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

public class CommonGliders extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common_gliders);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);


        final ImageButton imageButton1 = (ImageButton) findViewById(R.id.imageButton1);
        final ImageButton imageButton2 = (ImageButton) findViewById(R.id.imageButton2);
        final ImageButton imageButton3 = (ImageButton) findViewById(R.id.imageButton3);
        final ImageButton imageButton4 = (ImageButton) findViewById(R.id.imageButton4);
        final ImageButton imageButton5 = (ImageButton) findViewById(R.id.imageButton5);
        final ImageButton imageButton6 = (ImageButton) findViewById(R.id.imageButton6);

        click(imageButton1,"fortnite_glider_founders_glider");
        click(imageButton2,"fortnite_glider_founders_umbrella_768x629");
        click(imageButton3,"fortnite_glider_snowflake_768x629");
        click(imageButton4,"fortnite_glider_the_umbrella_768x629");
        click(imageButton5,"fortnite_umbrella_paper_parasol_full");
        click(imageButton6,"fortnite_umbrella_wet_paint");

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

        Intent i = new Intent(CommonGliders.this, PopUpActivity.class);

        i.putExtra("resId", resID);
        startActivity(i);
    }
}
