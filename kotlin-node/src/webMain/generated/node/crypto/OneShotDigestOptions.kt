// Automatically generated - do not modify!

package node.crypto

sealed external interface OneShotDigestOptions {
    /**
     * Encoding used to encode the returned digest.
     * @default 'hex'
     */
    var outputEncoding: Any? // BinaryToTextEncoding | "buffer" | undefined

    /**
     * For XOF hash functions such as 'shake256', the outputLength option
     * can be used to specify the desired output length in bytes.
     */
    var outputLength: Double?
}
