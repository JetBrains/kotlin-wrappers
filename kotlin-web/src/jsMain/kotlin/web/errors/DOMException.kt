package web.errors

import js.errors.JsError
import js.errors.JsErrorName

open external class DOMException(
    message: String? = definedExternally,
    name: JsErrorName? = definedExternally,
) : JsError {
    override val message: String
    val name: JsErrorName
}
