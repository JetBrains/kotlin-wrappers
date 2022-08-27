// Automatically generated - do not modify!

package node.crypto

import kotlinx.js.ArrayBufferView

sealed external interface DecipherCCM : Decipher {
    fun setAuthTag(buffer: ArrayBufferView): DecipherCCM

    // HIDDEN METHOD START
    /*
    setAAD(
        buffer: NodeJS.ArrayBufferView,
        options: {
            plaintextLength: number;
        }
    ): DecipherCCM
    */
    // HIDDEN METHOD END

}
