package org.amalitech.userlogin;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class Activity_Index extends Activity {

	ImageView user_login_image_iv;
	EditText et_email, et_password_0, et_password_1; 
	Button btn_signup, btn_login;
	
	
	int email_len_i = 8;
	int password_len_i = 8;
	int email_max_len_i = 45;
	int password_max_len_i = 32;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
     	setContentView(R.layout.index_layout);
		
		user_login_image_iv = (ImageView) findViewById(R.id.user_login_image_iv);
		et_email = (EditText) findViewById(R.id.et_email);
		et_password_0 = (EditText) findViewById(R.id.et_password_0);
		et_password_1 = (EditText) findViewById(R.id.et_password_1);
		btn_signup = (Button) findViewById(R.id.btn_signup);
		btn_login = (Button) findViewById(R.id.btn_login);
		
		btn_signup.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(v.getId()==btn_signup.getId()) {
					//btn_login.setText("Sign Up Now");
					
					//EditText et_email = 
					et_Validator_bool(et_email, email_len_i, email_max_len_i);	
				}
				
			}
         public boolean et_Validator_bool(EditText et, int min_len_i, int max_len_i ) {
				String et_email_cntnt_str = et_email.getText().toString().trim();
				int et_email_cntnt_str_len = et_email_cntnt_str.length();
				boolean et_valid_bool = false;
				if(et_email_cntnt_str_len < min_len_i) {
					et_email.setBackgroundColor(Color.RED);
					et_valid_bool = false;
				}else {
					if(et_email_cntnt_str_len <= max_len_i ) {
						et_email.setBackgroundColor(Color.WHITE);
						et_valid_bool = true;
					}else {
						et_email.setBackgroundColor(Color.GRAY);
						et_valid_bool = false;
					}
					
				}
				
				return et_valid_bool;
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
