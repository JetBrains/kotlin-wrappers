package js.errors

import kotlin.js.definedExternally

open external class TypeError(
    override val message: String? = definedExternally,
    options: ErrorOptions? = definedExternally,
) : JsError
