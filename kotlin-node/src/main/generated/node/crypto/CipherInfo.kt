// Automatically generated - do not modify!

package node.crypto

sealed external interface CipherInfo {
    /**
     * The name of the cipher.
     */
    var name: String

    /**
     * The nid of the cipher.
     */
    var nid: Number

    /**
     * The block size of the cipher in bytes.
     * This property is omitted when mode is 'stream'.
     */
    var blockSize: Number?

    /**
     * The expected or default initialization vector length in bytes.
     * This property is omitted if the cipher does not use an initialization vector.
     */
    var ivLength: Number?

    /**
     * The expected or default key length in bytes.
     */
    var keyLength: Number

    /**
     * The cipher mode.
     */
    var mode: CipherMode
}
