// Automatically generated - do not modify!

package web.crypto

import js.buffer.BufferSource
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface AesGcmParams :
    Algorithm {
    var additionalData: BufferSource?
    var iv: BufferSource
    var tagLength: Short /* unsigned byte */?
}
