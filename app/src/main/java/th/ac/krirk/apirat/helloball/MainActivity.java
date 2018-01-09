package th.ac.krirk.apirat.helloball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import th.ac.krirk.apirat.helloball.fragment.MainFragment;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//      add fragment to activity
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.contentMainFragment, new MainFragment())
                    .commit();



        }

    }   //Main Method
}   // Main Class
