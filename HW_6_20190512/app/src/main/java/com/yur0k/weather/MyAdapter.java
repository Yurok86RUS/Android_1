package com.yur0k.weather;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private String[] data = {"Город","Дата","День","Ночь","Москва","22.12.2018","4","-12","Москва","23.12.2018","8","-50","Москва","24.12.2018","45","-35",
                                "Москва","25.12.2018","56","-95","Москва","26.12.2018","898","-851"};

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new MyViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.view_item, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int position) {
        myViewHolder.binds(data[position]);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView textView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.itemText);
        }

        public void binds(String text){
            textView.setText(text);
        }
    }

}
