package org.me.myandroidstuff;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ScrollTest2Activity extends Activity 
{
	private TextView labels[];
	private LinearLayout ll1;

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		ll1 = (LinearLayout) findViewById(R.id.linearLayout1);
		
		labels = new TextView[14];
		
		for (int count = 0;  count <=13;count++)
		{
			labels[count] = new TextView(this);
			labels[count].setText("Label" + count);
			labels[count].setTextSize(40);
			ll1.addView(labels[count]);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) 
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
