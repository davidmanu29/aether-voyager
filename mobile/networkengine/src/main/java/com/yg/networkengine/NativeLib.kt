package com.yg.networkengine

class NativeLib {

    /**
     * A native method that is implemented by the 'networkengine' native library,
     * which is packaged with this application.
     */
    external fun stringFromJNI(): String

    companion object {
        // Used to load the 'networkengine' library on application startup.
        init {
            System.loadLibrary("networkengine")
        }
    }
}