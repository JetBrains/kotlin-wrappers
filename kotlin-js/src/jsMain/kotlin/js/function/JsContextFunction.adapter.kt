package js.function

import js.array.*

private val TO_CONTEXT_FUNCTION: JsFunction<JsTuple1<Function<*>>, JsContextFunction<Any?, JsTuple, Nothing>> =
    JsContextFunction(
        "source",
        // language=javascript
        body = """
        return function(...args) {
            return source(this, ...args)
        }
        """.trimIndent()
    )

fun <C, R> JsContextFunction(
    fn: C.() -> R,
): JsContextFunction<C, JsTuple, R> =
    TO_CONTEXT_FUNCTION(fn)

fun <C, P1, R> JsContextFunction(
    fn: C.(P1) -> R,
): JsContextFunction<C, JsTuple1<P1>, R> =
    TO_CONTEXT_FUNCTION(fn)

fun <C, P1, P2, R> JsContextFunction(
    fn: C.(P1, P2) -> R,
): JsContextFunction<C, JsTuple2<P1, P2>, R> =
    TO_CONTEXT_FUNCTION(fn)

fun <C, P1, P2, P3, R> JsContextFunction(
    fn: C.(P1, P2, P3) -> R,
): JsContextFunction<C, JsTuple3<P1, P2, P3>, R> =
    TO_CONTEXT_FUNCTION(fn)

fun <C, P1, P2, P3, P4, R> JsContextFunction(
    fn: C.(P1, P2, P3, P4) -> R,
): JsContextFunction<C, JsTuple4<P1, P2, P3, P4>, R> =
    TO_CONTEXT_FUNCTION(fn)

fun <C, P1, P2, P3, P4, P5, R> JsContextFunction(
    fn: C.(P1, P2, P3, P4, P5) -> R,
): JsContextFunction<C, JsTuple5<P1, P2, P3, P4, P5>, R> =
    TO_CONTEXT_FUNCTION(fn)

fun <C, P1, P2, P3, P4, P5, P6, R> JsContextFunction(
    fn: C.(P1, P2, P3, P4, P5, P6) -> R,
): JsContextFunction<C, JsTuple6<P1, P2, P3, P4, P5, P6>, R> =
    TO_CONTEXT_FUNCTION(fn)

fun <C, P1, P2, P3, P4, P5, P6, P7, R> JsContextFunction(
    fn: C.(P1, P2, P3, P4, P5, P6, P7) -> R,
): JsContextFunction<C, JsTuple7<P1, P2, P3, P4, P5, P6, P7>, R> =
    TO_CONTEXT_FUNCTION(fn)
