@file:Suppress(
    "WRONG_JS_INTEROP_TYPE",
)

package js.array

import js.core.JsAny
import kotlin.js.JsName
import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS

sealed external interface JsTuple {
    @JsName("length")
    val size: Int

    @JsAlias(THIS)
    fun asArray(): ReadonlyArray<JsAny?>
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
