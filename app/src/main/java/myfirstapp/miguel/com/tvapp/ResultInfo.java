package myfirstapp.miguel.com.tvapp;

import android.graphics.Bitmap;

import java.io.Serializable;

public class ResultInfo implements Serializable {
    String info[] = new String[9];

    public ResultInfo(String[] info) {
        this.info = info;
    }
}
