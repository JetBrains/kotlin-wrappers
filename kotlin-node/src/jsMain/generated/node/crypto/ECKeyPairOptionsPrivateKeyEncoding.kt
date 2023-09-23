package node.crypto


external interface ECKeyPairOptionsPrivateKeyEncoding<PrivF : KeyFormat> : BasePrivateKeyEncodingOptions<PrivF> {
    var type: ECKeyPairOptionsPrivateKeyEncodingType
}
