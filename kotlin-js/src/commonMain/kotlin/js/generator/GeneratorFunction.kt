package js.generator

import js.array.JsTuple
import js.function.JsFunction
import seskar.js.JsSpecialName

private const val GENERATOR_FUNCTION: String = "(function* () {}.constructor)"

@JsSpecialName(GENERATOR_FUNCTION)
open external class GeneratorFunction<in A : JsTuple, out R : Generator<*, *, *>>(
    vararg parameterNames: String,
    body: String,
) : JsFunction<A, R>
