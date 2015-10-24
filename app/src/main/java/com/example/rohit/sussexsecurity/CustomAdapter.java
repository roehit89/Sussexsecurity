package com.example.rohit.sussexsecurity;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Rohit on 10/16/2015.
 */
public class CustomAdapter extends ArrayAdapter<ListModel> {

    String [] result;
    int [] imageId;

    private static LayoutInflater inflater=null;
    private int position;
    private View convertView;
    private ViewGroup parent;
    private ArrayList<ListModel> arrayList1;
    private String TAG = "CustomAdapter";
    private String buttonPressed;
    Context context;

    public CustomAdapter(Context context,int resourceId, ArrayList<ListModel> arrayList, String buttonPressed)
    {
        super(context,resourceId, arrayList);
       try {
           this.arrayList1 = arrayList;
           this.context = context;
           this.buttonPressed = buttonPressed;
          // inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

           for (ListModel member : arrayList1) {
               Log.i(TAG + " array members", member.getPost_message());
           }
       }
       catch (Exception e)
       {
           Log.i(TAG+" error ala", e.getMessage());
       }
    }
    private class Viewholder
    {
        TextView textView;
        ImageView img;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        this.position = position;
        this.convertView = convertView;
        this.parent = parent;
        // TODO Auto-generated method stub
        Log.i(TAG+" getView called "," GET VIEW CALLED");
        Viewholder holder = null;
        View rowView = convertView;

        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);


        Log.i(TAG+" position", String.valueOf(position));

        if(convertView == null) {
            rowView = inflater.inflate(R.layout.eachlistelement, null);

            holder = new Viewholder();
            holder.textView = (TextView) rowView.findViewById(R.id.MyTextView);
            holder.img = (ImageView) rowView.findViewById(R.id.MyImageView);

            rowView.setTag(holder);
        }
        else
        {
            //rowView = convertView;
            holder = (Viewholder)rowView.getTag();

        }
        ListModel listModel = arrayList1.get(position);

        Log.i(TAG + " ghe he paha", listModel.getPost_message());
        Log.i(TAG + " ghe position", String.valueOf(position));

        holder.textView.setText(listModel.getPost_message());
        if(buttonPressed.equals("Crime"))
        holder.img.setImageResource(R.drawable.crime);
        if(buttonPressed.equals("Fire"))
            holder.img.setImageResource(R.drawable.fire);
        if(buttonPressed.equals("Water"))
            holder.img.setImageResource(R.drawable.plane);
        if(buttonPressed.equals("Extra"))
            holder.img.setImageResource(R.drawable.extra);



        // rowView.setTag(holder);

        return rowView;
    }

    @Override
    public int getCount() {
        return arrayList1.size();
    }


    @Override
    public long getItemId(int position) {
        return 0;
    }
}
