// TEMP
@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
)

package js.generator

import js.array.JsTuple
import js.function.JsFunction

private const val ASYNC_GENERATOR_FUNCTION: String = "(async function* () {}.constructor)"

sealed external interface AsyncGeneratorFunction<in A : JsTuple, out R : AsyncGenerator<*, *, *>>
    : JsFunction<A, R>

@JsName(ASYNC_GENERATOR_FUNCTION)
external fun <R : AsyncGenerator<*, *, *>> AsyncGeneratorFunction(
    body: String,
): AsyncGeneratorFunction<JsTuple, R>
