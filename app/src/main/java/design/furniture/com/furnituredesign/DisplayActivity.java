package design.furniture.com.furnituredesign;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.content.Intent;
import android.widget.ImageView;
import android.view.View.OnClickListener;

import design.furniture.com.furnituredesign.R;

/**
 * Created by BoonRoom on 4/8/2018.
 */

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.displayitem);
        if(getSupportActionBar()!=null)
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageView img = (ImageView) findViewById(R.id.imageView);
        img.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if(v.getId() == R.id.imageView){
                    Intent i = new Intent(DisplayActivity.this, DisplayDescActivity.class);
                    startActivity(i);
                }
            }
        });

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        startActivity(new Intent(getApplicationContext(), ScrollingActivity.class));
        finish();
        return true;
    }

}
