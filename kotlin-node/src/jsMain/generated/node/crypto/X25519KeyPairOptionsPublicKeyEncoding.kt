package node.crypto


sealed external interface X25519KeyPairOptionsPublicKeyEncoding<PubF> {
    var type: String /* 'spki' */
    var format: PubF
}
