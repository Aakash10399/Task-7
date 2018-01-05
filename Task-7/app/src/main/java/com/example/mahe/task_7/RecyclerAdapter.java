package com.example.mahe.task_7;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {
    public ArrayList<String> moviesList = new ArrayList<>();
    public ArrayList<String> castList = new ArrayList<>();
    public ArrayList<String> descList = new ArrayList<>();
    public RecyclerAdapter(ArrayList<String> moviesList,ArrayList<String> castList,ArrayList<String> descList) {
        this.moviesList = moviesList;
        this.castList = castList;
        this.descList = descList;
    }
    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView movname, cast, desc;
        public MyViewHolder(View view) {
            super(view);
            movname = (TextView) view.findViewById(R.id.movname);
            cast = (TextView) view.findViewById(R.id.cast);
            desc = (TextView) view.findViewById(R.id.desc);
        }
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_layout, parent, false);
        return new MyViewHolder(itemView);
    }
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.movname.setText(moviesList.get(position));
        holder.cast.setText(castList.get(position));
        holder.desc.setText(descList.get(position));
    }
    @Override
    public int getItemCount() {
        return moviesList.size();
    }
}