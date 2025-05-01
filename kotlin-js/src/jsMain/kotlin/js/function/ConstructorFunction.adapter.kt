package js.function

import js.array.Tuple
import js.reflect.JsClass
import js.reflect.unsafeCast
import kotlin.reflect.KClass

inline fun <A : Tuple, reified R : Any> ConstructorFunction(): ConstructorFunction<A, R> =
    ConstructorFunction(R::class)

fun <A : Tuple, R : Any> ConstructorFunction(
    clazz: KClass<R>,
): ConstructorFunction<A, R> =
    ConstructorFunction(clazz.js)

fun <A : Tuple, R : Any> ConstructorFunction(
    clazz: JsClass<R>,
): ConstructorFunction<A, R> =
    unsafeCast(clazz)
