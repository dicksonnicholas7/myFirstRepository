package com.journalio.android;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.TextView;




/****
 * 
 * Journalio App 
 * 1. This is the profile Activity. It basically displays the profile page when called from either the main news activity or the my post activity
 * 2. The first stage is the declaration of variables. TextView tab_0, tab_1; Context ctx;
 * 3. The onCreate Method gets our profile activity_profile_page layout created and running - setContentView(R.layout.activity_profile_page);
 * 4. The variables declared in step 2 are all initialized with the appropiate objects. tab_0 = (TextView )findViewById(R.id.nav_tv_0); tab_1 = (TextView)findViewById(R.id.nav_tv_1);
 * 5. tab_0.setOnTouchListener 0 This line of code listens to touch events on the Trending Tab and desiplays/runs the trending activity once the Tab is selected and active.
 * 6. for(int x=0; x<3; x++) - A loop that checks for the active Tab and displays a line(View) to indicate it.
 * *****/


@SuppressLint("ClickableViewAccessibility")
public class Activity_Profile extends Activity {

	TextView tab_0, tab_1;
     Context ctx;
     int view_indicator;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);		
		setContentView(R.layout.activity_profile_page);
		
		
		//initialization of variables
	    tab_0 = (TextView )findViewById(R.id.nav_tv_0);		
		tab_1 = (TextView)findViewById(R.id.nav_tv_1);

      tab_0.setOnTouchListener(new OnTouchListener() {		
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				if(v.getId()==tab_0.getId()) {
				switch (event.getActionMasked()){
  						case MotionEvent.ACTION_DOWN:
  						case MotionEvent.ACTION_POINTER_DOWN: {
  							//change color or background  ( new )
  							break;
  						}
  						case MotionEvent.ACTION_UP:
  						case MotionEvent.ACTION_POINTER_UP: {
  							//do the action
  							Intent activity_Post_intent = new Intent(Activity_Profile.this, Activity_MainNewsPage.class );
  							startActivity(activity_Post_intent); 
  							finish();
  							break;
  						}
  						case MotionEvent.ACTION_MOVE:{ 							
  							//finger moved : deactivate the whole action  							
  							break;
  						}
  					}
				}
				return true;
			}
		});
		
		
          tab_1.setOnTouchListener(new OnTouchListener() {			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				if(v.getId()==tab_1.getId()) {
				switch (event.getActionMasked()){
  						case MotionEvent.ACTION_DOWN:
  						case MotionEvent.ACTION_POINTER_DOWN: {
  							//change color or background  ( new )
  							break;
  						}
  						case MotionEvent.ACTION_UP:
  						case MotionEvent.ACTION_POINTER_UP: {  	
  							//do the action
  							Intent activity_Post_intent = new Intent(Activity_Profile.this, Activity_Poster.class );
  							startActivity(activity_Post_intent);
  							finish();
  							break;
  						}
  						case MotionEvent.ACTION_MOVE:{  							
  							//finger moved : deactivate the whole action  							
  							break;
  						}
  					}
				}
				return true;
			}
		});
	}
	
	
	
	public TextView nav_TV(int total_num_i, String prefix_str, int tv_i){
		String[] textView_tv_ids = new String[total_num_i];
		TextView[] textView_full_IDs = new TextView[total_num_i];
		textView_tv_ids[tv_i] = prefix_str+Integer.toString(tv_i);
		int textView_tv_ID = ctx.getResources().getIdentifier(textView_tv_ids[tv_i], "id", "com.journalio.android");
		textView_full_IDs[tv_i] = (TextView)findViewById(textView_tv_ID);
		return textView_full_IDs[tv_i];
	}
	
	
	
	
	
	
	
	public View nav_V(int total_num_i, String prefix_str, int v_i){
		String[] view_ids = new String[total_num_i];
		View[] view_full_IDs = new View[total_num_i];
		view_ids[v_i] = prefix_str+Integer.toString(v_i);
		int view_ID = ctx.getResources().getIdentifier(view_ids[v_i], "id", "com.journalio.android");
		view_full_IDs[v_i] = (View)findViewById(view_ID);
		return view_full_IDs[v_i];
	}
	
	

}
