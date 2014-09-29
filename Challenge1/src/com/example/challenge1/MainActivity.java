package com.example.challenge1;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity implements OnClickListener {

	TextView electronicsTextView;
	TextView booksTextView;
	TextView sportingTextView;
	TextView fitnessTextView;
	TextView fashionTextView;
	TextView giftsTextView;
	Intent shoppingIntent;
	ImageButton mailImageButton;
	ImageButton callImageButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		electronicsTextView = (TextView) findViewById(R.id.textView1);
		booksTextView = (TextView) findViewById(R.id.textView2);
		sportingTextView = (TextView) findViewById(R.id.textView3);
		fitnessTextView = (TextView) findViewById(R.id.textView4);
		fashionTextView = (TextView) findViewById(R.id.textView5);
		giftsTextView = (TextView) findViewById(R.id.textView6);
		mailImageButton = (ImageButton) findViewById(R.id.imageButton3);
		callImageButton = (ImageButton) findViewById(R.id.imageButton2);

		electronicsTextView.setOnClickListener(this);
		booksTextView.setOnClickListener(this);
		sportingTextView.setOnClickListener(this);
		fitnessTextView.setOnClickListener(this);
		fashionTextView.setOnClickListener(this);
		giftsTextView.setOnClickListener(this);
		mailImageButton.setOnClickListener(this);
		callImageButton.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub

		switch (v.getId()) {

		case R.id.textView1:
			shoppingIntent = new Intent(this, ElectronicsProducts.class);
			startActivity(shoppingIntent);
			break;

		case R.id.textView2:
			shoppingIntent = new Intent(this, BooksProducts.class);
			startActivity(shoppingIntent);
			break;

		case R.id.textView3:
			shoppingIntent = new Intent(this, SportingProducts.class);
			startActivity(shoppingIntent);
			break;

		case R.id.textView4:
			shoppingIntent = new Intent(this, HealthProducts.class);
			startActivity(shoppingIntent);
			break;

		case R.id.textView5:
			shoppingIntent = new Intent(this, FashionProducts.class);
			startActivity(shoppingIntent);
			break;

		case R.id.textView6:
			shoppingIntent = new Intent(this, GiftsProducts.class);
			startActivity(shoppingIntent);
			break;

		case R.id.imageButton2:
			// Call
			Toast.makeText(this, "called", Toast.LENGTH_SHORT).show();
			String url = "tel:6363646082";
			Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse(url));
			startActivity(intent);
			break;

		case R.id.imageButton3:
			// mail
			break;
		}
	}
}
