package js.generator

import js.array.JsTuple
import js.function.JsFunction

sealed external interface AsyncGeneratorFunction<in A : JsTuple, out R : AsyncGenerator<*, *, *>>
    : JsFunction<A, R>
