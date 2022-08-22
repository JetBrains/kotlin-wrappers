// Automatically generated - do not modify!

package node.crypto

import node.buffer.Buffer

sealed external interface CipherGCM : Cipher {

    // HIDDEN METHOD START
    /*
    setAAD(
        buffer: NodeJS.ArrayBufferView,
        options?: {
            plaintextLength: number;
        }
    ): CipherGCM
    */
    // HIDDEN METHOD END

    fun getAuthTag(): Buffer
}
