// Automatically generated - do not modify!

package web.crypto

import js.buffer.BufferSource
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface HkdfParams :
    Algorithm {
    var hash: HashAlgorithmIdentifier
    var info: BufferSource
    var salt: BufferSource
}
