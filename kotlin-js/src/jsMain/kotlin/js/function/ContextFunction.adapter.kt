package js.function

import js.array.*

private val TO_CONTEXT_FUNCTION: JsFunction<Tuple1<Function<*>>, ContextFunction<Any?, Tuple, Nothing>> =
    ContextFunction(
        "source",
        // language=javascript
        body = """
        return function(...args) {
            return source(this, ...args)
        }
        """.trimIndent()
    )

fun <C, R> ContextFunction(
    fn: C.() -> R,
): ContextFunction<C, Tuple, R> =
    TO_CONTEXT_FUNCTION(fn)

fun <C, P1, R> ContextFunction(
    fn: C.(P1) -> R,
): ContextFunction<C, Tuple1<P1>, R> =
    TO_CONTEXT_FUNCTION(fn)

fun <C, P1, P2, R> ContextFunction(
    fn: C.(P1, P2) -> R,
): ContextFunction<C, Tuple2<P1, P2>, R> =
    TO_CONTEXT_FUNCTION(fn)

fun <C, P1, P2, P3, R> ContextFunction(
    fn: C.(P1, P2, P3) -> R,
): ContextFunction<C, Tuple3<P1, P2, P3>, R> =
    TO_CONTEXT_FUNCTION(fn)

fun <C, P1, P2, P3, P4, R> ContextFunction(
    fn: C.(P1, P2, P3, P4) -> R,
): ContextFunction<C, Tuple4<P1, P2, P3, P4>, R> =
    TO_CONTEXT_FUNCTION(fn)

fun <C, P1, P2, P3, P4, P5, R> ContextFunction(
    fn: C.(P1, P2, P3, P4, P5) -> R,
): ContextFunction<C, Tuple5<P1, P2, P3, P4, P5>, R> =
    TO_CONTEXT_FUNCTION(fn)

fun <C, P1, P2, P3, P4, P5, P6, R> ContextFunction(
    fn: C.(P1, P2, P3, P4, P5, P6) -> R,
): ContextFunction<C, Tuple6<P1, P2, P3, P4, P5, P6>, R> =
    TO_CONTEXT_FUNCTION(fn)

fun <C, P1, P2, P3, P4, P5, P6, P7, R> ContextFunction(
    fn: C.(P1, P2, P3, P4, P5, P6, P7) -> R,
): ContextFunction<C, Tuple7<P1, P2, P3, P4, P5, P6, P7>, R> =
    TO_CONTEXT_FUNCTION(fn)
