// Automatically generated - do not modify!

package node.crypto

import org.khronos.webgl.ArrayBufferView

sealed external interface DecipherGCM : Decipher {
    fun setAuthTag(buffer: ArrayBufferView): DecipherGCM

    // HIDDEN METHOD START
    /*
    setAAD(
        buffer: NodeJS.ArrayBufferView,
        options?: {
            plaintextLength: number;
        }
    ): DecipherGCM
    */
    // HIDDEN METHOD END

}
