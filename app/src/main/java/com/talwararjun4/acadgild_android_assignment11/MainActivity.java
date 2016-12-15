package com.talwararjun4.acadgild_android_assignment11;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //https://www.google.co.in/search?q=joker
    Button searchButton = null;
    EditText editText=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText)findViewById(R.id.etView) ;
        searchButton = (Button)findViewById(R.id.button);

    }

    public void onButtonClick(View view){
     String keyword =editText.getText().toString();
        String[] tokens = keyword.split("\\s+");
        String finalStr ="";
        for(String token:tokens) {
            if(finalStr.equalsIgnoreCase(""))
                finalStr = finalStr + token;
            else
                finalStr = finalStr + "+"+token;
        }
        String searchUri ="https://www.google.co.in/search?q="+finalStr;

        Log.d("Arjun",searchUri);
    Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(searchUri));
        startActivity(i);
        }

}
