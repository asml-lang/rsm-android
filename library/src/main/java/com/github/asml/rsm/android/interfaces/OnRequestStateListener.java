package com.github.asml.rsm.android.interfaces;

import com.github.asml.rsm.android.models.Device;

public interface OnRequestStateListener {
    void onRequestState(String modelName, Device device);
}
