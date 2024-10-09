// Automatically generated - do not modify!

package web.crypto

import js.buffer.BufferSource
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface AesGcmParams :
    Algorithm {
    val additionalData: BufferSource?
    val iv: BufferSource
    val tagLength: Short /* unsigned byte */?
}
