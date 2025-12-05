package com.yg.networkengine

class NativeLib {

    external fun add(a: Int, b: Int): Int

    companion object {
        init {
            System.loadLibrary("networkengine")
        }
    }
}