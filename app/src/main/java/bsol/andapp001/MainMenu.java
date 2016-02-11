package bsol.andapp001;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        TranslateAnimation ta = new TranslateAnimation(0,0,300,0);
        ta.setDuration(1500);
        ta.setFillAfter(true);

        AlphaAnimation alphaAnimation = new AlphaAnimation(0,1);
        alphaAnimation.setDuration(1500);
        alphaAnimation.setFillAfter(true);

        ImageView logo  = (ImageView)findViewById(R.id.logo);
        LinearLayout menuButtons = (LinearLayout)findViewById(R.id.menu_buttons);
        logo.startAnimation(ta);
        menuButtons.startAnimation(alphaAnimation);


    }
}
