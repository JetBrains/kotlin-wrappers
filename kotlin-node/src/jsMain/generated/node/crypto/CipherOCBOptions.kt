package node.crypto


sealed external interface CipherOCBOptions : node.stream.TransformOptions {
    var authTagLength: Double
}
