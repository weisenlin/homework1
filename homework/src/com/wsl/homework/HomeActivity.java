package com.wsl.homework;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.os.Build;

public class HomeActivity extends ActionBarActivity {
	private EditText numberEditeEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        numberEditeEditText = (EditText)this.findViewById(R.id.number_et);
    }
    
    //��ǰ����Ŀؼ�
    public void onclick(View v){
    	String telNumber = numberEditeEditText.getText().toString().trim();//�Ѿ�����ĵ绰����
    	Button button = (Button)v;
    	String sysbom = button.getText().toString().trim();//ȡ�ð���ȥ������
    	telNumber = telNumber + sysbom;
    	numberEditeEditText.setText(telNumber);
    	numberEditeEditText.setSelection(telNumber.length());
    }
    
    public void call(View v){
    	Intent intent = new Intent();
    	String telNumber = numberEditeEditText.getText().toString().trim();//�Ѿ�����ĵ绰����
    	intent.setAction(Intent.ACTION_CALL);
    	intent.setData(Uri.parse("tel:"+telNumber));
    	startActivity(intent);
    }
    
    public void delete(View v){
    	String telNumber = numberEditeEditText.getText().toString().trim();//�Ѿ�����ĵ绰����
    	telNumber = telNumber.substring(0, telNumber.length()-1);
    	numberEditeEditText.setText(telNumber);
    	numberEditeEditText.setSelection(telNumber.length());	
    }

}
