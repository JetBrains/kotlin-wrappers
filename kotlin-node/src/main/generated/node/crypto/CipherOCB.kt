// Automatically generated - do not modify!

package node.crypto

import node.buffer.Buffer

sealed external interface CipherOCB : Cipher {

    // HIDDEN METHOD START
    /*
    setAAD(
        buffer: NodeJS.ArrayBufferView,
        options?: {
            plaintextLength: number;
        }
    ): CipherOCB
    */
    // HIDDEN METHOD END

    fun getAuthTag(): Buffer
}
