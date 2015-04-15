package br.edu.utfpr.cm.tcc;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends ActionBarActivity {

	Button btNovaRota, btMinhasRotas, btLinhasProximas, btSair;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.principal);

		btNovaRota = (Button) findViewById(R.id.btNovaRota);
		btMinhasRotas = (Button) findViewById(R.id.btMinhasRotas);
		btLinhasProximas = (Button) findViewById(R.id.btLinhasProximas);
		btSair = (Button) findViewById(R.id.btSair);

		btNovaRota.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {

				Intent novarota = new Intent(MainActivity.this, NovaRota.class);
				MainActivity.this.startActivity(novarota);
				MainActivity.this.finish();
			}
		});

		btMinhasRotas.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {

				Intent minhasrotas = new Intent(MainActivity.this, MinhasRotas.class);
				MainActivity.this.startActivity(minhasrotas);
				MainActivity.this.finish();
			}
		});
		
		btLinhasProximas.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				Intent linhasproximas = new Intent(MainActivity.this, LinhasProximas.class);
				MainActivity.this.startActivity(linhasproximas);
				MainActivity.this.finish();
			}
		});
	}
}
