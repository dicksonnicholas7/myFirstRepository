package com.myfoodapp.foodapp;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;



public class Activity_Index extends Activity {


	EditText tv_email, tv_password;
	ImageView iv_image_icon;
	Button btn_signup;

	
	int email_max_len = 45, email_min_len = 32, password_max_len = 16, password_min_len = 8;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.index_layout);
		
		tv_email = (EditText)findViewById(R.id.tv_email);
		tv_password = (EditText) findViewById(R.id.tv_password);
		btn_signup = (Button) findViewById(R.id.btn_signup);
		
		
		btn_signup.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				String email_str = tv_email.getText().toString().trim();
				int email_str_len = email_str.length();
				if(v.getId() == btn_signup.getId()) {

					if(email_str_len < email_min_len) {
						tv_email.setBackgroundColor(Color.RED);
					}else {
						if(email_str_len <= email_max_len ) {
							tv_email.setBackgroundColor(Color.WHITE);
						}else {
							tv_email.setBackgroundColor(Color.BLACK);
							tv_email.setTextColor(Color.WHITE);
						}
				
					}
					
					
				}
				
				
			}
		});
		
	}


	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
	}

	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
	}
	
	

}
