package node.crypto


sealed external interface DSAKeyPairOptionsPublicKeyEncoding<PubF> {
    var type: String /* 'spki' */
    var format: PubF
}
