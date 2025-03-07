package js.function

import js.array.*
import js.core.JsAny
import kotlin.js.JsName

@JsName(FUNCTION)
external fun <R : JsAny?> JsFunction(
    body: String,
): JsFunction<JsTuple, R>

@JsName(FUNCTION)
external fun <P1 : JsAny?, R : JsAny?> JsFunction(
    p1: String,
    body: String,
): JsFunction<JsTuple1<P1>, R>

@JsName(FUNCTION)
external fun <P1 : JsAny?, P2 : JsAny?, R : JsAny?> JsFunction(
    p1: String,
    p2: String,
    body: String,
): JsFunction<JsTuple2<P1, P2>, R>

@JsName(FUNCTION)
external fun <P1 : JsAny?, P2 : JsAny?, P3 : JsAny?, R : JsAny?> JsFunction(
    p1: String,
    p2: String,
    p3: String,
    body: String,
): JsFunction<JsTuple3<P1, P2, P3>, R>

@JsName(FUNCTION)
external fun <P1 : JsAny?, P2 : JsAny?, P3 : JsAny?, P4 : JsAny?, R : JsAny?> JsFunction(
    p1: String,
    p2: String,
    p3: String,
    p4: String,
    body: String,
): JsFunction<JsTuple4<P1, P2, P3, P4>, R>

@JsName(FUNCTION)
external fun <P1 : JsAny?, P2 : JsAny?, P3 : JsAny?, P4 : JsAny?, P5 : JsAny?, R : JsAny?> JsFunction(
    p1: String,
    p2: String,
    p3: String,
    p4: String,
    p5: String,
    body: String,
): JsFunction<JsTuple5<P1, P2, P3, P4, P5>, R>

@JsName(FUNCTION)
external fun <P1 : JsAny?, P2 : JsAny?, P3 : JsAny?, P4 : JsAny?, P5 : JsAny?, P6 : JsAny?, R : JsAny?> JsFunction(
    p1: String,
    p2: String,
    p3: String,
    p4: String,
    p5: String,
    p6: String,
    body: String,
): JsFunction<JsTuple6<P1, P2, P3, P4, P5, P6>, R>

@JsName(FUNCTION)
external fun <P1 : JsAny?, P2 : JsAny?, P3 : JsAny?, P4 : JsAny?, P5 : JsAny?, P6 : JsAny?, P7 : JsAny?, R : JsAny?> JsFunction(
    p1: String,
    p2: String,
    p3: String,
    p4: String,
    p5: String,
    p6: String,
    p7: String,
    body: String,
): JsFunction<JsTuple7<P1, P2, P3, P4, P5, P6, P7>, R>
