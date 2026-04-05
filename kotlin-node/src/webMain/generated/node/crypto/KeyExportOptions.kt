// Automatically generated - do not modify!

package node.crypto

@kotlinx.js.JsPlainObject
external interface KeyExportOptions<T : KeyFormat> {
    var type: KeyExportOptionsType
    var format: T
    var cipher: String?
    var passphrase: Any? // string | Buffer | undefined
}
