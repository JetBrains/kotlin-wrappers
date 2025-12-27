// Automatically generated - do not modify!

package node.crypto

sealed external interface ECKeyPairOptions<PubF : KeyFormat, PrivF : KeyFormat> : ECKeyPairKeyObjectOptions {
    var publicKeyEncoding: ECKeyPairOptionsPublicKeyEncoding<PubF>
    var privateKeyEncoding: ECKeyPairOptionsPrivateKeyEncoding<PrivF>
}
