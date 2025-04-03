package js.function

import js.array.*
import js.reflect.legacyUnsafeCast

inline fun <R> JsFunction(
    noinline fn: () -> R,
): JsFunction<JsTuple, R> =
    legacyUnsafeCast(fn)

inline fun <P1, R> JsFunction(
    noinline fn: (P1) -> R,
): JsFunction<JsTuple1<P1>, R> =
    legacyUnsafeCast(fn)

inline fun <P1, P2, R> JsFunction(
    noinline fn: (P1, P2) -> R,
): JsFunction<JsTuple2<P1, P2>, R> =
    legacyUnsafeCast(fn)

inline fun <P1, P2, P3, R> JsFunction(
    noinline fn: (P1, P2, P3) -> R,
): JsFunction<JsTuple3<P1, P2, P3>, R> =
    legacyUnsafeCast(fn)

inline fun <P1, P2, P3, P4, R> JsFunction(
    noinline fn: (P1, P2, P3, P4) -> R,
): JsFunction<JsTuple4<P1, P2, P3, P4>, R> =
    legacyUnsafeCast(fn)

inline fun <P1, P2, P3, P4, P5, R> JsFunction(
    noinline fn: (P1, P2, P3, P4, P5) -> R,
): JsFunction<JsTuple5<P1, P2, P3, P4, P5>, R> =
    legacyUnsafeCast(fn)

inline fun <P1, P2, P3, P4, P5, P6, R> JsFunction(
    noinline fn: (P1, P2, P3, P4, P5, P6) -> R,
): JsFunction<JsTuple6<P1, P2, P3, P4, P5, P6>, R> =
    legacyUnsafeCast(fn)

inline fun <P1, P2, P3, P4, P5, P6, P7, R> JsFunction(
    noinline fn: (P1, P2, P3, P4, P5, P6, P7) -> R,
): JsFunction<JsTuple7<P1, P2, P3, P4, P5, P6, P7>, R> =
    legacyUnsafeCast(fn)
