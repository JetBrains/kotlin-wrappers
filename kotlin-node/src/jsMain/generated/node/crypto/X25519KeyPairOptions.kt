package node.crypto


sealed external interface X25519KeyPairOptions<PubF : KeyFormat, PrivF : KeyFormat> {
    var publicKeyEncoding: X25519KeyPairOptionsPublicKeyEncoding<PubF>
    var privateKeyEncoding: Any /* BasePrivateKeyEncodingOptions<PrivF> & {
    type: 'pkcs8';
} */
}
