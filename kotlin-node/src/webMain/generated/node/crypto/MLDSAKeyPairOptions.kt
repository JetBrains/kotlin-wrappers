// Automatically generated - do not modify!

package node.crypto

sealed external interface MLDSAKeyPairOptions<PubF : KeyFormat, PrivF : KeyFormat> {
    var publicKeyEncoding: MLDSAKeyPairOptionsPublicKeyEncoding<PubF>
    var privateKeyEncoding: MLDSAKeyPairOptionsPrivateKeyEncoding<PrivF>
}
