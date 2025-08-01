package js.generator

import js.array.Tuple
import js.function.JsFunction
import kotlin.js.JsName

private const val GENERATOR_FUNCTION: String = "(function* () {}.constructor)"

@JsName(GENERATOR_FUNCTION)
open external class GeneratorFunction<in A : Tuple, out R : Generator<*, *, *>>(
    vararg parameterNames: String,
    body: String,
) : JsFunction<A, R>
