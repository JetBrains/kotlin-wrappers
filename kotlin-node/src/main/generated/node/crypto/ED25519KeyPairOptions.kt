// Automatically generated - do not modify!

package node.crypto

sealed external interface ED25519KeyPairOptions<PubF : KeyFormat, PrivF : KeyFormat> {
    var publicKeyEncoding: Any /* {
        type: 'spki';
        format: PubF;
    } */
    var privateKeyEncoding: BasePrivateKeyEncodingOptions<PrivF> /* {
        type: 'pkcs8';
    } */
}
