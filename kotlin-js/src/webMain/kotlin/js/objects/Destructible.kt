package js.objects

import js.reflect.JsExternalInheritorsOnly
import js.reflect.Reflect.deleteProperty
import kotlin.reflect.KProperty1

@JsExternalInheritorsOnly
external interface Destructible<R : Destructible<R>>

fun <T : R, P1, R : Destructible<R>> T.destruct(
    p1: KProperty1<in T, P1>,
): Pair<P1, R> {
    val v1 = p1.get(this)

    val rest: R = Object.assign(unsafeJso(), this)
    deleteProperty(rest, p1.name)

    return Pair(v1, rest)
}

fun <T : R, P1, P2, R : Destructible<R>> T.destruct(
    p1: KProperty1<in T, P1>,
    p2: KProperty1<in T, P2>,
): Triple<P1, P2, R> {
    val v1 = p1.get(this)
    val v2 = p2.get(this)

    val rest: R = Object.assign(unsafeJso(), this)
    deleteProperty(rest, p1.name)
    deleteProperty(rest, p2.name)

    return Triple(v1, v2, rest)
}
