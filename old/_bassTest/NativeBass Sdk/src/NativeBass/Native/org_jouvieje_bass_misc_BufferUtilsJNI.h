/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class org_jouvieje_bass_misc_BufferUtilsJNI */

#ifndef _Included_org_jouvieje_bass_misc_BufferUtilsJNI
#define _Included_org_jouvieje_bass_misc_BufferUtilsJNI
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     org_jouvieje_bass_misc_BufferUtilsJNI
 * Method:    getBufferAddress
 * Signature: (Ljava/nio/Buffer;I)J
 */
JNIEXPORT jlong JNICALL Java_org_jouvieje_bass_misc_BufferUtilsJNI_getBufferAddress
  (JNIEnv *, jclass, jobject, jint);

/*
 * Class:     org_jouvieje_bass_misc_BufferUtilsJNI
 * Method:    writeNullTerminal
 * Signature: (Ljava/nio/ByteBuffer;I)V
 */
JNIEXPORT void JNICALL Java_org_jouvieje_bass_misc_BufferUtilsJNI_writeNullTerminal
  (JNIEnv *, jclass, jobject, jint);

/*
 * Class:     org_jouvieje_bass_misc_BufferUtilsJNI
 * Method:    newDirectByteBuffer
 * Signature: (JJ)Ljava/nio/ByteBuffer;
 */
JNIEXPORT jobject JNICALL Java_org_jouvieje_bass_misc_BufferUtilsJNI_newDirectByteBuffer
  (JNIEnv *, jclass, jlong, jlong);

#ifdef __cplusplus
}
#endif
#endif