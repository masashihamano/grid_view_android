package edu.misao.grid_view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by masashihamano on 2018/02/12.
 */

public class ImageAdapter extends BaseAdapter {

    Context context;


    public ImageAdapter(Context context)
    {
        this.context = context;
    }


    @Override
    public int getCount() {
        return mthumbnail.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null)//何も入ってなかったらimageviewを設置
        {
            imageView = new ImageView( context );
            imageView.setLayoutParams( new GridView.LayoutParams( 85,85 ) );
            imageView.setScaleType( ImageView.ScaleType.CENTER_CROP );
            imageView.setPadding( 8,8,8,8 );
        }
        else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource( mthumbnail[position] );
        return imageView;
    }


    public Integer[] mthumbnail ={
            R.drawable.angkor_wat,R.drawable.cappadocia,R.drawable.everest,R.drawable.grand_canyon,R.drawable.machu_picchu,
            R.drawable.maldives,R.drawable.petra,R.drawable.uluru,R.drawable.uyuni,R.drawable.venezia,
            R.drawable.angkor_wat,R.drawable.cappadocia,R.drawable.everest,R.drawable.grand_canyon,R.drawable.machu_picchu,
            R.drawable.maldives,R.drawable.petra,R.drawable.uluru,R.drawable.uyuni,R.drawable.venezia,
            R.drawable.angkor_wat,R.drawable.cappadocia,R.drawable.everest,R.drawable.grand_canyon,R.drawable.machu_picchu,
            R.drawable.maldives,R.drawable.petra,R.drawable.uluru,R.drawable.uyuni,R.drawable.venezia,
            R.drawable.angkor_wat,R.drawable.cappadocia,R.drawable.everest,R.drawable.grand_canyon,R.drawable.machu_picchu,
            R.drawable.maldives,R.drawable.petra,R.drawable.uluru,R.drawable.uyuni,R.drawable.venezia
    };
}
