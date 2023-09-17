package node.crypto


sealed external interface DSAKeyPairOptions<PubF : KeyFormat, PrivF : KeyFormat> {
    /**
     * Key size in bits
     */
    var modulusLength: Double

    /**
     * Size of q in bits
     */
    var divisorLength: Double
    var publicKeyEncoding: DSAKeyPairOptionsPublicKeyEncoding<PubF>
    var privateKeyEncoding: Any /* BasePrivateKeyEncodingOptions<PrivF> & {
    type: 'pkcs8';
} */
}
