package bsol.andapp001;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.sql.Time;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        Button button1 = (Button)findViewById(R.id.button);
        Button button2 = (Button)findViewById(R.id.button2);
        Button button3 = (Button)findViewById(R.id.button3);
        Button button4 = (Button)findViewById(R.id.button4);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent editActivity = new Intent(MainMenu.this,MapActivity.class);
                startActivity(editActivity);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent listActivity = new Intent(MainMenu.this, ListActivity.class);
                startActivity(listActivity);

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent preferenceActivity = new Intent(MainMenu.this,SettingsActivity.class);
                startActivity(preferenceActivity);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        this.animate();

    }

    void animate(){
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
