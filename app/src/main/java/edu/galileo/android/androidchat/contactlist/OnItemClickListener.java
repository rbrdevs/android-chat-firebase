package edu.galileo.android.androidchat.contactlist;

import edu.galileo.android.androidchat.entities.User;

/**
 * Created by ykro.
 */
public interface OnItemClickListener {
    void onItemClick(User user);
    void onItemLongClick(User user);
}