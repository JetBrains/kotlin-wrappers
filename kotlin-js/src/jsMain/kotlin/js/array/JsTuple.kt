@file:Suppress(
    "NOTHING_TO_INLINE",
)

package js.array

import js.reflect.unsafeCast
import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS

sealed external interface JsTuple {
    @JsName("length")
    val size: Int

    @JsAlias(THIS)
    fun asArray(): ReadonlyArray<Any?>
}

sealed external interface JsTuple1<out A> :
    JsTuple {
    @JsAlias("[0]")
    operator fun component1(): A
}

sealed external interface JsTuple2<out A, out B> :
    JsTuple1<A> {
    @JsAlias("[1]")
    operator fun component2(): B
}

sealed external interface JsTuple3<out A, out B, out C> :
    JsTuple2<A, B> {
    @JsAlias("[2]")
    operator fun component3(): C
}

sealed external interface JsTuple4<out A, out B, out C, out D> :
    JsTuple3<A, B, C> {
    @JsAlias("[3]")
    operator fun component4(): D
}

sealed external interface JsTuple5<out A, out B, out C, out D, out E> :
    JsTuple4<A, B, C, D> {
    @JsAlias("[4]")
    operator fun component5(): E
}

sealed external interface JsTuple6<out A, out B, out C, out D, out E, out F> :
    JsTuple5<A, B, C, D, E> {
    @JsAlias("[5]")
    operator fun component6(): F
}

sealed external interface JsTuple7<out A, out B, out C, out D, out E, out F, out G> :
    JsTuple6<A, B, C, D, E, F> {
    @JsAlias("[6]")
    operator fun component7(): G
}

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
