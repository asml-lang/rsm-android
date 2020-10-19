package com.github.asml.rsm.android.interfaces;

import com.github.asml.rsm.android.models.Device;

public interface OnNewDeviceListener {
    void onNewDevice(String modelName, Device device);
}
