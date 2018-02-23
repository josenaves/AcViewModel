package com.josenaves.acviewmodel.home;

import android.support.v7.util.DiffUtil;

import com.josenaves.acviewmodel.model.Repo;

import java.util.List;

public class RepoDiffCallback extends DiffUtil.Callback {

    private final List<Repo> oldList;
    private final List<Repo> newList;

    RepoDiffCallback(List<Repo> oldList, List<Repo> newList) {
        this.oldList = oldList;
        this.newList = newList;
    }

    @Override
    public int getOldListSize() {
        return oldList.size();
    }

    @Override
    public int getNewListSize() {
        return newList.size();
    }

    @Override
    public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
        return oldList.get(oldItemPosition).id() ==  newList.get(newItemPosition).id();
    }

    @Override
    public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
        return oldList.get(oldItemPosition).equals(newList.get(newItemPosition));
    }
}
