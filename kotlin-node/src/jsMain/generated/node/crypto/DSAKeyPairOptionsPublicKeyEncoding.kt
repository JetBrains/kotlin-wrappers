package node.crypto


sealed external interface DSAKeyPairOptionsPublicKeyEncoding<PubF : KeyFormat> {
    var type: String /* 'spki' */
    var format: PubF
}
