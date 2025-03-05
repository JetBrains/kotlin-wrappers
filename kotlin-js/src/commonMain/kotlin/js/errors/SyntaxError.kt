package js.errors

import kotlin.js.definedExternally

open external class SyntaxError(
    override val message: String? = definedExternally,
    options: ErrorOptions? = definedExternally,
) : JsError
