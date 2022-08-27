// Automatically generated - do not modify!

package node.crypto

import kotlinx.js.ArrayBufferView

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
