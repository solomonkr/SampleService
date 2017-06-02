package kr.iuu.sampleservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editText);
    }

    public void onButton1Clicked(View v){
        String name = editText.getText().toString();

        Intent intent = new Intent(this, MyService.class);
        intent.putExtra("command","show");
        intent.putExtra("name",name);
        startService(intent);
    }

}
