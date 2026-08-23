// Automatically generated - do not modify!

package web.crypto

import js.buffer.BufferSource
import kotlinx.js.JsPlainObject

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AesGcmParams)
 */
@JsPlainObject
external interface AesGcmParams :
    Algorithm {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AesGcmParams#additionalData)
     */
    var additionalData: BufferSource?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AesGcmParams#iv)
     */
    var iv: BufferSource

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AesGcmParams#tagLength)
     */
    var tagLength: Short /* unsigned byte */?
}
