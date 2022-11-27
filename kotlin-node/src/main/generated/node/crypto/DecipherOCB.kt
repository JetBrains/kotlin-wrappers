// Automatically generated - do not modify!

package node.crypto

import js.buffer.ArrayBufferView

sealed external interface DecipherOCB : Decipher {
    fun setAuthTag(buffer: ArrayBufferView) /* : this */

    // HIDDEN METHOD START
    /*
    setAAD(
        buffer: NodeJS.ArrayBufferView,
        options?: {
            plaintextLength: number;
        }
    ): this
    */
    // HIDDEN METHOD END

}
