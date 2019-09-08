package com.example.midterm07590483;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.midterm07590483.Auth.Auth;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button loginbuttom =findViewById(R.id.login_button);

        loginbuttom.setOnClickListener(new View.OnClickListener() {
            Toast t=Toast.makeText(MainActivity.this,"Hello",Toast.LENGTH_SHORT);

            @Override
            public void onClick(View view) {
                EditText eamieditText=findViewById(R.id.username_editText);
                EditText paswordeditText=findViewById(R.id.password_editText);

                String inputuser=eamieditText.getText().toString();
                String inputpasword=paswordeditText.getText().toString();

                /*Auth auth = new Auth(inputuser,inputpasword);
                Boolean c = auth.check();*/
                if(inputuser.equals("bbb")&&inputpasword.equals("222")) {
                    Intent intent = new Intent(MainActivity.this, profile.class);
                    startActivity(intent);
                }else if(inputuser.equals("aaa")&&inputpasword.equals("111")) {
                    Intent intent1 = new Intent(MainActivity.this, profile2.class);
                    startActivity(intent1);
                }

                else{
                    AlertDialog.Builder dialog=new AlertDialog.Builder(MainActivity.this);
                    dialog.setTitle("Error");
                    dialog.setMessage(R.string.login_failed);
                    dialog.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    });
                    dialog.setNegativeButton("cacel", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    });
                    dialog.setNeutralButton("Innote", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    });
                    dialog.show();

                }


            }


    });
    }
    }

