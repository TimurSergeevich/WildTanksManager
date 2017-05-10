package name.wildtanksmanager.app;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.text.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
		// authorization visible
        setContentView(R.layout.authorization);
	
    }
	
	public void getAuthorization(View view){
		// main visible if authorizatiin good
		setContentView(R.layout.main);
	}
}
