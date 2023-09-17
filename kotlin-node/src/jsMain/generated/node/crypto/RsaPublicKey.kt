package node.crypto


sealed external interface RsaPublicKey {
    var key: KeyLike
    var padding: Double?
}
