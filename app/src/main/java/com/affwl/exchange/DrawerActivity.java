package com.affwl.exchange;

import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

public class DrawerActivity extends AppCompatActivity  {

    DrawerLayout drawerLayout;
    Toolbar toolbar;
    ActionBarDrawerToggle actionBarDrawerToggle;
    NavigationView navigationView;
    ImageView imgVsportsCup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer);

        setUpToolbar(); //calling below method



        imgVsportsCup=(ImageView)findViewById(R.id.imgVsportsCup);

//        imgVsportsCup.setOnClickListener(this);
    }
    private void setUpToolbar()
    {
    drawerLayout=(DrawerLayout)findViewById(R.id.drawerLayoutSports);
    toolbar=(Toolbar)findViewById(R.id.toolbarSports);
    setSupportActionBar(toolbar);

    actionBarDrawerToggle=new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.app_name,R.string.app_name);
    drawerLayout.addDrawerListener(actionBarDrawerToggle);
    actionBarDrawerToggle.syncState();
    }


//    public void onClick(View v) {
//        switch (v.getId()){
//            case R.id.imgVsportsCup:
//                startActivity(new Intent(this,IndieActivity.class)); break;


}
