package com.example.smsmanger;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {

	private TabHost tabHost;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		tabHost=getTabHost();
		addTab("conversation", "会话", R.drawable.tab_conversation, Conversation.class);
		addTab("folder", "文件组", R.drawable.tab_folder, FolderUI.class);
		addTab("group","群组" , R.drawable.tab_group, GroupUI.class);
	}


	private void addTab(String tag, CharSequence label, int id, Class<?> clazz){
		
		TabSpec tabSpec=tabHost.newTabSpec(tag);
		
		
		
		tabSpec.setIndicator(label,getResources().getDrawable(id));
		tabSpec.setContent(new Intent(this, clazz));
		tabHost.addTab(tabSpec);
	
	}
}
