// Automatically generated - do not modify!

package node.crypto

import node.buffer.NonSharedBuffer

sealed external interface EncapsulateResult {
    var sharedKey: NonSharedBuffer
    var ciphertext: NonSharedBuffer
}
