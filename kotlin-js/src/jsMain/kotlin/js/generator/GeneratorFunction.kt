package js.generator

import js.array.JsTuple
import js.function.JsFunction

sealed external interface GeneratorFunction<in A : JsTuple, out T, TReturn, in TNext>
    : JsFunction<A, Generator<T, TReturn, TNext>>
