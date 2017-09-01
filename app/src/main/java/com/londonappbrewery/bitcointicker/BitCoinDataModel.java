package com.londonappbrewery.bitcointicker;

import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by paulr on 01/09/2017.
 */

public class BitCoinDataModel {
    private String mLast;

    public static BitCoinDataModel fromJson(JSONObject jsonObject) {

        BitCoinDataModel bitCoinData = new BitCoinDataModel();

        try {
            bitCoinData.mLast = jsonObject.getString("last");
            Log.d("Bitcoin", bitCoinData.mLast);
            return  bitCoinData;
        } catch (JSONException e) {
            e.printStackTrace();
            return  null;
        }
    }

    public String getLast() {
        return mLast;
    }
}
