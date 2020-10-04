package com.example.unit_test

import android.util.Log
import okhttp3.*
import org.json.JSONObject
import org.junit.Test

import org.junit.Assert.*
import java.io.IOException

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(5, 2 + 2)
    }

    @Test
    fun test() {
        var clas = Class()
        var Episode = clas.API("https://rickandmortyapi.com/api/character/5")

        assertNotEquals("",Episode)
    }


}
