package com.datastorage.preferences;

import com.datastorage.R;
import com.datastorage.R.id;
import com.datastorage.R.layout;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class DataStorageActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button b_login = (Button) findViewById(R.id.b_login);
        b_login.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				EditText et_usename= (EditText) findViewById(R.id.et_username);
				String username = et_usename.getText().toString();
				
				EditText et_password = (EditText) findViewById(R.id.et_password);
				String password = et_password.getText().toString();
				
				SharedPreferences preferences = getSharedPreferences("setting", MODE_PRIVATE);
		        SharedPreferences.Editor editor = preferences.edit();
		        editor.putString("username", username);
		        editor.putString("password", password);
		        editor.commit();
		        
		        Intent intent = new Intent(DataStorageActivity.this, Welcome.class);
		        startActivity(intent);
			}
		});
        
        
    }
}