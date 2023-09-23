package node.crypto


sealed external interface ED25519KeyPairOptions<PubF : KeyFormat, PrivF : KeyFormat> {
    var publicKeyEncoding: ED25519KeyPairOptionsPublicKeyEncoding<PubF>
    var privateKeyEncoding: ED25519KeyPairOptionsPrivateKeyEncoding<PrivF>
}
