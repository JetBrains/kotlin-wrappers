package js.function

import js.array.*
import kotlin.reflect.KClass

fun <A : JsTuple, R : Any> JsConstructorFunction(
    clazz: KClass<R>,
): JsConstructorFunction<A, R> =
    JsConstructorFunction(clazz.js)

fun <A : JsTuple, R : Any> JsConstructorFunction(
    clazz: JsClass<R>,
): JsConstructorFunction<A, R> =
    clazz.unsafeCast<JsConstructorFunction<A, R>>()
