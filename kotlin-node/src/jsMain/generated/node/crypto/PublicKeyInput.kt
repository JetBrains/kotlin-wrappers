// Automatically generated - do not modify!

package node.crypto

sealed external interface PublicKeyInput {
    var key: Any /* string | Buffer */
    var format: KeyFormat?
    var type: Any? /* 'pkcs1' | 'spki' */
}
