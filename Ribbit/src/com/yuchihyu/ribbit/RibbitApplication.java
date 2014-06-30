package com.yuchihyu.ribbit;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class RibbitApplication extends Application {
	
	@Override
	public void onCreate() { 
		super.onCreate();
	    Parse.initialize(this, "1VXalJo4ftJYmRlygqcJRiwd9MFKawtsQOtjV6AK", "uQl5xgANCy1BkOKavw9sIfIoyGfj1ouxGZwIOAo3");
	    
	}
}
