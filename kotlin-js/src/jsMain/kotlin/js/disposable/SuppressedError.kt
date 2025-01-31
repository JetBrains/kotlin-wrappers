package js.disposable

import js.errors.JsError

open external class SuppressedError(
    val error: JsError,
    val suppressed: JsError,
    override val message: String? = definedExternally,
) : JsError
