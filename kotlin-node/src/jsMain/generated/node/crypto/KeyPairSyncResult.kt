// Generated by Karakum - do not modify it manually!

package node.crypto

sealed external interface KeyPairSyncResult<T1 : Any /* string | Buffer */, T2 : Any /* string | Buffer */> {
    var publicKey: T1
    var privateKey: T2
}
