package com.example.unit_test

import android.util.JsonWriter
import android.util.Log
import okhttp3.*
import org.json.JSONObject
import java.io.IOException

class Class {


    val okHttpClient: OkHttpClient = OkHttpClient()
    fun API(URL: String): String {
        var test: String = ""
        val request: Request = Request.Builder().url(URL).build()
        var response = okHttpClient.newCall(request).execute()
        var joke1 = ((JSONObject(response!!.body()!!.string())).getJSONArray("episode").get(0)).toString()
        return joke1;
    }


}