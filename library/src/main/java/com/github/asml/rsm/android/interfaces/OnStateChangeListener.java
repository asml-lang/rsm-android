package com.github.asml.rsm.android.interfaces;

import com.github.asml.rsm.android.models.Device;

public interface OnStateChangeListener {
    void onState(String modelName, Device device, String state, boolean isValid);
}
