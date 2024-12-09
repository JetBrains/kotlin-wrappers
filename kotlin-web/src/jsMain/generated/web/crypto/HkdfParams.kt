// Automatically generated - do not modify!

package web.crypto

import js.buffer.BufferSource
import js.objects.JsPlainObject

@JsPlainObject
external interface HkdfParams :
    Algorithm {
    val hash: HashAlgorithmIdentifier
    val info: BufferSource
    val salt: BufferSource
}
