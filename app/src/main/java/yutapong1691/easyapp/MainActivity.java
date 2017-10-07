package yutapong1691.easyapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import yutapong1691.easyapp.fragment.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            // add Fragment to activity
        if (savedInstanceState == null){
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.contentfragment,new MainFragment())
                    .commit();

        }
    } //Main Method
} //Main Class
