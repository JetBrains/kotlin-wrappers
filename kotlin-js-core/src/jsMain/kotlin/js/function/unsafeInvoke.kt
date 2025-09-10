package js.function

actual inline fun <R : JsAny?> unsafeInvoke(
    f: JsAny,
): R =
    f.asDynamic()()

actual inline fun <R : JsAny?> unsafeInvoke(
    f: JsAny,
    p1: JsAny?,
): R =
    f.asDynamic()(p1)

actual inline fun <R : JsAny?> unsafeInvoke(
    f: JsAny,
    p1: JsAny?,
    p2: JsAny?,
): R =
    f.asDynamic()(p1, p2)

actual inline fun <R : JsAny?> unsafeInvoke(
    f: JsAny,
    p1: JsAny?,
    p2: JsAny?,
    p3: JsAny?,
): R =
    f.asDynamic()(p1, p2, p3)

actual inline fun <R : JsAny?> unsafeInvoke(
    f: JsAny,
    p1: JsAny?,
    p2: JsAny?,
    p3: JsAny?,
    p4: JsAny?,
): R =
    f.asDynamic()(p1, p2, p3, p4)

actual inline fun <R : JsAny?> unsafeInvoke(
    f: JsAny,
    p1: JsAny?,
    p2: JsAny?,
    p3: JsAny?,
    p4: JsAny?,
    p5: JsAny?,
): R =
    f.asDynamic()(p1, p2, p3, p4, p5)

actual inline fun <R : JsAny?> unsafeInvoke(
    f: JsAny,
    p1: JsAny?,
    p2: JsAny?,
    p3: JsAny?,
    p4: JsAny?,
    p5: JsAny?,
    p6: JsAny?,
): R =
    f.asDynamic()(p1, p2, p3, p4, p5, p6)

actual inline fun <R : JsAny?> unsafeInvoke(
    f: JsAny,
    p1: JsAny?,
    p2: JsAny?,
    p3: JsAny?,
    p4: JsAny?,
    p5: JsAny?,
    p6: JsAny?,
    p7: JsAny?,
): R =
    f.asDynamic()(p1, p2, p3, p4, p5, p6, p7)
