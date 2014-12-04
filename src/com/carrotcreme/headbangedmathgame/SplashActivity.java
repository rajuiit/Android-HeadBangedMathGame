package com.carrotcreme.headbangedmathgame;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.Window;
import android.view.WindowManager;

public class SplashActivity extends Activity {

private int SPLASH_TIME = 3000;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN);
	
		setContentView(R.layout.activity_splash);
		
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				Intent intent = new Intent(SplashActivity.this, HomePageActvity.class);
				startActivity(intent);
				SplashActivity.this.finish();
			}
		};
		
		Handler h = new Handler();
		h.postDelayed(r, SPLASH_TIME);
	}

}
