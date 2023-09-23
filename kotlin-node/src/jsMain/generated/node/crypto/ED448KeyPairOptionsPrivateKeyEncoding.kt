package node.crypto


external interface ED448KeyPairOptionsPrivateKeyEncoding<PrivF : KeyFormat> : BasePrivateKeyEncodingOptions<PrivF> {
    var type: String /* 'pkcs8' */
}
