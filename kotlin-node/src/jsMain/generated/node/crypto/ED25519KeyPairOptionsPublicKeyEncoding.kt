package node.crypto


sealed external interface ED25519KeyPairOptionsPublicKeyEncoding<PubF> {
    var type: String /* 'spki' */
    var format: PubF
}
