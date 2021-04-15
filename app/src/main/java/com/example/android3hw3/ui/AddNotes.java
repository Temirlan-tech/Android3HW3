package com.example.android3hw3.ui;

import com.example.android3hw3.data.model.Notes;

public interface AddNotes {

    void onSuccess(Notes notes);
    void onFailure(String error);
}
