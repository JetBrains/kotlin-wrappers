package node.crypto


sealed external interface ED448KeyPairOptionsPublicKeyEncoding<PubF : KeyFormat> {
    var type: String /* 'spki' */
    var format: PubF
}
