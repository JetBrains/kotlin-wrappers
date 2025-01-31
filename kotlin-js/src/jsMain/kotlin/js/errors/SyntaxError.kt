package js.errors

open external class SyntaxError(
    override val message: String? = definedExternally,
    options: ErrorOptions? = definedExternally,
) : JsError
