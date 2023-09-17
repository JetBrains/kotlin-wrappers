package node.crypto


sealed external interface ED448KeyPairOptionsPublicKeyEncoding<PubF> {
    var type: String /* 'spki' */
    var format: PubF
}
