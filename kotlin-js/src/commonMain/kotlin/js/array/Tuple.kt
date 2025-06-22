package js.array

import js.core.JsAny
import js.reflect.unsafeCast
import kotlin.js.JsName

sealed external interface Tuple {
    @JsName("length")
    val size: Int

    @JsName("at")
    fun <R : JsAny?> unsafeGet(index: Int): R
}

sealed external interface Tuple1<out A : JsAny?> :
    Tuple

sealed external interface Tuple2<out A : JsAny?, out B : JsAny?> :
    Tuple1<A>

sealed external interface Tuple3<out A : JsAny?, out B : JsAny?, out C : JsAny?> :
    Tuple2<A, B>

sealed external interface Tuple4<out A : JsAny?, out B : JsAny?, out C : JsAny?, out D : JsAny?> :
    Tuple3<A, B, C>

sealed external interface Tuple5<out A : JsAny?, out B : JsAny?, out C : JsAny?, out D : JsAny?, out E : JsAny?> :
    Tuple4<A, B, C, D>

sealed external interface Tuple6<out A : JsAny?, out B : JsAny?, out C : JsAny?, out D : JsAny?, out E : JsAny?, out F : JsAny?> :
    Tuple5<A, B, C, D, E>

sealed external interface Tuple7<out A : JsAny?, out B : JsAny?, out C : JsAny?, out D : JsAny?, out E : JsAny?, out F : JsAny?, out G : JsAny?> :
    Tuple6<A, B, C, D, E, F>

inline fun Tuple.asArray(): ReadonlyArray<JsAny?> =
    unsafeCast(this)

inline operator fun <A : JsAny?> Tuple1<A>.component1(): A =
    unsafeGet(0)

inline operator fun <B : JsAny?> Tuple2<*, B>.component2(): B =
    unsafeGet(1)

inline operator fun <C : JsAny?> Tuple3<*, *, C>.component3(): C =
    unsafeGet(2)

inline operator fun <D : JsAny?> Tuple4<*, *, *, D>.component4(): D =
    unsafeGet(3)

inline operator fun <E : JsAny?> Tuple5<*, *, *, *, E>.component5(): E =
    unsafeGet(4)

inline operator fun <F : JsAny?> Tuple6<*, *, *, *, *, F>.component6(): F =
    unsafeGet(5)

inline operator fun <G : JsAny?> Tuple7<*, *, *, *, *, *, G>.component7(): G =
    unsafeGet(6)
