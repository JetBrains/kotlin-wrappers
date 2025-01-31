package js.uri

import js.errors.ErrorOptions
import js.errors.JsError

open external class URIError(
    override val message: String? = definedExternally,
    options: ErrorOptions? = definedExternally,
) : JsError
