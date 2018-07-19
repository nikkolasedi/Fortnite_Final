package kit.edu.nikkolasedip.fortnitepay;

        import android.content.Intent;
        import android.os.Bundle;
        import android.support.design.widget.FloatingActionButton;
        import android.support.design.widget.Snackbar;
        import android.support.v7.app.AppCompatActivity;
        import android.support.v7.widget.Toolbar;
        import android.view.View;
        import android.widget.ImageButton;

        import kit.edu.nikkolasedip.fortnitepay.R;

public class SeasonFiveSkin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_season_five_skin);

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


        click(imageButton1,"fortnite_skin_drift_outfit_hires");
        click(imageButton2,"fortnite_skin_fortune_outfit_hires");
        click(imageButton3,"fortnite_skin_huntress_outfit_hires");
        click(imageButton4,"fortnite_skin_magnus_outfit_hires");
        click(imageButton5,"fortnite_skin_moniker_outfit_hires");
        click(imageButton6,"fortnite_skin_ragnarok_outfit_hires");
        click(imageButton7,"fortnite_skin_redline_outfit_hd_hires");
        click(imageButton8,"fortnite_skin_ragnarok_outfit_hires");
        click(imageButton9,"fortnite_skin_sledgehammer_outfit_hires");
        click(imageButton10,"fortnite_skin_sun_strider_outfit_hd_hires");



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

        Intent i = new Intent(SeasonFiveSkin.this, PopUpActivity.class);

        i.putExtra("resId", resID);
        startActivity(i);
    }

}
