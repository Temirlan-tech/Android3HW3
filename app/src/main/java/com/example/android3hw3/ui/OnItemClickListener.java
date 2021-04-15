package com.example.android3hw3.ui;
import com.example.android3hw3.data.model.Notes;

public interface OnItemClickListener {

    void onClick(int position, Notes notes);
    void longClick(int position, Notes notes);
}
