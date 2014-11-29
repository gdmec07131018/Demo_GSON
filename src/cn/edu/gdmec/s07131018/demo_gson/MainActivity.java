package cn.edu.gdmec.s07131018.demo_gson;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		List<String> phones = new ArrayList<String>();
		phones.add("11122332");
		phones.add("1123423");
		phones.add("134568");
		
		Person person = new Person("lisi",20, phones);
		
		Gson gson = new Gson();
		String string=gson.toJson(person);
		Log.i("info",string);
		
		Person person1 = gson.fromJson(string, Person.class);
		Log.i("info","通过GSON生成的java对象"+person1.toString());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
