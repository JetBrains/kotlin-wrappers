package js.function

import js.array.*
import js.reflect.legacyUnsafeCast

inline fun <R> JsFunction(
    noinline fn: () -> R,
): JsFunction<Tuple, R> =
    legacyUnsafeCast(fn)

inline fun <P1, R> JsFunction(
    noinline fn: (P1) -> R,
): JsFunction<Tuple1<P1>, R> =
    legacyUnsafeCast(fn)

inline fun <P1, P2, R> JsFunction(
    noinline fn: (P1, P2) -> R,
): JsFunction<Tuple2<P1, P2>, R> =
    legacyUnsafeCast(fn)

inline fun <P1, P2, P3, R> JsFunction(
    noinline fn: (P1, P2, P3) -> R,
): JsFunction<Tuple3<P1, P2, P3>, R> =
    legacyUnsafeCast(fn)

inline fun <P1, P2, P3, P4, R> JsFunction(
    noinline fn: (P1, P2, P3, P4) -> R,
): JsFunction<Tuple4<P1, P2, P3, P4>, R> =
    legacyUnsafeCast(fn)

inline fun <P1, P2, P3, P4, P5, R> JsFunction(
    noinline fn: (P1, P2, P3, P4, P5) -> R,
): JsFunction<Tuple5<P1, P2, P3, P4, P5>, R> =
    legacyUnsafeCast(fn)

inline fun <P1, P2, P3, P4, P5, P6, R> JsFunction(
    noinline fn: (P1, P2, P3, P4, P5, P6) -> R,
): JsFunction<Tuple6<P1, P2, P3, P4, P5, P6>, R> =
    legacyUnsafeCast(fn)

inline fun <P1, P2, P3, P4, P5, P6, P7, R> JsFunction(
    noinline fn: (P1, P2, P3, P4, P5, P6, P7) -> R,
): JsFunction<Tuple7<P1, P2, P3, P4, P5, P6, P7>, R> =
    legacyUnsafeCast(fn)
