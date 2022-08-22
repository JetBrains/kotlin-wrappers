// Automatically generated - do not modify!

package node.crypto

import node.buffer.Buffer

sealed external interface CipherCCM : Cipher {

    // HIDDEN METHOD START
    /*
    setAAD(
        buffer: NodeJS.ArrayBufferView,
        options: {
            plaintextLength: number;
        }
    ): CipherCCM
    */
    // HIDDEN METHOD END

    fun getAuthTag(): Buffer
}
