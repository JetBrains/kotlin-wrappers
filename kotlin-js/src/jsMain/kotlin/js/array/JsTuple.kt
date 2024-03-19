@file:Suppress(
    "WRONG_BODY_OF_EXTERNAL_DECLARATION",
    "INLINE_EXTERNAL_DECLARATION",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "DECLARATION_CANT_BE_INLINED",
    "NOTHING_TO_INLINE",
)

package js.array

sealed external interface JsTuple {
    @JsName("length")
    val size: Int
}

sealed external interface JsTuple1<out A> : JsTuple {
    inline operator fun component1(): A = asDynamic()[0]
}

sealed external interface JsTuple2<out A, out B> : JsTuple1<A> {
    inline operator fun component2(): B = asDynamic()[1]
}

sealed external interface JsTuple3<out A, out B, out C> : JsTuple2<A, B> {
    inline operator fun component3(): C = asDynamic()[2]
}

sealed external interface JsTuple4<out A, out B, out C, out D> : JsTuple3<A, B, C> {
    inline operator fun component4(): D = asDynamic()[3]
}

sealed external interface JsTuple5<out A, out B, out C, out D, out E> : JsTuple4<A, B, C, D> {
    inline operator fun component5(): E = asDynamic()[4]
}

sealed external interface JsTuple6<out A, out B, out C, out D, out E, out F> : JsTuple5<A, B, C, D, E> {
    inline operator fun component6(): F = asDynamic()[5]
}

sealed external interface JsTuple7<out A, out B, out C, out D, out E, out F, out G> : JsTuple6<A, B, C, D, E, F> {
    inline operator fun component7(): G = asDynamic()[6]
}

inline fun emptyTuple(): JsTuple =
    emptyArray<Any?>()
        .unsafeCast<JsTuple>()

inline fun <A> tupleOf(
    first: A,
): JsTuple1<A> =
    arrayOf(first)
        .unsafeCast<JsTuple1<A>>()

inline fun <A, B> tupleOf(
    first: A,
    second: B,
): JsTuple2<A, B> =
    arrayOf(first, second)
        .unsafeCast<JsTuple2<A, B>>()

inline fun <A, B, C> tupleOf(
    first: A,
    second: B,
    third: C,
): JsTuple3<A, B, C> =
    arrayOf(first, second, third)
        .unsafeCast<JsTuple3<A, B, C>>()

inline fun <A, B, C, D> tupleOf(
    first: A,
    second: B,
    third: C,
    fourth: D,
): JsTuple4<A, B, C, D> =
    arrayOf(first, second, third, fourth)
        .unsafeCast<JsTuple4<A, B, C, D>>()

inline fun <A, B, C, D, E> tupleOf(
    first: A,
    second: B,
    third: C,
    fourth: D,
    fifth: E,
): JsTuple5<A, B, C, D, E> =
    arrayOf(first, second, third, fourth, fifth)
        .unsafeCast<JsTuple5<A, B, C, D, E>>()

inline fun <A, B, C, D, E, F> tupleOf(
    first: A,
    second: B,
    third: C,
    fourth: D,
    fifth: E,
    sixth: F,
): JsTuple6<A, B, C, D, E, F> =
    arrayOf(first, second, third, fourth, fifth, sixth)
        .unsafeCast<JsTuple6<A, B, C, D, E, F>>()

inline fun <A, B, C, D, E, F, G> tupleOf(
    first: A,
    second: B,
    third: C,
    fourth: D,
    fifth: E,
    sixth: F,
    seventh: G,
): JsTuple7<A, B, C, D, E, F, G> =
    arrayOf(first, second, third, fourth, fifth, sixth, seventh)
        .unsafeCast<JsTuple7<A, B, C, D, E, F, G>>()
