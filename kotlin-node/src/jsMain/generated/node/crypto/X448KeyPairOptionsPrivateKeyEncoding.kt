package node.crypto


external interface X448KeyPairOptionsPrivateKeyEncoding<PrivF : KeyFormat> : BasePrivateKeyEncodingOptions<PrivF> {
    var type: String /* 'pkcs8' */
}
