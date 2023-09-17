package node.crypto


sealed external interface CipherCCMOptions : node.stream.TransformOptions {
    var authTagLength: Double
}
