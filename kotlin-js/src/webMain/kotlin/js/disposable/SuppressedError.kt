package js.disposable

import js.errors.JsError
import kotlin.js.definedExternally

/**
 * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/SuppressedError)
 */
open external class SuppressedError(
    val error: JsError,
    val suppressed: JsError,
    override val message: String? = definedExternally,
) : JsError
