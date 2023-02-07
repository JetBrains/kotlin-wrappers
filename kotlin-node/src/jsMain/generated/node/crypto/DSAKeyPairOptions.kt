// Automatically generated - do not modify!

package node.crypto

sealed external interface DSAKeyPairOptions<PubF : KeyFormat, PrivF : KeyFormat> {
    /**
     * Key size in bits
     */
    var modulusLength: Number

    /**
     * Size of q in bits
     */
    var divisorLength: Number
    var publicKeyEncoding: Any /* {
        type: 'spki';
        format: PubF;
    } */
    var privateKeyEncoding: BasePrivateKeyEncodingOptions<PrivF> /* {
        type: 'pkcs8';
    } */
}
