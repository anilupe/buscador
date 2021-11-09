package cab.smart.buscador_canciones.views;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.widget.ProgressBar;


import androidx.appcompat.app.AppCompatActivity;

import cab.smart.buscador_canciones.MainActivity;
import cab.smart.buscador_canciones.R;

public class Splash_activity extends AppCompatActivity {

    private final int DURACION_SPLASH=1000;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_activity);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(Splash_activity.this, MainActivity.class));
                overridePendingTransition(R.anim.zoom_back_in, R.anim.zoom_back_out);

            }

        }, DURACION_SPLASH);
    }

}
