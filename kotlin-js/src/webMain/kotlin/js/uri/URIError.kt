package js.uri

import js.errors.ErrorOptions
import js.errors.JsError
import js.serialization.Serializable
import kotlin.js.definedExternally

/**
 * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/URIError)
 */
open external class URIError(
    override val message: String? = definedExternally,
    options: ErrorOptions? = definedExternally,
) : JsError,
    Serializable
