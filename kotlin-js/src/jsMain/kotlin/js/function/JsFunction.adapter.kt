@file:Suppress(
    "NOTHING_TO_INLINE",
)

package js.function

import js.array.*

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
