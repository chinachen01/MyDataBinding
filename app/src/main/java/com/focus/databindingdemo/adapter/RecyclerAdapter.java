package com.focus.databindingdemo.adapter;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.focus.databindingdemo.R;
import com.focus.databindingdemo.databinding.ItemRecyclerBinding;
import com.focus.databindingdemo.model.User;


import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * Created by chenyong on 16-9-22.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.BinderHolder>{
    @NotNull
    private List<User> mUsers;

    public RecyclerAdapter(@NotNull List<User> mUsers) {
        this.mUsers = mUsers;
    }

    @Override
    public BinderHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler, parent, false);
        return new BinderHolder(view);
    }

    @Override
    public void onBindViewHolder(BinderHolder holder, int position) {
        User user = mUsers.get(position);
        holder.bindUser(user);
    }

    @Override
    public int getItemCount() {
        return mUsers.size();
    }

    class BinderHolder extends RecyclerView.ViewHolder{
        ItemRecyclerBinding mBinding;
        public BinderHolder(View itemView) {
            super(itemView);
            mBinding = DataBindingUtil.bind(itemView);
        }

        public void bindUser(User user) {
            mBinding.setUser(user);
        }
    }

}
