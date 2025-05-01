package js.function

import js.array.JsTuple
import js.reflect.JsClass
import js.reflect.unsafeCast
import kotlin.reflect.KClass

inline fun <A : JsTuple, reified R : Any> ConstructorFunction(): ConstructorFunction<A, R> =
    ConstructorFunction(R::class)

fun <A : JsTuple, R : Any> ConstructorFunction(
    clazz: KClass<R>,
): ConstructorFunction<A, R> =
    ConstructorFunction(clazz.js)

fun <A : JsTuple, R : Any> ConstructorFunction(
    clazz: JsClass<R>,
): ConstructorFunction<A, R> =
    unsafeCast(clazz)
