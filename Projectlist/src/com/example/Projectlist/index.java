package com.example.Projectlist;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class index extends ListActivity{
	
	String classes[] = {"ReverseString"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(index.this, android.R.layout.simple_list_item_1, classes));
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		
		String donkey = classes[position];
		try{
		Class deer = Class.forName("com.example.Projectlist."+ donkey);
		Intent ourIntent = new Intent(index.this, deer);
		startActivity(ourIntent);
		
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
	

}
