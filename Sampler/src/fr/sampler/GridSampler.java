package fr.sampler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class GridSampler extends Activity {

	MediaPlayer mp_r1_c1 ;
	MediaPlayer mp_r1_c2 ;
	MediaPlayer mp_r1_c3 ;
	MediaPlayer mp_r1_c4 ;
	MediaPlayer mp_r1_c5 ;
	MediaPlayer mp_r1_c6 ;

	List<MediaPlayer> mps = new ArrayList<MediaPlayer>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_grid_sampler);

		//Setting up sounds
		mp_r1_c1 = MediaPlayer.create(GridSampler.this,R.raw.maisouicestclair);
		mp_r1_c2 = MediaPlayer.create(GridSampler.this,R.raw.eddymalou);
		mp_r1_c3 = MediaPlayer.create(GridSampler.this,R.raw.congolexicomatisation);
		mp_r1_c4 = MediaPlayer.create(GridSampler.this,R.raw.fermela);
		mp_r1_c5 = MediaPlayer.create(GridSampler.this,R.raw.worstnoiseever);
		mp_r1_c6 = MediaPlayer.create(GridSampler.this,R.raw.allezciao);

		//Setting up button references
		Button button_r1_c1 = (Button) findViewById(R.id.button_r1_c1);
		button_r1_c1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(final View v) {
				mp_r1_c1.start();
				mps.add(mp_r1_c1);
			}
		});
		Button button_r1_c2 = (Button) findViewById(R.id.button_r1_c2);
		button_r1_c2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				mp_r1_c2.start();
				mps.add(mp_r1_c2);
			}
		});
		Button button_r1_c3 = (Button) findViewById(R.id.button_r1_c3);
		button_r1_c3.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				mp_r1_c3.start();
				mps.add(mp_r1_c3);
			}
		});
		Button button_r1_c4 = (Button) findViewById(R.id.button_r1_c4);
		button_r1_c4.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				mp_r1_c4.start();
				mps.add(mp_r1_c4);
			}
		});
		Button button_r1_c5 = (Button) findViewById(R.id.button_r1_c5);
		button_r1_c5.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				mp_r1_c5.start();
				mps.add(mp_r1_c5);
			}
		});
		Button button_r1_c6 = (Button) findViewById(R.id.button_r1_c6);
		button_r1_c6.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				mp_r1_c6.start();
				mps.add(mp_r1_c6);
			}
		});


		Button button_stop = (Button)findViewById(R.id.button_stop);
		button_stop.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {

//				for (MediaPlayer mp : mps)
//				{
//					if(mp.isPlaying()) 
//					{
//						mp.stop();
//						mp.release();
//						try {
//							mp.prepare();
//						} catch (IllegalStateException e) {
//							// TODO Auto-generated catch block
//							e.printStackTrace();
//						} catch (IOException e) {
//							// TODO Auto-generated catch block
//							e.printStackTrace();
//						}
//					}
//					mps.remove(mp);
//				}
			}
		});


	}
}
