package node.crypto


sealed external interface ECKeyPairOptionsPublicKeyEncoding<PubF> {
    var type: ECKeyPairOptionsPublicKeyEncodingType
    var format: PubF
}
