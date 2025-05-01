@file:Suppress(
    "UNCHECKED_CAST",
)

package react.internal

import js.array.Tuple1
import js.function.JsFunction
import js.function.invoke
import react.RefObject

private val FUNCTION_REF_TO_FUNCTION: JsFunction<Tuple1<RefObject<out Function<Unit>>>, Function<Unit>> =
    JsFunction(
        "functionRef",
        "return (...args) => functionRef.current(...args)",
    )

internal fun <T : Function<Unit>> functionRefToFunction(
    functionRef: RefObject<out T>,
): T =
    FUNCTION_REF_TO_FUNCTION(functionRef) as T
