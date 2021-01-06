package com.riji.employeeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun submitted(view: View) {
        var getEmployeeCode=findViewById<EditText>(R.id.empcode);
        var getEmployeeName=findViewById<EditText>(R.id.empname);
        var getSalary=findViewById<EditText>(R.id.salary);
        var getDesignation=findViewById<EditText>(R.id.des);
        Toast.makeText(this,getEmployeeCode.text.toString()+"  "+
                getEmployeeName.text.toString()+"  "+getSalary.text.toString()+
                "  "+getDesignation.text.toString(),Toast.LENGTH_LONG).show();
    }
}