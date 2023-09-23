package node.crypto


external interface RSAKeyPairOptionsPrivateKeyEncoding<PrivF : KeyFormat> : BasePrivateKeyEncodingOptions<PrivF> {
    var type: RSAKeyPairOptionsPrivateKeyEncodingType
}
