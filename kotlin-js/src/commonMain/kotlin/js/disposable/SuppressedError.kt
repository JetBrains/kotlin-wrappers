package js.disposable

import js.errors.JsError
import kotlin.js.definedExternally as definedExternally_

open external class SuppressedError(
    val error: JsError,
    val suppressed: JsError,
    override val message: String? = definedExternally_,
) : JsError
