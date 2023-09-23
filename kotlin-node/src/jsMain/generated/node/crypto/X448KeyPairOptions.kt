package node.crypto


sealed external interface X448KeyPairOptions<PubF : KeyFormat, PrivF : KeyFormat> {
    var publicKeyEncoding: X448KeyPairOptionsPublicKeyEncoding<PubF>
    var privateKeyEncoding: X448KeyPairOptionsPrivateKeyEncoding<PrivF>
}
