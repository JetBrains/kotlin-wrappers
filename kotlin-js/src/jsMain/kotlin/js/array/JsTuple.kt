@file:Suppress(
    "NOTHING_TO_INLINE",
)

package js.array

import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS

sealed external interface JsTuple {
    @JsName("length")
    val size: Int

    @JsAlias(THIS)
    fun asArray(): ReadonlyArray<Any?>
}

sealed external interface JsTuple1<out A> : JsTuple {
    @JsAlias("[0]")
    operator fun component1(): A
}

sealed external interface JsTuple2<out A, out B> : JsTuple1<A> {
    @JsAlias("[1]")
    operator fun component2(): B
}

sealed external interface JsTuple3<out A, out B, out C> : JsTuple2<A, B> {
    @JsAlias("[2]")
    operator fun component3(): C
}

sealed external interface JsTuple4<out A, out B, out C, out D> : JsTuple3<A, B, C> {
    @JsAlias("[3]")
    operator fun component4(): D
}

sealed external interface JsTuple5<out A, out B, out C, out D, out E> : JsTuple4<A, B, C, D> {
    @JsAlias("[4]")
    operator fun component5(): E
}

sealed external interface JsTuple6<out A, out B, out C, out D, out E, out F> : JsTuple5<A, B, C, D, E> {
    @JsAlias("[5]")
    operator fun component6(): F
}

sealed external interface JsTuple7<out A, out B, out C, out D, out E, out F, out G> : JsTuple6<A, B, C, D, E, F> {
    @JsAlias("[6]")
    operator fun component7(): G
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
