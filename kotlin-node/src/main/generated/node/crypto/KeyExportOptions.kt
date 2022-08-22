// Automatically generated - do not modify!

package node.crypto

sealed external interface KeyExportOptions<T : KeyFormat> {
    var type: Any /* 'pkcs1' | 'spki' | 'pkcs8' | 'sec1' */
    var format: T
    var cipher: String?
    var passphrase: Any? /* string | Buffer */
}
