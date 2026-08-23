// Automatically generated - do not modify!

package web.crypto

import js.buffer.BufferSource
import kotlinx.js.JsPlainObject

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HkdfParams)
 */
@JsPlainObject
external interface HkdfParams :
    Algorithm {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HkdfParams#hash)
     */
    var hash: HashAlgorithmIdentifier

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HkdfParams#info)
     */
    var info: BufferSource

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HkdfParams#salt)
     */
    var salt: BufferSource
}
