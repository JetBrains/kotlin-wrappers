package js.errors

open external class TypeError(
    override val message: String? = definedExternally,
    options: ErrorOptions? = definedExternally,
) : JsError
