package js.function

import js.array.*

private val TO_CONTEXT_FUNCTION: JsFunction<JsTuple1<Function<*>>, ContextFunction<Any?, JsTuple, Nothing>> =
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
): ContextFunction<C, JsTuple, R> =
    TO_CONTEXT_FUNCTION(fn)

fun <C, P1, R> ContextFunction(
    fn: C.(P1) -> R,
): ContextFunction<C, JsTuple1<P1>, R> =
    TO_CONTEXT_FUNCTION(fn)

fun <C, P1, P2, R> ContextFunction(
    fn: C.(P1, P2) -> R,
): ContextFunction<C, JsTuple2<P1, P2>, R> =
    TO_CONTEXT_FUNCTION(fn)

fun <C, P1, P2, P3, R> ContextFunction(
    fn: C.(P1, P2, P3) -> R,
): ContextFunction<C, JsTuple3<P1, P2, P3>, R> =
    TO_CONTEXT_FUNCTION(fn)

fun <C, P1, P2, P3, P4, R> ContextFunction(
    fn: C.(P1, P2, P3, P4) -> R,
): ContextFunction<C, JsTuple4<P1, P2, P3, P4>, R> =
    TO_CONTEXT_FUNCTION(fn)

fun <C, P1, P2, P3, P4, P5, R> ContextFunction(
    fn: C.(P1, P2, P3, P4, P5) -> R,
): ContextFunction<C, JsTuple5<P1, P2, P3, P4, P5>, R> =
    TO_CONTEXT_FUNCTION(fn)

fun <C, P1, P2, P3, P4, P5, P6, R> ContextFunction(
    fn: C.(P1, P2, P3, P4, P5, P6) -> R,
): ContextFunction<C, JsTuple6<P1, P2, P3, P4, P5, P6>, R> =
    TO_CONTEXT_FUNCTION(fn)

fun <C, P1, P2, P3, P4, P5, P6, P7, R> ContextFunction(
    fn: C.(P1, P2, P3, P4, P5, P6, P7) -> R,
): ContextFunction<C, JsTuple7<P1, P2, P3, P4, P5, P6, P7>, R> =
    TO_CONTEXT_FUNCTION(fn)
