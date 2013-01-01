package com.datastorage.preferences;

import com.datastorage.R;
import com.datastorage.R.id;
import com.datastorage.R.layout;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class Welcome extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.welcome);

		SharedPreferences preferences = getSharedPreferences("setting",
				MODE_PRIVATE);
		String username = preferences.getString("username", null);
		String password = preferences.getString("password", null);

		TextView textView = (TextView) findViewById(R.id.textview);
		textView.setText(username + "," + password);
	}
}
