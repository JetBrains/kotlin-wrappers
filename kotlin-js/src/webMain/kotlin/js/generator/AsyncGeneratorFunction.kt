package js.generator

import js.array.Tuple
import js.function.JsFunction
import kotlin.js.JsName

internal const val ASYNC_GENERATOR_FUNCTION: String = "(async function* () {}.constructor)"

@JsName(ASYNC_GENERATOR_FUNCTION)
open external class AsyncGeneratorFunction<in A : Tuple, out R : AsyncGenerator<*, *, *>>(
    vararg parameterNames: String,
    body: String,
) : JsFunction<A, R>
