package node.crypto


sealed external interface X25519KeyPairOptionsPrivateKeyEncoding<PrivF : KeyFormat> :
    BasePrivateKeyEncodingOptions<PrivF> {
    var type: String /* 'pkcs8' */
}
