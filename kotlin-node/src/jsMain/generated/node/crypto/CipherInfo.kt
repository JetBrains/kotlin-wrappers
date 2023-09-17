package node.crypto


sealed external interface CipherInfo {
    /**
     * The name of the cipher.
     */
    var name: String

    /**
     * The nid of the cipher.
     */
    var nid: Double

    /**
     * The block size of the cipher in bytes.
     * This property is omitted when mode is 'stream'.
     */
    var blockSize: Double?

    /**
     * The expected or default initialization vector length in bytes.
     * This property is omitted if the cipher does not use an initialization vector.
     */
    var ivLength: Double?

    /**
     * The expected or default key length in bytes.
     */
    var keyLength: Double

    /**
     * The cipher mode.
     */
    var mode: CipherMode
}
