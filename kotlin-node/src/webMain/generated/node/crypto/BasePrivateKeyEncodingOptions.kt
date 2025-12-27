// Automatically generated - do not modify!

package node.crypto

sealed external interface BasePrivateKeyEncodingOptions<T : KeyFormat> {
    var format: T
    var cipher: String?
    var passphrase: String?
}
