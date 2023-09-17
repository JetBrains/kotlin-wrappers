package node.crypto


sealed external interface SignKeyObjectInput : SigningOptions {
    var key: KeyObject
}
