@file:Suppress("NOTHING_TO_INLINE")

package js.function

import js.array.*

@JsExternalInheritorsOnly
external interface JsFunction<in A : JsTuple, out R>

inline fun <R> JsFunction(
    noinline fn: () -> R,
): JsFunction<JsTuple, R> =
    fn.unsafeCast<JsFunction<JsTuple, R>>()

inline fun <P1, R> JsFunction(
    noinline fn: (P1) -> R,
): JsFunction<JsTuple1<P1>, R> =
    fn.unsafeCast<JsFunction<JsTuple, R>>()

inline fun <P1, P2, R> JsFunction(
    noinline fn: (P1, P2) -> R,
): JsFunction<JsTuple2<P1, P2>, R> =
    fn.unsafeCast<JsFunction<JsTuple, R>>()

inline fun <P1, P2, P3, R> JsFunction(
    noinline fn: (P1, P2, P3) -> R,
): JsFunction<JsTuple3<P1, P2, P3>, R> =
    fn.unsafeCast<JsFunction<JsTuple, R>>()

inline fun <P1, P2, P3, P4, R> JsFunction(
    noinline fn: (P1, P2, P3, P4) -> R,
): JsFunction<JsTuple4<P1, P2, P3, P4>, R> =
    fn.unsafeCast<JsFunction<JsTuple, R>>()

inline fun <P1, P2, P3, P4, P5, R> JsFunction(
    noinline fn: (P1, P2, P3, P4, P5) -> R,
): JsFunction<JsTuple5<P1, P2, P3, P4, P5>, R> =
    fn.unsafeCast<JsFunction<JsTuple, R>>()

inline fun <P1, P2, P3, P4, P5, P6, R> JsFunction(
    noinline fn: (P1, P2, P3, P4, P5, P6) -> R,
): JsFunction<JsTuple6<P1, P2, P3, P4, P5, P6>, R> =
    fn.unsafeCast<JsFunction<JsTuple, R>>()

inline fun <P1, P2, P3, P4, P5, P6, P7, R> JsFunction(
    noinline fn: (P1, P2, P3, P4, P5, P6, P7) -> R,
): JsFunction<JsTuple7<P1, P2, P3, P4, P5, P6, P7>, R> =
    fn.unsafeCast<JsFunction<JsTuple, R>>()

inline operator fun <R> JsFunction<JsTuple, R>.invoke(): R =
    asDynamic()()

inline operator fun <P1, R> JsFunction<JsTuple1<P1>, R>.invoke(p1: P1): R =
    asDynamic()(p1)

inline operator fun <P1, P2, R> JsFunction<JsTuple2<P1, P2>, R>.invoke(p1: P1, p2: P2): R =
    asDynamic()(p1, p2)

inline operator fun <P1, P2, P3, R> JsFunction<JsTuple3<P1, P2, P3>, R>.invoke(p1: P1, p2: P2, p3: P3): R =
    asDynamic()(p1, p2, p3)

inline operator fun <P1, P2, P3, P4, R> JsFunction<JsTuple4<P1, P2, P3, P4>, R>.invoke(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
): R =
    asDynamic()(p1, p2, p3, p4)

inline operator fun <P1, P2, P3, P4, P5, R> JsFunction<JsTuple5<P1, P2, P3, P4, P5>, R>.invoke(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
): R =
    asDynamic()(p1, p2, p3, p4, p5)

inline operator fun <P1, P2, P3, P4, P5, P6, R> JsFunction<JsTuple6<P1, P2, P3, P4, P5, P6>, R>.invoke(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
): R =
    asDynamic()(p1, p2, p3, p4, p5, p6)

inline operator fun <P1, P2, P3, P4, P5, P6, P7, R> JsFunction<JsTuple7<P1, P2, P3, P4, P5, P6, P7>, R>.invoke(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
): R =
    asDynamic()(p1, p2, p3, p4, p5, p6, p7)
