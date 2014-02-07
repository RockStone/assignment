package codepath.assignment.twitterclient.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import codepath.assignment.twitterclient.R;
import codepath.assignment.twitterclient.clients.TwitterClient;

import com.codepath.oauth.OAuthLoginActivity;

public class LoginActivity extends OAuthLoginActivity<TwitterClient> {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login, menu);
		return true;
	}

	@Override
	public void onLoginSuccess() {
		Intent i = new Intent(this, HomeActivity.class);
		startActivity(i);
	}

	@Override
	public void onLoginFailure(Exception e) {
		e.printStackTrace();
	}

	public void onLoginButton(View v) {
		getClient().connect();
	}
}
