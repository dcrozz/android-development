package com.example.alex.ws1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends Activity implements View.OnClickListener {
    EditText txt_UserName, txt_UserPW;
    Button btn_Login;

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        btn_Login = (Button) findViewById(R.id.btn_Login);

        txt_UserName = (EditText) findViewById(R.id.txt_UserName);

        txt_UserPW = (EditText) findViewById(R.id.txt_UserPW);

// Register the Login button to click listener

// Whenever the button is clicked, onClick is called

        btn_Login.setOnClickListener(this);

    }

    @Override

    public void onClick(View v) {

// TODO Auto-generated method stub

        if (v.getId() == R.id.btn_Login) {

            String uname = txt_UserName.getText().toString();

            String upassword = txt_UserPW.getText().toString();

            System.out.println("@@@@@@@@@@@@@@@\n" +

                    "The Portal ID is: " + uname + "\n" +

                    "The Password is: " + upassword + "\n" +

                    "@@@@@@@@@@@@@@@");
            Intent intent = new Intent(getBaseContext(), CourseListActivity.class);
            ArrayList<String> cname = new ArrayList<String>();
            ArrayList<String> cteachers = new ArrayList < String > ();
            ///**************Sample Datta**************//
            cname.add("c11");
            cteachers.add("t1");
            cname.add("c22");
            cteachers.add("t2");
            cname.add("c33");
            cteachers.add("t3");
            cname.add("c44");
            cteachers.add("t4");
            ///**************Sample Datta**************//
            intent.putStringArrayListExtra("CourseName", cname);
            intent.putStringArrayListExtra("Teachers", cteachers);
            startActivity(intent);
        }

    }
}