package node.crypto


sealed external interface VerifyKeyObjectInput : SigningOptions {
    var key: KeyObject
}
