package js.function

import js.array.Tuple
import js.core.JsAny
import js.reflect.JsExternalInheritorsOnly
import kotlin.js.JsName

internal const val FUNCTION: String = "Function"

@JsName(FUNCTION)
@JsExternalInheritorsOnly
open external class ContextFunction<in C : JsAny?, in A : Tuple, out R : JsAny?>(
    vararg parameterNames: String,
    body: String,
)
