package kit.edu.nikkolasedip.fortnite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.ImageButton;

import kit.edu.nikkolasedip.fortnite.R;

public class PopUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_up);
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width*.8),(int)(height*.4));

        ImageButton imageButton = (ImageButton) findViewById(R.id.imageButton4);
        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            int resid = bundle.getInt("resId");
            //imageButton.setImageResource(resid);
            imageButton.setBackgroundResource(resid);
        }

    }

}
