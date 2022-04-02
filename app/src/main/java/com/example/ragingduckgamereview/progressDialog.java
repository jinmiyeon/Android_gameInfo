package com.example.ragingduckgamereview;

import androidx.annotation.NonNull;
import android.app.Activity;
import android.content.Intent;
import android.app.Dialog;
import android.content.Context;
import android.os.Handler;

import android.os.Bundle;
import android.content.Intent;
import android.view.Window;

import static androidx.core.content.ContextCompat.startActivity;


public class progressDialog extends Dialog {

    Handler handler;
    Runnable runnable;

    public progressDialog(@NonNull Context context) {
        super(context);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_progress_dialog);
        setCancelable(false);
    }

}

