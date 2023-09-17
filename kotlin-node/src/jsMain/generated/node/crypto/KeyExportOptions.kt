package node.crypto


sealed external interface KeyExportOptions<T : KeyFormat> {
    var type: KeyExportOptionsType
    var format: T
    var cipher: String?
    var passphrase: (Any /* string | Buffer | undefined */)?
}
