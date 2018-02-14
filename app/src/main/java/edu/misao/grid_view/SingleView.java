package edu.misao.grid_view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class SingleView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_single_view );

        Intent intent = getIntent();

        int position = intent.getExtras(  ).getInt( "id" );
        ImageAdapter imageAdapter = new ImageAdapter( this );

        ImageView imageView =(ImageView) findViewById( R.id.singleView );
        imageView.setImageResource( imageAdapter.mthumbnail[position] );

    }
}
