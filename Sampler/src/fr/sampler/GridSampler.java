package fr.sampler;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class GridSampler extends Activity {

	MediaPlayer mp_r1_c1 ;
	MediaPlayer mp_r1_c3 ;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_grid_sampler);
		
		//Setting up sounds
		mp_r1_c1 = MediaPlayer.create(GridSampler.this,R.raw.maisouicestclair);
		mp_r1_c3 = MediaPlayer.create(GridSampler.this,R.raw.fermela);
		
		//Setting up button references
		Button button_r1_c1 = (Button) findViewById(R.id.button_r1_c1);
		button_r1_c1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				mp_r1_c1.start();
			}
		});

		Button button_r1_c3 = (Button) findViewById(R.id.button_r1_c3);
		button_r1_c3.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				mp_r1_c3.start();
			}
		});
		
		
	}
}
