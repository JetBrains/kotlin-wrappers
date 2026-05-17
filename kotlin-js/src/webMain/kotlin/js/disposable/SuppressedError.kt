package js.disposable

import js.errors.JsError

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/SuppressedError)
 */
open external class SuppressedError(
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/SuppressedError/error)
     */
    val error: JsError,
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/SuppressedError/suppressed)
     */
    val suppressed: JsError,
    override val message: String? = definedExternally,
) : JsError
