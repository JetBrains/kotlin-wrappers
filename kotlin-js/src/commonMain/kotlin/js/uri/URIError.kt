package js.uri

import js.errors.ErrorOptions
import js.errors.JsError
import kotlin.js.definedExternally as definedExternally_

open external class URIError(
    override val message: String? = definedExternally_,
    options: ErrorOptions? = definedExternally_,
) : JsError
