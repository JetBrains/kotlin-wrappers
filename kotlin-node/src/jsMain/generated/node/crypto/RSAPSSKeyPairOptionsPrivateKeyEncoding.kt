package node.crypto


external interface RSAPSSKeyPairOptionsPrivateKeyEncoding<PrivF : KeyFormat> : BasePrivateKeyEncodingOptions<PrivF> {
    var type: String /* 'pkcs8' */
}
