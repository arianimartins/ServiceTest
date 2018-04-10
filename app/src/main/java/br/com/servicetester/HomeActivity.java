package br.com.servicetester;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

@SuppressLint("NewApi")
public class HomeActivity extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		carregarBotoes();
	}

	private void carregarBotoes() {
		Button proximo = (Button) findViewById(R.id.btn_entrar);
		proximo.setOnClickListener(this);
	}

	public void onClick(View arg0) {
		Intent entrar = new Intent(this, ListServiceActivity.class);
		startActivity(entrar);

	}
}
