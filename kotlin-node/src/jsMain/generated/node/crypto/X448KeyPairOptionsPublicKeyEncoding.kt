package node.crypto


sealed external interface X448KeyPairOptionsPublicKeyEncoding<PubF : KeyFormat> {
    var type: String /* 'spki' */
    var format: PubF
}
