package js.function

import js.array.*

@JsName(FUNCTION)
external fun <R> JsFunction(
    body: String,
): JsFunction<JsTuple, R>

@JsName(FUNCTION)
external fun <P1, R> JsFunction(
    p1: String,
    body: String,
): JsFunction<JsTuple1<P1>, R>

@JsName(FUNCTION)
external fun <P1, P2, R> JsFunction(
    p1: String,
    p2: String,
    body: String,
): JsFunction<JsTuple2<P1, P2>, R>

@JsName(FUNCTION)
external fun <P1, P2, P3, R> JsFunction(
    p1: String,
    p2: String,
    p3: String,
    body: String,
): JsFunction<JsTuple3<P1, P2, P3>, R>

@JsName(FUNCTION)
external fun <P1, P2, P3, P4, R> JsFunction(
    p1: String,
    p2: String,
    p3: String,
    p4: String,
    body: String,
): JsFunction<JsTuple4<P1, P2, P3, P4>, R>

@JsName(FUNCTION)
external fun <P1, P2, P3, P4, P5, R> JsFunction(
    p1: String,
    p2: String,
    p3: String,
    p4: String,
    p5: String,
    body: String,
): JsFunction<JsTuple5<P1, P2, P3, P4, P5>, R>

@JsName(FUNCTION)
external fun <P1, P2, P3, P4, P5, P6, R> JsFunction(
    p1: String,
    p2: String,
    p3: String,
    p4: String,
    p5: String,
    p6: String,
    body: String,
): JsFunction<JsTuple6<P1, P2, P3, P4, P5, P6>, R>

@JsName(FUNCTION)
external fun <P1, P2, P3, P4, P5, P6, P7, R> JsFunction(
    p1: String,
    p2: String,
    p3: String,
    p4: String,
    p5: String,
    p6: String,
    p7: String,
    body: String,
): JsFunction<JsTuple7<P1, P2, P3, P4, P5, P6, P7>, R>
