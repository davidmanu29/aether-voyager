#include <jni.h>
#include <string>

extern "C"
JNIEXPORT jint JNICALL
Java_com_yg_networkengine_NativeLib_add(
        JNIEnv* env,
        jobject,
        jint a,
        jint b) {
    return a + b;
}