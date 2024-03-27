package js.generator

import js.array.JsTuple
import js.function.JsFunction
import seskar.js.JsSpecialName

private const val ASYNC_GENERATOR_FUNCTION: String = "(async function* () {}.constructor)"

@JsSpecialName(ASYNC_GENERATOR_FUNCTION)
open external class AsyncGeneratorFunction<in A : JsTuple, out R : AsyncGenerator<*, *, *>>(
    vararg parameterNames: String,
    body: String,
) : JsFunction<A, R>

@JsSpecialName(ASYNC_GENERATOR_FUNCTION)
external fun <R : AsyncGenerator<*, *, *>> AsyncGeneratorFunction(
    body: String,
): AsyncGeneratorFunction<JsTuple, R>
