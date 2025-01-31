package js.errors

open external class EvalError(
    override val message: String? = definedExternally,
    options: ErrorOptions? = definedExternally,
) : JsError
