package js.generator

import js.core.JsTuple
import js.function.JsFunction

sealed external interface AsyncGeneratorFunction<in A : JsTuple>
    : JsFunction<A, AsyncGenerator<*, *, *>>
