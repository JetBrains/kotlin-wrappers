package js.array

import js.core.JsAny
import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import kotlin.js.JsName

sealed external interface Tuple {
    @JsName("length")
    val size: Int

    @JsAlias(THIS)
    fun asArray(): ReadonlyArray<JsAny?>
}

sealed external interface Tuple1<out A : JsAny?> :
    Tuple {
    @JsAlias("[0]")
    operator fun component1(): A
}

sealed external interface Tuple2<out A : JsAny?, out B : JsAny?> :
    Tuple1<A> {
    @JsAlias("[1]")
    operator fun component2(): B
}

sealed external interface Tuple3<out A : JsAny?, out B : JsAny?, out C : JsAny?> :
    Tuple2<A, B> {
    @JsAlias("[2]")
    operator fun component3(): C
}

sealed external interface Tuple4<out A : JsAny?, out B : JsAny?, out C : JsAny?, out D : JsAny?> :
    Tuple3<A, B, C> {
    @JsAlias("[3]")
    operator fun component4(): D
}

sealed external interface Tuple5<out A : JsAny?, out B : JsAny?, out C : JsAny?, out D : JsAny?, out E : JsAny?> :
    Tuple4<A, B, C, D> {
    @JsAlias("[4]")
    operator fun component5(): E
}

sealed external interface Tuple6<out A : JsAny?, out B : JsAny?, out C : JsAny?, out D : JsAny?, out E : JsAny?, out F : JsAny?> :
    Tuple5<A, B, C, D, E> {
    @JsAlias("[5]")
    operator fun component6(): F
}

sealed external interface Tuple7<out A : JsAny?, out B : JsAny?, out C : JsAny?, out D : JsAny?, out E : JsAny?, out F : JsAny?, out G : JsAny?> :
    Tuple6<A, B, C, D, E, F> {
    @JsAlias("[6]")
    operator fun component7(): G
}
