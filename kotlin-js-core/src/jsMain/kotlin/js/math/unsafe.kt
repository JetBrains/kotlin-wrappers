package js.math

actual inline fun <T : JsAny> unsafeNegate(a: T): T =
    js("-a")

actual inline fun <T : JsAny> unsafeAdd(a: T, b: T): T =
    js("a + b")

actual inline fun <T : JsAny> unsafeSubtract(a: T, b: T): T =
    js("a - b")

actual inline fun <T : JsAny> unsafeMultiply(a: T, b: T): T =
    js("a * b")

actual inline fun <T : JsAny> unsafeDivide(a: T, b: T): T =
    js("a / b")

actual inline fun <T : JsAny> unsafeBitwiseOr(a: T, b: T): T =
    js("a | b")

actual inline fun <T : JsAny> unsafeBitwiseAnd(a: T, b: T): T =
    js("a & b")
