// Automatically generated - do not modify!

package web.crypto

import js.buffer.BufferSource
import js.objects.JsPlainObject

@JsPlainObject
sealed external interface AesGcmParams :
    Algorithm {
    var additionalData: BufferSource?
    var iv: BufferSource
    var tagLength: Short /* unsigned byte */?
}
