package com.datastorage.sqlite;

import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.datastorage.R;

public class SqliteActivity extends Activity {
	private UserManager userManager;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sqlite_activity);

		userManager = new UserManager(this);

		ListView lvSqlite = (ListView) findViewById(R.id.lv_sqlite);
		List<User> users = userManager.select("hello");
		lvSqlite.setAdapter(new ArrayAdapter<User>(SqliteActivity.this,
				android.R.layout.simple_expandable_list_item_1, users));

	}
}
