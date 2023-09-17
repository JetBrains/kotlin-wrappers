package node.crypto


sealed external interface KeyPairKeyObjectResult {
    var publicKey: KeyObject
    var privateKey: KeyObject
}
