package com.carrotcreme.headbangedmathgame;

import com.carrotcreme.headbangedmathgame.utils.AppConstant;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MainGameActivity extends Activity {
	
	private String gameType = "";
	
	private Button btnCorrect;
	private Button btnWrong;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);

		setContentView(R.layout.activity_main_game);

		this.gameType = getIntent().getExtras().getString(AppConstant.GAME_KEY);
		
		Log.e("GAME_TYPE", "is: "+this.gameType);
		
		initView();
		initAction();

	}

	

	private void initView() 
	{
		this.btnCorrect = (Button)this.findViewById(R.id.btnCorrect);
		this.btnWrong = (Button)this.findViewById(R.id.btnWrong);
		
	}
	private void initAction() 
	{
		
		
	}
}
