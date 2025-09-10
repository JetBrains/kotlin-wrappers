package js.array

import js.reflect.unsafeCast
import kotlin.js.JsAny

inline fun emptyTuple(): Tuple =
    unsafeCast(jsArrayOf<JsAny?>())

inline fun <A : JsAny?> tupleOf(
    first: A,
): Tuple1<A> =
    unsafeCast(jsArrayOf(first))

inline fun <A : JsAny?, B : JsAny?> tupleOf(
    first: A,
    second: B,
): Tuple2<A, B> =
    unsafeCast(jsArrayOf(first, second))

inline fun <A : JsAny?, B : JsAny?, C : JsAny?> tupleOf(
    first: A,
    second: B,
    third: C,
): Tuple3<A, B, C> =
    unsafeCast(jsArrayOf(first, second, third))

inline fun <A : JsAny?, B : JsAny?, C : JsAny?, D : JsAny?> tupleOf(
    first: A,
    second: B,
    third: C,
    fourth: D,
): Tuple4<A, B, C, D> =
    unsafeCast(jsArrayOf(first, second, third, fourth))

inline fun <A : JsAny?, B : JsAny?, C : JsAny?, D : JsAny?, E : JsAny?> tupleOf(
    first: A,
    second: B,
    third: C,
    fourth: D,
    fifth: E,
): Tuple5<A, B, C, D, E> =
    unsafeCast(jsArrayOf(first, second, third, fourth, fifth))

inline fun <A : JsAny?, B : JsAny?, C : JsAny?, D : JsAny?, E : JsAny?, F : JsAny?> tupleOf(
    first: A,
    second: B,
    third: C,
    fourth: D,
    fifth: E,
    sixth: F,
): Tuple6<A, B, C, D, E, F> =
    unsafeCast(jsArrayOf(first, second, third, fourth, fifth, sixth))

inline fun <A : JsAny?, B : JsAny?, C : JsAny?, D : JsAny?, E : JsAny?, F : JsAny?, G : JsAny?> tupleOf(
    first: A,
    second: B,
    third: C,
    fourth: D,
    fifth: E,
    sixth: F,
    seventh: G,
): Tuple7<A, B, C, D, E, F, G> =
    unsafeCast(jsArrayOf(first, second, third, fourth, fifth, sixth, seventh))
