package node.crypto


sealed external interface ECKeyPairOptionsPrivateKeyEncoding<PrivF : KeyFormat> : BasePrivateKeyEncodingOptions<PrivF> {
    var type: ECKeyPairOptionsPrivateKeyEncodingType
}
