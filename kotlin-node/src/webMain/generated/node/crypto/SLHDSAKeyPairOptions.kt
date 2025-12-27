// Automatically generated - do not modify!

package node.crypto

sealed external interface SLHDSAKeyPairOptions<PubF : KeyFormat, PrivF : KeyFormat> {
    var publicKeyEncoding: SLHDSAKeyPairOptionsPublicKeyEncoding<PubF>
    var privateKeyEncoding: SLHDSAKeyPairOptionsPrivateKeyEncoding<PrivF>
}
