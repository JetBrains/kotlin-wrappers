package js.function

import js.array.*

fun <A : JsTuple, R : Any> JsConstructorFunction(
    clazz: JsClass<R>,
): JsConstructorFunction<A, R> =
    clazz.unsafeCast<JsConstructorFunction<A, R>>()
