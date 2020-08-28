package com.blogapp.aws.movieuitemplate.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.blogapp.aws.movieuitemplate.R;
import com.blogapp.aws.movieuitemplate.models.Cast;
import com.bumptech.glide.Glide;

import java.util.List;

public class CastAdapter extends RecyclerView.Adapter<CastAdapter.CastViewHolder> {

    Context mContext;
    List<Cast> mData;

    public CastAdapter(Context mContext, List<Cast> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public CastViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(mContext).inflate(R.layout.item_cast,viewGroup,false);
        return new CastViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CastViewHolder castViewHolder, int i) {

        Glide.with(mContext).load(mData.get(i).getImg_link()).into(castViewHolder.img);
        castViewHolder.CastName.setText(mData.get(i).getName());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class  CastViewHolder extends RecyclerView.ViewHolder{

        private TextView CastName;

        ImageView img;
        public CastViewHolder(@NonNull View itemView) {
            super(itemView);
            CastName=itemView.findViewById(R.id.item_cast_name);
            img=itemView.findViewById(R.id.img_cast);
        }
    }
}
