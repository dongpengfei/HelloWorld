package com.datastorage.sqlite;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class UserManager {

	private DBOpenHelper helper;
	private SQLiteDatabase db;

	public UserManager(Context context) {
		helper = new DBOpenHelper(context);
		db = helper.getWritableDatabase();
	}

	public List<User> select(String username) {
		List<User> users = new ArrayList<User>();
		String sql = "select * from db_user where username='" + username + "'";
		Cursor cursor = db.rawQuery(sql, null);
		while (cursor.moveToNext()) {
			User user = new User();
			user.setId(cursor.getInt(cursor.getColumnIndex("_id")));
			user.setUsername(cursor.getString(cursor.getColumnIndex("username")));
			user.setPassword(cursor.getString(cursor.getColumnIndex("password")));
			users.add(user);
		}
		return users;
	}

	public void insert(User user) {
	}

	public void update(User user) {

	}

	public void delete(int id) {

	}

}
