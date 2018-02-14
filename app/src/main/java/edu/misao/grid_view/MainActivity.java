package edu.misao.grid_view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        GridView gridView = findViewById( R.id.gridView );


        gridView.setAdapter( new ImageAdapter( this ) );


        gridView.setOnItemClickListener( new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Intent intent = new Intent( getApplicationContext() ,SingleView.class);
                intent.putExtra( "id",position );
                startActivity( intent );


            }
        } );


    }
}


/*
①main.xmalをGridViewにする
idをつける、幅・高さは必ず"match_parent"、numColumnsで行を決める
②imaegeをタップした時に表示するアクティビティページを作る
③imageを管理するためのImageAdapter(BaseAdapterを継承した)クラスを作成
getter,setterをoverride、contextのコンストラクターを作成





 */