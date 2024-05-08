package js.generator

import js.array.*
import seskar.js.JsSpecialName

@JsSpecialName(ASYNC_GENERATOR_FUNCTION)
external fun <R : AsyncGenerator<*, *, *>> AsyncGeneratorFunction(
    body: String,
): AsyncGeneratorFunction<JsTuple, R>

@JsSpecialName(ASYNC_GENERATOR_FUNCTION)
external fun <P1, R : AsyncGenerator<*, *, *>> AsyncGeneratorFunction(
    p1: String,
    body: String,
): AsyncGeneratorFunction<JsTuple1<P1>, R>

@JsSpecialName(ASYNC_GENERATOR_FUNCTION)
external fun <P1, P2, R : AsyncGenerator<*, *, *>> AsyncGeneratorFunction(
    p1: String,
    p2: String,
    body: String,
): AsyncGeneratorFunction<JsTuple2<P1, P2>, R>

@JsSpecialName(ASYNC_GENERATOR_FUNCTION)
external fun <P1, P2, P3, R : AsyncGenerator<*, *, *>> AsyncGeneratorFunction(
    p1: String,
    p2: String,
    p3: String,
    body: String,
): AsyncGeneratorFunction<JsTuple3<P1, P2, P3>, R>

@JsSpecialName(ASYNC_GENERATOR_FUNCTION)
external fun <P1, P2, P3, P4, R : AsyncGenerator<*, *, *>> AsyncGeneratorFunction(
    p1: String,
    p2: String,
    p3: String,
    p4: String,
    body: String,
): AsyncGeneratorFunction<JsTuple4<P1, P2, P3, P4>, R>

@JsSpecialName(ASYNC_GENERATOR_FUNCTION)
external fun <P1, P2, P3, P4, P5, R : AsyncGenerator<*, *, *>> AsyncGeneratorFunction(
    p1: String,
    p2: String,
    p3: String,
    p4: String,
    p5: String,
    body: String,
): AsyncGeneratorFunction<JsTuple5<P1, P2, P3, P4, P5>, R>

@JsSpecialName(ASYNC_GENERATOR_FUNCTION)
external fun <P1, P2, P3, P4, P5, P6, R : AsyncGenerator<*, *, *>> AsyncGeneratorFunction(
    p1: String,
    p2: String,
    p3: String,
    p4: String,
    p5: String,
    p6: String,
    body: String,
): AsyncGeneratorFunction<JsTuple6<P1, P2, P3, P4, P5, P6>, R>

@JsSpecialName(ASYNC_GENERATOR_FUNCTION)
external fun <P1, P2, P3, P4, P5, P6, P7, R : AsyncGenerator<*, *, *>> AsyncGeneratorFunction(
    p1: String,
    p2: String,
    p3: String,
    p4: String,
    p5: String,
    p6: String,
    p7: String,
    body: String,
): AsyncGeneratorFunction<JsTuple7<P1, P2, P3, P4, P5, P6, P7>, R>
