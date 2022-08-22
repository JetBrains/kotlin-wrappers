// Automatically generated - do not modify!

package node.crypto

import org.khronos.webgl.ArrayBufferView

sealed external interface DecipherOCB : Decipher {
    fun setAuthTag(buffer: ArrayBufferView): DecipherOCB

    // HIDDEN METHOD START
    /*
    setAAD(
        buffer: NodeJS.ArrayBufferView,
        options?: {
            plaintextLength: number;
        }
    ): DecipherOCB
    */
    // HIDDEN METHOD END

}
