package web.errors

import js.errors.JsError

open external class DOMException(
    message: String? = definedExternally,
    name: String? = definedExternally,
) : JsError {
    override val message: String
    val name: String
}
