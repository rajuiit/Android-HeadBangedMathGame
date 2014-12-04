package com.carrotcreme.headbangedmathgame;

import com.carrotcreme.headbangedmathgame.utils.AppConstant;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class HomePageActvity extends Activity {

	private Button btnEasy;
	private Button btnMedium;
	private Button btnHard;

	/*private ProgressBar progressBar;
	private static int myProgress = 0;
	private int progressStatus = 0;
	private Handler myHandler = new Handler();*/

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);

		setContentView(R.layout.activity_home_page);

		initView();
		initAction();

	}

	private void initView() {
		this.btnEasy = (Button) this.findViewById(R.id.btnEasy);
		this.btnMedium = (Button) this.findViewById(R.id.btnMedium);
		this.btnHard = (Button) this.findViewById(R.id.btnHard);
	
	}

	private void initAction() {

		this.btnEasy.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(HomePageActvity.this, MainGameActivity.class);
				intent.putExtra(AppConstant.GAME_KEY, AppConstant.GAME_TYPE_EASY);
				startActivity(intent);
			}
		});
		this.btnMedium.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(HomePageActvity.this, MainGameActivity.class);
				intent.putExtra(AppConstant.GAME_KEY, AppConstant.GAME_TYPE_MEDIUM);
				startActivity(intent);
			}
		});
		this.btnHard.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(HomePageActvity.this, MainGameActivity.class);
				intent.putExtra(AppConstant.GAME_KEY, AppConstant.GAME_TYPE_HARD);
				startActivity(intent);
			}
		});
		
	}

	

	/*public void beginYourTask(View view) {
		myProgress = 0;
		progressBar.setMax(100);

		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				while (progressStatus < 100) {
					progressStatus = performTask();
					myHandler.post(new Runnable() {
						public void run() {
							progressBar.setProgress(progressStatus);
						}
					});

				}
				myHandler.post(new Runnable() {

					@Override
					public void run() {
						// TODO Auto-generated method stub
						Toast.makeText(getBaseContext(), "Task Completed",
								Toast.LENGTH_LONG).show();
						progressStatus = 0;
						myProgress = 0;

					}
				});

			}

			private int performTask() {
				try {
					// ---Do some task---
					Thread.sleep(20);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				return ++myProgress;
			}
		}).start();
	}*/

}
