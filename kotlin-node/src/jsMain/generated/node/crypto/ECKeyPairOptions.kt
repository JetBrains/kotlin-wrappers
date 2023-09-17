package node.crypto


sealed external interface ECKeyPairOptions<PubF : KeyFormat, PrivF : KeyFormat> {
    /**
     * Name of the curve to use.
     */
    var namedCurve: String
    var publicKeyEncoding: ECKeyPairOptionsPublicKeyEncoding<PubF>
    var privateKeyEncoding: Any /* BasePrivateKeyEncodingOptions<PrivF> & {
    type: 'sec1' | 'pkcs8';
} */
}
