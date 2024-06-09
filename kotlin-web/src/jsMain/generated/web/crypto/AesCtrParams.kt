// Automatically generated - do not modify!

package web.crypto

import js.buffer.BufferSource
import kotlinx.js.JsPlainObject

@JsPlainObject
sealed external interface AesCtrParams :
    Algorithm {
    var counter: BufferSource
    var length: Short /* unsigned byte */
}
