package js.function

import js.internal.InternalApi
import kotlin.js.JsAny

@InternalApi
external interface UnsafeInvoker {
    operator fun <R : JsAny?> invoke(): R

    operator fun <R : JsAny?> invoke(
        p1: JsAny?,
    ): R

    operator fun <R : JsAny?> invoke(
        p1: JsAny?,
        p2: JsAny?,
    ): R

    operator fun <R : JsAny?> invoke(
        p1: JsAny?,
        p2: JsAny?,
        p3: JsAny?,
    ): R

    operator fun <R : JsAny?> invoke(
        p1: JsAny?,
        p2: JsAny?,
        p3: JsAny?,
        p4: JsAny?,
    ): R

    operator fun <R : JsAny?> invoke(
        p1: JsAny?,
        p2: JsAny?,
        p3: JsAny?,
        p4: JsAny?,
        p5: JsAny?,
    ): R

    operator fun <R : JsAny?> invoke(
        p1: JsAny?,
        p2: JsAny?,
        p3: JsAny?,
        p4: JsAny?,
        p5: JsAny?,
        p6: JsAny?,
    ): R

    operator fun <R : JsAny?> invoke(
        p1: JsAny?,
        p2: JsAny?,
        p3: JsAny?,
        p4: JsAny?,
        p5: JsAny?,
        p6: JsAny?,
        p7: JsAny?,
    ): R
}
