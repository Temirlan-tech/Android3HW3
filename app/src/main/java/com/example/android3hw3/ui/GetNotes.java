package com.example.android3hw3.ui;

import com.example.android3hw3.data.model.Notes;

import java.util.List;

public interface GetNotes {
    void onSuccess(List<Notes> posts);
    void onFailure(String error);
}
