package js.function

import js.core.JsAny

actual fun <R : JsAny?> unsafeInvoke(
    f: JsAny,
): R =
    js("f()")

actual fun <R : JsAny?> unsafeInvoke(
    f: JsAny,
    p1: JsAny?,
): R =
    js("f(p1)")

actual fun <R : JsAny?> unsafeInvoke(
    f: JsAny,
    p1: JsAny?,
    p2: JsAny?,
): R =
    js("f(p1, p2)")

actual fun <R : JsAny?> unsafeInvoke(
    f: JsAny,
    p1: JsAny?,
    p2: JsAny?,
    p3: JsAny?,
): R =
    js("f(p1, p2, p3)")

actual fun <R : JsAny?> unsafeInvoke(
    f: JsAny,
    p1: JsAny?,
    p2: JsAny?,
    p3: JsAny?,
    p4: JsAny?,
): R =
    js("f(p1, p2, p3, p4)")

actual fun <R : JsAny?> unsafeInvoke(
    f: JsAny,
    p1: JsAny?,
    p2: JsAny?,
    p3: JsAny?,
    p4: JsAny?,
    p5: JsAny?,
): R =
    js("f(p1, p2, p3, p4, p5)")

actual fun <R : JsAny?> unsafeInvoke(
    f: JsAny,
    p1: JsAny?,
    p2: JsAny?,
    p3: JsAny?,
    p4: JsAny?,
    p5: JsAny?,
    p6: JsAny?,
): R =
    js("f(p1, p2, p3, p4, p5, p6)")

actual fun <R : JsAny?> unsafeInvoke(
    f: JsAny,
    p1: JsAny?,
    p2: JsAny?,
    p3: JsAny?,
    p4: JsAny?,
    p5: JsAny?,
    p6: JsAny?,
    p7: JsAny?,
): R =
    js("f(p1, p2, p3, p4, p5, p6, p7)")
