// Automatically generated - do not modify!

package web.crypto

import js.buffer.BufferSource
import kotlinx.js.JsPlainObject

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Pbkdf2Params)
 */
@JsPlainObject
external interface Pbkdf2Params :
    Algorithm {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Pbkdf2Params#hash)
     */
    var hash: HashAlgorithmIdentifier

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Pbkdf2Params#iterations)
     */
    var iterations: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Pbkdf2Params#salt)
     */
    var salt: BufferSource
}
