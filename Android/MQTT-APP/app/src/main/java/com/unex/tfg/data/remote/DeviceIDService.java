package com.unex.tfg.data.remote;

import retrofit2.Call;
import retrofit2.http.POST;

public interface DeviceIDService {

    /**
     * POST method to request the Device ID generated by the server
     * @return A Call with the server response
     */
    @POST("device_id")
    Call<DeviceIDResponse> getDeviceID();
}