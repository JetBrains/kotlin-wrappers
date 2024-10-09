// Automatically generated - do not modify!

package web.crypto

import js.buffer.BufferSource
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface Pbkdf2Params :
    Algorithm {
    val hash: HashAlgorithmIdentifier
    val iterations: Int
    val salt: BufferSource
}
