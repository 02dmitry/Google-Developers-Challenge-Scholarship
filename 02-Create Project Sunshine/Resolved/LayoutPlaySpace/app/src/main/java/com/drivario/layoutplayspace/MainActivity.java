package com.drivario.layoutplayspace;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToUdacity (View view) {
        goToUrl ( "https://classroom.udacity.com/courses/ud851-emea/");
    }

    public void goToSlack (View view) {
        goToUrl ( "https://anddev-challenge.slack.com/messages/C7JANKNF7/");
    }

    public void goToUdacityForum (View view) {
        goToUrl ( "https://discussions.udacity.com/c/standalone-courses/ud851-emea/");
    }


    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }


}
