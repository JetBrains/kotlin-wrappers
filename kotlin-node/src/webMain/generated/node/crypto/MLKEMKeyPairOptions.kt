// Automatically generated - do not modify!

package node.crypto

sealed external interface MLKEMKeyPairOptions<PubF : KeyFormat, PrivF : KeyFormat> {
    var publicKeyEncoding: MLKEMKeyPairOptionsPublicKeyEncoding<PubF>
    var privateKeyEncoding: MLKEMKeyPairOptionsPrivateKeyEncoding<PrivF>
}
