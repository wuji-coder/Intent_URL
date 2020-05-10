package com.example.geturl;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button goButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geturl_intent);

        editText = (EditText)findViewById(R.id.edit_text);
        goButton = (Button)findViewById(R.id.botton);
        goButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //获取网址
                String url = editText.getText().toString();
                Intent intent = new Intent();
                //设置动作为ACTION_VIEW，为了启动隐式Intent
                intent.setAction(Intent.ACTION_VIEW);
                //设置data
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}
