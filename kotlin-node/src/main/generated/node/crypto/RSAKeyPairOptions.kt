// Automatically generated - do not modify!

package node.crypto

sealed external interface RSAKeyPairOptions<PubF : KeyFormat, PrivF : KeyFormat> {
    /**
     * Key size in bits
     */
    var modulusLength: Number

    /**
     * Public exponent
     * @default 0x10001
     */
    var publicExponent: Number?
    var publicKeyEncoding: Any /* {
        type: 'pkcs1' | 'spki';
        format: PubF;
    } */
    var privateKeyEncoding: Any /* BasePrivateKeyEncodingOptions<PrivF> & {
    type: 'pkcs1' | 'pkcs8';
} */
}
