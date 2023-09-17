package node.crypto


sealed external interface RSAPSSKeyPairOptionsPublicKeyEncoding<PubF> {
    var type: String /* 'spki' */
    var format: PubF
}
