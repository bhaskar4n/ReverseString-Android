package com.example.Projectlist;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Build;

public class ReverseString extends ActionBarActivity {
	
	private EditText str;
	private Button enter;
	private TextView rstr;
	
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        str = (EditText)findViewById(R.id.editText1);
        enter = (Button)findViewById(R.id.button1);
        rstr = (TextView)findViewById(R.id.text4);
        
        enter.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				//try{
				String value1 = str.getText().toString();
				int monkey = value1.length();
				String res = "";
				for (int i = monkey-1; i>=0; i--){
					
				 String zebra  = value1.substring(i, i+1);
				 res = res+zebra;
				 }
								
				rstr.setText(res);
				
				}
				//catch(Exception e){
					//Toast warning = Toast.makeText(getApplicationContext(), "not allowed", Toast.LENGTH_SHORT);
					//warning.setMargin(50,50);
					//warning.setGravity(Gravity.CENTER_VERTICAL,0,0);
					//warning.show();
				//}
				
			
		});

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
        	Toast warning = Toast.makeText(getApplicationContext(), "not yet", Toast.LENGTH_SHORT);
			//warning.setMargin(50,50);
			warning.setGravity(Gravity.CENTER_VERTICAL,0,0);
			warning.show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    }

}
