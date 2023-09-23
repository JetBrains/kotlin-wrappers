package node.crypto


external interface DSAKeyPairOptionsPrivateKeyEncoding<PrivF : KeyFormat> : BasePrivateKeyEncodingOptions<PrivF> {
    var type: String /* 'pkcs8' */
}
