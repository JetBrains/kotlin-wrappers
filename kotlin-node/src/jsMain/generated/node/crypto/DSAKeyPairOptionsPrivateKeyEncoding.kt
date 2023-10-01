package node.crypto


sealed external interface DSAKeyPairOptionsPrivateKeyEncoding<PrivF : KeyFormat> :
    BasePrivateKeyEncodingOptions<PrivF> {
    var type: String /* 'pkcs8' */
}
