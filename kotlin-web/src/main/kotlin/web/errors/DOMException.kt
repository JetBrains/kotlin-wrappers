package web.errors

open external class DOMException(
    message: String? = definedExternally,
    name: String? = definedExternally,
) : JsError {
    override val message: String
    val name: String
}
