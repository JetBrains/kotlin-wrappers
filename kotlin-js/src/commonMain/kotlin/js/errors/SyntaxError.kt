package js.errors

import js.serializable.Serializable
import kotlin.js.definedExternally

open external class SyntaxError(
    override val message: String? = definedExternally,
    options: ErrorOptions? = definedExternally,
) : JsError,
    Serializable
