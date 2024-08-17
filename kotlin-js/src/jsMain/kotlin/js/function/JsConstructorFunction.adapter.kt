package js.function

import js.array.*

fun <C: JsClass<C>> JsConstructorFunction(
    fn: C.() -> C,
): JsConstructorFunction<JsTuple, C> = TODO()

