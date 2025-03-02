@file:Suppress(
    "WRONG_JS_INTEROP_TYPE",
)

package js.function

import js.array.JsTuple
import js.reflect.JsExternalInheritorsOnly
import kotlin.js.JsName

internal const val FUNCTION: String = "Function"

@JsName(FUNCTION)
@JsExternalInheritorsOnly
open external class JsContextFunction<in C, in A : JsTuple, out R>(
    vararg parameterNames: String,
    body: String,
)
