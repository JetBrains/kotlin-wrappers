// Generated by Karakum - do not modify it manually!

package node.crypto

sealed external interface ED25519KeyPairOptionsPrivateKeyEncoding<PrivF : KeyFormat> :
    BasePrivateKeyEncodingOptions<PrivF> {
    var type: String // "pkcs8"
}
