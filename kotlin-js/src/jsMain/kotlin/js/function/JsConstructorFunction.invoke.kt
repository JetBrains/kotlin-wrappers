@file:Suppress(
    "NOTHING_TO_INLINE",
)

package js.function

import js.array.*
import js.reflect.Reflect

inline operator fun <R : Any> JsConstructorFunction<JsTuple, R>.invoke(): R =
    Reflect.construct(
        target = this,
        argumentsList = emptyTuple(),
    )

inline operator fun <P1, R : Any> JsConstructorFunction<JsTuple1<P1>, R>.invoke(
    p1: P1,
): R =
    Reflect.construct(
        target = this,
        argumentsList = tupleOf(p1),
    )

inline operator fun <P1, P2, R : Any> JsConstructorFunction<JsTuple2<P1, P2>, R>.invoke(
    p1: P1,
    p2: P2,
): R =
    Reflect.construct(
        target = this,
        argumentsList = tupleOf(p1, p2),
    )


inline operator fun <P1, P2, P3, R : Any> JsConstructorFunction<JsTuple3<P1, P2, P3>, R>.invoke(
    p1: P1,
    p2: P2,
    p3: P3,
): R =
    Reflect.construct(
        target = this,
        argumentsList = tupleOf(p1, p2, p3),
    )


inline operator fun <P1, P2, P3, P4, R : Any> JsConstructorFunction<JsTuple4<P1, P2, P3, P4>, R>.invoke(
    p1: P1,
    p2: P2,
    p3: P3,
    p4: P4,
): R =
    Reflect.construct(
        target = this,
        argumentsList = tupleOf(p1, p2, p3, p4),
    )


inline operator fun <P1, P2, P3, P4, P5, R : Any> JsConstructorFunction<JsTuple5<P1, P2, P3, P4, P5>, R>.invoke(
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


inline operator fun <P1, P2, P3, P4, P5, P6, R : Any> JsConstructorFunction<JsTuple6<P1, P2, P3, P4, P5, P6>, R>.invoke(
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


inline operator fun <P1, P2, P3, P4, P5, P6, P7, R : Any> JsConstructorFunction<JsTuple7<P1, P2, P3, P4, P5, P6, P7>, R>.invoke(
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
