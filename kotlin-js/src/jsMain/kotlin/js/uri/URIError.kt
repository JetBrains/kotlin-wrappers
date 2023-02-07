package js.uri

import js.errors.ErrorOptions
import js.errors.JsError

external class URIError(
    message: String? = definedExternally,
    options: ErrorOptions? = definedExternally,
) : JsError
