package js.function

import js.array.*

fun <C: Any> JsConstructorFunction(
    clazz: JsClass<C>,
): JsConstructorFunction<JsTuple, C> = clazz.unsafeCast<JsConstructorFunction<JsTuple, C>>()

class X

fun main() {
    JsConstructorFunction(X::class.js)
}
