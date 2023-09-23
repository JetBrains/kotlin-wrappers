package node.crypto


sealed external interface RSAKeyPairOptionsPublicKeyEncoding<PubF : KeyFormat> {
    var type: RSAKeyPairOptionsPublicKeyEncodingType
    var format: PubF
}
