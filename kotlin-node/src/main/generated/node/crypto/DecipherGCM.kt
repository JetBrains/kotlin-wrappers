// Automatically generated - do not modify!

package node.crypto

import kotlinx.js.ArrayBufferView

sealed external interface DecipherGCM : Decipher {
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
