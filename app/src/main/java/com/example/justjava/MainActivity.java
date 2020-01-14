package com.example.justjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void minus(View view)
    {
        TextView a = (TextView) findViewById(R.id.quantity);
        String b = a.getText().toString();
        int c =Integer.parseInt(b);
        if(c!=0)
        {
            c=c-1;
        }
        a.setText(""+c);
    }
    public void plus(View view)
    {
        TextView a = (TextView) findViewById(R.id.quantity);
        String b = a.getText().toString();
        int c =Integer.parseInt(b);
        c=c+1;
        a.setText(""+c);
    }
    public void order(View view)
    {
        TextView a = (TextView) findViewById(R.id.finish);
        TextView a2 = (TextView) findViewById(R.id.quantity);
        String b = a2.getText().toString();
        int c =Integer.parseInt(b);
        CheckBox ch = (CheckBox) findViewById(R.id.whipped);
        Boolean bl = ch.isChecked();
        CheckBox ch2 = (CheckBox) findViewById(R.id.whipped);
        Boolean bs = ch.isChecked();
        EditText bk =(EditText) findViewById(R.id.name);
        String s= "NAME :"+ bk.getText().toString();
         s = s+"\nYou have ordered" + c + "cups of coffee\n";
        s= s+ "Whipped cream added? "+ bl + "\n";
        s=s+"Chocolate added? "+ bs +"\n";
        a.setText(s);
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plane");
        intent.putExtra(Intent.EXTRA_EMAIL,"coffee@gmail.com");
        intent.putExtra(Intent.EXTRA_SUBJECT,"COFFEE ORDERING");
        intent.putExtra(Intent.EXTRA_TEXT,s);
            startActivity(intent);



    }
}
