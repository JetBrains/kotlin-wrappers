package js.generator

import js.core.JsTuple
import js.function.JsFunction

sealed external interface GeneratorFunction<in A : JsTuple>
    : JsFunction<A, Generator<*, *, *>>
