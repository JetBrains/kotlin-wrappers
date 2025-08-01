package js.generator

import js.array.*
import js.core.JsAny
import kotlin.js.JsName

@JsName(ASYNC_GENERATOR_FUNCTION)
external fun <R : AsyncGenerator<*, *, *>> AsyncGeneratorFunction(
    body: String,
): AsyncGeneratorFunction<Tuple, R>

@JsName(ASYNC_GENERATOR_FUNCTION)
external fun <P1 : JsAny?, R : AsyncGenerator<*, *, *>> AsyncGeneratorFunction(
    p1: String,
    body: String,
): AsyncGeneratorFunction<Tuple1<P1>, R>

@JsName(ASYNC_GENERATOR_FUNCTION)
external fun <P1 : JsAny?, P2 : JsAny?, R : AsyncGenerator<*, *, *>> AsyncGeneratorFunction(
    p1: String,
    p2: String,
    body: String,
): AsyncGeneratorFunction<Tuple2<P1, P2>, R>

@JsName(ASYNC_GENERATOR_FUNCTION)
external fun <P1 : JsAny?, P2 : JsAny?, P3 : JsAny?, R : AsyncGenerator<*, *, *>> AsyncGeneratorFunction(
    p1: String,
    p2: String,
    p3: String,
    body: String,
): AsyncGeneratorFunction<Tuple3<P1, P2, P3>, R>

@JsName(ASYNC_GENERATOR_FUNCTION)
external fun <P1 : JsAny?, P2 : JsAny?, P3 : JsAny?, P4 : JsAny?, R : AsyncGenerator<*, *, *>> AsyncGeneratorFunction(
    p1: String,
    p2: String,
    p3: String,
    p4: String,
    body: String,
): AsyncGeneratorFunction<Tuple4<P1, P2, P3, P4>, R>

@JsName(ASYNC_GENERATOR_FUNCTION)
external fun <P1 : JsAny?, P2 : JsAny?, P3 : JsAny?, P4 : JsAny?, P5 : JsAny?, R : AsyncGenerator<*, *, *>> AsyncGeneratorFunction(
    p1: String,
    p2: String,
    p3: String,
    p4: String,
    p5: String,
    body: String,
): AsyncGeneratorFunction<Tuple5<P1, P2, P3, P4, P5>, R>

@JsName(ASYNC_GENERATOR_FUNCTION)
external fun <P1 : JsAny?, P2 : JsAny?, P3 : JsAny?, P4 : JsAny?, P5 : JsAny?, P6 : JsAny?, R : AsyncGenerator<*, *, *>> AsyncGeneratorFunction(
    p1: String,
    p2: String,
    p3: String,
    p4: String,
    p5: String,
    p6: String,
    body: String,
): AsyncGeneratorFunction<Tuple6<P1, P2, P3, P4, P5, P6>, R>

@JsName(ASYNC_GENERATOR_FUNCTION)
external fun <P1 : JsAny?, P2 : JsAny?, P3 : JsAny?, P4 : JsAny?, P5 : JsAny?, P6 : JsAny?, P7 : JsAny?, R : AsyncGenerator<*, *, *>> AsyncGeneratorFunction(
    p1: String,
    p2: String,
    p3: String,
    p4: String,
    p5: String,
    p6: String,
    p7: String,
    body: String,
): AsyncGeneratorFunction<Tuple7<P1, P2, P3, P4, P5, P6, P7>, R>
