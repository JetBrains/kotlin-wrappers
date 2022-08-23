// Automatically generated - do not modify!

package node.crypto

import node.stream.TransformOptions

sealed external interface HashOptions : TransformOptions {
    /**
     * For XOF hash functions such as `shake256`, the
     * outputLength option can be used to specify the desired output length in bytes.
     */
    var outputLength: Number?
}
