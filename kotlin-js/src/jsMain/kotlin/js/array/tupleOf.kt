package js.array

import js.reflect.unsafeCast

inline fun emptyTuple(): JsTuple =
    unsafeCast(emptyArray<Any?>())

inline fun <A> tupleOf(
    first: A,
): JsTuple1<A> =
    unsafeCast(arrayOf(first))

inline fun <A, B> tupleOf(
    first: A,
    second: B,
): JsTuple2<A, B> =
    unsafeCast(arrayOf(first, second))

inline fun <A, B, C> tupleOf(
    first: A,
    second: B,
    third: C,
): JsTuple3<A, B, C> =
    unsafeCast(arrayOf(first, second, third))

inline fun <A, B, C, D> tupleOf(
    first: A,
    second: B,
    third: C,
    fourth: D,
): JsTuple4<A, B, C, D> =
    unsafeCast(arrayOf(first, second, third, fourth))

inline fun <A, B, C, D, E> tupleOf(
    first: A,
    second: B,
    third: C,
    fourth: D,
    fifth: E,
): JsTuple5<A, B, C, D, E> =
    unsafeCast(arrayOf(first, second, third, fourth, fifth))

inline fun <A, B, C, D, E, F> tupleOf(
    first: A,
    second: B,
    third: C,
    fourth: D,
    fifth: E,
    sixth: F,
): JsTuple6<A, B, C, D, E, F> =
    unsafeCast(arrayOf(first, second, third, fourth, fifth, sixth))

inline fun <A, B, C, D, E, F, G> tupleOf(
    first: A,
    second: B,
    third: C,
    fourth: D,
    fifth: E,
    sixth: F,
    seventh: G,
): JsTuple7<A, B, C, D, E, F, G> =
    unsafeCast(arrayOf(first, second, third, fourth, fifth, sixth, seventh))
