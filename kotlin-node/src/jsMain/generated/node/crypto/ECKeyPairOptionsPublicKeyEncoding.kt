package node.crypto


sealed external interface ECKeyPairOptionsPublicKeyEncoding<PubF : KeyFormat> {
    var type: ECKeyPairOptionsPublicKeyEncodingType
    var format: PubF
}
