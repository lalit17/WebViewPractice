package com.example.ednite;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.os.Handler;
        import android.view.WindowManager;
        import android.view.animation.Animation;
        import android.view.animation.AnimationUtils;
        import android.widget.ImageView;

public class SplashScreen extends AppCompatActivity {
Animation animation;
ImageView imageView;
private static int SPLASH=1500;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);
    imageView=findViewById(R.id.image);
    animation= AnimationUtils.loadAnimation(this, R.anim.animation);
    imageView.setAnimation(animation);
    new Handler().postDelayed(new Runnable() {
        @Override
        public void run() {
            Intent i=new Intent(SplashScreen.this,MainActivity.class);
            startActivity(i);
            finish();
        }
    },SPLASH);
    }
}
