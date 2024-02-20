// Automatically generated - do not modify!

package web.crypto

import js.buffer.BufferSource
import js.objects.JsPlainObject

@JsPlainObject
sealed external interface HkdfParams :
    Algorithm {
    var hash: HashAlgorithmIdentifier
    var info: BufferSource
    var salt: BufferSource
}
