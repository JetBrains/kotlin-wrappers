package js.function

import js.array.Tuple
import js.reflect.JsClass
import js.reflect.unsafeCast

fun <A : Tuple, R : JsAny> ConstructorFunction(
    clazz: JsClass<R>,
): ConstructorFunction<A, R> =
    unsafeCast(clazz)
