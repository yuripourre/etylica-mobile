package br.com.etyllica.core;

import android.app.Activity;
import android.os.Bundle;
import android.view.Display;
import android.view.Window;
import br.com.etyllica.core.application.Application;
import br.com.etyllica.core.loader.ImageLoader;

public class Etyllica extends Activity {

	private Core core;
	
	private int width;
	private int height;
		
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		
		ImageLoader.getInstance().setAssets(getAssets());
		
		Display display = getWindowManager().getDefaultDisplay();
		
		width = display.getWidth();
		height = display.getHeight();		
		
		core = new Core(this);
		
		startGame();
		
		setContentView(core);
	}
	
	public void startGame(){
	
	}
	
	protected void setMainApplication(Application application){
		core.setApplication(application);
	}

}