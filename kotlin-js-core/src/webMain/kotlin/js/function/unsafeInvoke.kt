package js.function

import kotlin.js.JsAny

expect fun <R : JsAny?> unsafeInvoke(
    f: JsAny,
): R

expect fun <R : JsAny?> unsafeInvoke(
    f: JsAny,
    p1: JsAny?,
): R

expect fun <R : JsAny?> unsafeInvoke(
    f: JsAny,
    p1: JsAny?,
    p2: JsAny?,
): R

expect fun <R : JsAny?> unsafeInvoke(
    f: JsAny,
    p1: JsAny?,
    p2: JsAny?,
    p3: JsAny?,
): R

expect fun <R : JsAny?> unsafeInvoke(
    f: JsAny,
    p1: JsAny?,
    p2: JsAny?,
    p3: JsAny?,
    p4: JsAny?,
): R

expect fun <R : JsAny?> unsafeInvoke(
    f: JsAny,
    p1: JsAny?,
    p2: JsAny?,
    p3: JsAny?,
    p4: JsAny?,
    p5: JsAny?,
): R

expect fun <R : JsAny?> unsafeInvoke(
    f: JsAny,
    p1: JsAny?,
    p2: JsAny?,
    p3: JsAny?,
    p4: JsAny?,
    p5: JsAny?,
    p6: JsAny?,
): R

expect fun <R : JsAny?> unsafeInvoke(
    f: JsAny,
    p1: JsAny?,
    p2: JsAny?,
    p3: JsAny?,
    p4: JsAny?,
    p5: JsAny?,
    p6: JsAny?,
    p7: JsAny?,
): R
