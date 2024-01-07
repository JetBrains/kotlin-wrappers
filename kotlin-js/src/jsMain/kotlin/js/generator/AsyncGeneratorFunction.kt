package js.generator

import js.array.JsTuple
import js.function.JsFunction

sealed external interface AsyncGeneratorFunction<in A : JsTuple, out T, TReturn, in TNext>
    : JsFunction<A, AsyncGenerator<T, TReturn, TNext>>
