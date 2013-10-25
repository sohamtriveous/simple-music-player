package com.pesit.sample;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
	MediaPlayer music;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		music = MediaPlayer.create(this, R.raw.i_am_waiting_for_you_last_summer);
		Button button = (Button) findViewById(R.id.music_button);
		button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				if (music.isPlaying()) {
					Toast.makeText(MainActivity.this, "music paused",
							Toast.LENGTH_LONG).show();
					music.pause();
				} else {
					Toast.makeText(MainActivity.this, "music started",
							Toast.LENGTH_LONG).show();
					music.start();
				}

			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
