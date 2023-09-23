package node.crypto


sealed external interface X25519KeyPairOptionsPublicKeyEncoding<PubF : KeyFormat> {
    var type: String /* 'spki' */
    var format: PubF
}
