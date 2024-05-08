package js.function

import js.array.JsTuple

internal const val FUNCTION: String = "Function"

@JsName(FUNCTION)
@JsExternalInheritorsOnly
open external class JsFunction<in A : JsTuple, out R>(
    vararg parameterNames: String,
    body: String,
)
