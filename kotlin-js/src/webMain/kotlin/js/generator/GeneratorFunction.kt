package js.generator

import js.array.Tuple
import js.function.JsFunction

private const val GENERATOR_FUNCTION: String = "(function* () {}.constructor)"

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/GeneratorFunction)
 */
@JsName(GENERATOR_FUNCTION)
open external class GeneratorFunction<in A : Tuple, out R : Generator<*, *, *>>(
    vararg parameterNames: String,
    body: String,
) : JsFunction<A, R>
