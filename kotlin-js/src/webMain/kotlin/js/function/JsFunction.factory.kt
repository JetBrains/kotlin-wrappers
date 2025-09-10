package js.function

import js.array.*
import kotlin.js.JsAny
import kotlin.js.JsName

@JsName(FUNCTION)
external fun <R : JsAny?> JsFunction(
    body: String,
): JsFunction<Tuple, R>

@JsName(FUNCTION)
external fun <P1 : JsAny?, R : JsAny?> JsFunction(
    p1: String,
    body: String,
): JsFunction<Tuple1<P1>, R>

@JsName(FUNCTION)
external fun <P1 : JsAny?, P2 : JsAny?, R : JsAny?> JsFunction(
    p1: String,
    p2: String,
    body: String,
): JsFunction<Tuple2<P1, P2>, R>

@JsName(FUNCTION)
external fun <P1 : JsAny?, P2 : JsAny?, P3 : JsAny?, R : JsAny?> JsFunction(
    p1: String,
    p2: String,
    p3: String,
    body: String,
): JsFunction<Tuple3<P1, P2, P3>, R>

@JsName(FUNCTION)
external fun <P1 : JsAny?, P2 : JsAny?, P3 : JsAny?, P4 : JsAny?, R : JsAny?> JsFunction(
    p1: String,
    p2: String,
    p3: String,
    p4: String,
    body: String,
): JsFunction<Tuple4<P1, P2, P3, P4>, R>

@JsName(FUNCTION)
external fun <P1 : JsAny?, P2 : JsAny?, P3 : JsAny?, P4 : JsAny?, P5 : JsAny?, R : JsAny?> JsFunction(
    p1: String,
    p2: String,
    p3: String,
    p4: String,
    p5: String,
    body: String,
): JsFunction<Tuple5<P1, P2, P3, P4, P5>, R>

@JsName(FUNCTION)
external fun <P1 : JsAny?, P2 : JsAny?, P3 : JsAny?, P4 : JsAny?, P5 : JsAny?, P6 : JsAny?, R : JsAny?> JsFunction(
    p1: String,
    p2: String,
    p3: String,
    p4: String,
    p5: String,
    p6: String,
    body: String,
): JsFunction<Tuple6<P1, P2, P3, P4, P5, P6>, R>

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
): JsFunction<Tuple7<P1, P2, P3, P4, P5, P6, P7>, R>
