package co.sreeram.menu;

/**
 * Created by Sreeram AN on 01/03/2017.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CustomAdapter extends BaseAdapter{

    String [] result;
    Context context;
    int [] imageId;
    private static LayoutInflater inflater=null;
    public CustomAdapter(MainActivity mainActivity, String[] prgmNameList, int[] prgmImages) {
        result=prgmNameList;
        context=mainActivity;
        imageId=prgmImages;
        inflater = ( LayoutInflater )context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return result.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public class Holder
    {
        TextView tv;
        ImageView img;
    }
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        Holder holder=new Holder();
        View rowView;
        rowView = inflater.inflate(R.layout.foodlist, null);
        holder.tv=(TextView) rowView.findViewById(R.id.textView1);
        holder.img=(ImageView) rowView.findViewById(R.id.imageView1);
        holder.tv.setText(result[position]);
        holder.img.setImageResource(imageId[position]);
        rowView.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(context, "You have Selected "+result[position], Toast.LENGTH_SHORT).show();
            }
        });
        return rowView;
    }
}