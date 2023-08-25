// Automatically generated - do not modify!

package node.crypto

import js.typedarrays.TypedArray

sealed external interface RsaPrivateKey {
    var key: KeyLike
    var passphrase: String?

    /**
     * @default 'sha1'
     */
    var oaepHash: String?
    var oaepLabel: TypedArray<*, *>?
    var padding: Number?
}
