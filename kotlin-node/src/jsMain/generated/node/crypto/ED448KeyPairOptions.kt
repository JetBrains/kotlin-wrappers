package node.crypto


sealed external interface ED448KeyPairOptions<PubF : KeyFormat, PrivF : KeyFormat> {
    var publicKeyEncoding: ED448KeyPairOptionsPublicKeyEncoding<PubF>
    var privateKeyEncoding: ED448KeyPairOptionsPrivateKeyEncoding<PrivF>
}
