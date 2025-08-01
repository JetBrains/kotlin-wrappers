package js.function

import js.array.*
import js.core.JsAny
import js.reflect.Reflect

inline operator fun <R : JsAny> ConstructorFunction<Tuple, R>.invoke(): R =
    Reflect.construct(
        target = this,
        argumentsList = emptyTuple(),
    )

inline operator fun <P1 : JsAny?, R : JsAny> ConstructorFunction<Tuple1<P1>, R>.invoke(
    p1: P1,
): R =
    Reflect.construct(
        target = this,
        argumentsList = tupleOf(p1),
    )

inline operator fun <P1 : JsAny?, P2 : JsAny?, R : JsAny> ConstructorFunction<Tuple2<P1, P2>, R>.invoke(
    p1: P1,
    p2: P2,
): R =
    Reflect.construct(
        target = this,
        argumentsList = tupleOf(p1, p2),
    )


inline operator fun <P1 : JsAny?, P2 : JsAny?, P3 : JsAny?, R : JsAny> ConstructorFunction<Tuple3<P1, P2, P3>, R>.invoke(
    p1: P1,
    p2: P2,
    p3: P3,
): R =
    Reflect.construct(
        target = this,
        argumentsList = tupleOf(p1, p2, p3),
    )


inline operator fun <P1 : JsAny?, P2 : JsAny?, P3 : JsAny?, P4 : JsAny?, R : JsAny> ConstructorFunction<Tuple4<P1, P2, P3, P4>, R>.invoke(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
): R =
    Reflect.construct(
        target = this,
        argumentsList = tupleOf(p1, p2, p3, p4),
    )


inline operator fun <P1 : JsAny?, P2 : JsAny?, P3 : JsAny?, P4 : JsAny?, P5 : JsAny?, R : JsAny> ConstructorFunction<Tuple5<P1, P2, P3, P4, P5>, R>.invoke(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
): R =
    Reflect.construct(
        target = this,
        argumentsList = tupleOf(p1, p2, p3, p4, p5),
    )


inline operator fun <P1 : JsAny?, P2 : JsAny?, P3 : JsAny?, P4 : JsAny?, P5 : JsAny?, P6 : JsAny?, R : JsAny> ConstructorFunction<Tuple6<P1, P2, P3, P4, P5, P6>, R>.invoke(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
): R =
    Reflect.construct(
        target = this,
        argumentsList = tupleOf(p1, p2, p3, p4, p5, p6),
    )


inline operator fun <P1 : JsAny?, P2 : JsAny?, P3 : JsAny?, P4 : JsAny?, P5 : JsAny?, P6 : JsAny?, P7 : JsAny?, R : JsAny> ConstructorFunction<Tuple7<P1, P2, P3, P4, P5, P6, P7>, R>.invoke(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
    p5: P5,
    p6: P6,
    p7: P7,
): R =
    Reflect.construct(
        target = this,
        argumentsList = tupleOf(p1, p2, p3, p4, p5, p6, p7),
    )
