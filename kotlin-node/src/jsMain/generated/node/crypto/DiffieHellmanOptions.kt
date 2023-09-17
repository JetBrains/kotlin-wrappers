package node.crypto


sealed external interface DiffieHellmanOptions {
    var privateKey: KeyObject
    var publicKey: KeyObject
}
