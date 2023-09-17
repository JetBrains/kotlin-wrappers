package node.crypto


sealed external interface RSAKeyPairOptionsPublicKeyEncoding<PubF> {
    var type: RSAKeyPairOptionsPublicKeyEncodingType
    var format: PubF
}
