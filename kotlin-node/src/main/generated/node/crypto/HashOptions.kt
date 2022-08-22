// Automatically generated - do not modify!

package node.crypto

sealed external interface HashOptions : node.stream.TransformOptions {
    /**
     * For XOF hash functions such as `shake256`, the
     * outputLength option can be used to specify the desired output length in bytes.
     */
    var outputLength: Number?
}
