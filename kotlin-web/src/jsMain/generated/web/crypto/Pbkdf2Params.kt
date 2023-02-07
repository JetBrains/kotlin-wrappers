// Automatically generated - do not modify!

package web.crypto

import js.buffer.BufferSource

sealed external interface Pbkdf2Params :
    Algorithm {
    var hash: HashAlgorithmIdentifier
    var iterations: Double
    var salt: BufferSource
}
