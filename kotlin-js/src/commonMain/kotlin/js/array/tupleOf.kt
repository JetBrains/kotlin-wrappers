package js.array

import js.core.JsAny
import js.reflect.unsafeCast

inline fun emptyTuple(): JsTuple =
    unsafeCast(jsArrayOf<JsAny?>())

inline fun <A : JsAny?> tupleOf(
    first: A,
): JsTuple1<A> =
    unsafeCast(jsArrayOf(first))

inline fun <A : JsAny?, B : JsAny?> tupleOf(
    first: A,
    second: B,
): JsTuple2<A, B> =
    unsafeCast(jsArrayOf(first, second))

inline fun <A : JsAny?, B : JsAny?, C : JsAny?> tupleOf(
    first: A,
    second: B,
    third: C,
): JsTuple3<A, B, C> =
    unsafeCast(jsArrayOf(first, second, third))

inline fun <A : JsAny?, B : JsAny?, C : JsAny?, D : JsAny?> tupleOf(
    first: A,
    second: B,
    third: C,
    fourth: D,
): JsTuple4<A, B, C, D> =
    unsafeCast(jsArrayOf(first, second, third, fourth))

inline fun <A : JsAny?, B : JsAny?, C : JsAny?, D : JsAny?, E : JsAny?> tupleOf(
    first: A,
    second: B,
    third: C,
    fourth: D,
    fifth: E,
): JsTuple5<A, B, C, D, E> =
    unsafeCast(jsArrayOf(first, second, third, fourth, fifth))

inline fun <A : JsAny?, B : JsAny?, C : JsAny?, D : JsAny?, E : JsAny?, F : JsAny?> tupleOf(
    first: A,
    second: B,
    third: C,
    fourth: D,
    fifth: E,
    sixth: F,
): JsTuple6<A, B, C, D, E, F> =
    unsafeCast(jsArrayOf(first, second, third, fourth, fifth, sixth))

inline fun <A : JsAny?, B : JsAny?, C : JsAny?, D : JsAny?, E : JsAny?, F : JsAny?, G : JsAny?> tupleOf(
    first: A,
    second: B,
    third: C,
    fourth: D,
    fifth: E,
    sixth: F,
    seventh: G,
): JsTuple7<A, B, C, D, E, F, G> =
    unsafeCast(jsArrayOf(first, second, third, fourth, fifth, sixth, seventh))
