// Automatically generated - do not modify!

package node.crypto

sealed external interface PrivateKeyInput {
    var key: Any /* string | Buffer */
    var format: KeyFormat?
    var type: Any? /* 'pkcs1' | 'pkcs8' | 'sec1' */
    var passphrase: Any? /* string | Buffer */
    var encoding: String?
}
