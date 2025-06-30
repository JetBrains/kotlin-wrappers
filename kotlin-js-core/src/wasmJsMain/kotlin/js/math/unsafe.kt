package js.math

actual fun <T : JsAny> unsafeNegate(a: T): T =
    js("-a")

actual fun <T : JsAny> unsafeAdd(a: T, b: T): T =
    js("a + b")

actual fun <T : JsAny> unsafeSubtract(a: T, b: T): T =
    js("a - b")

actual fun <T : JsAny> unsafeMultiply(a: T, b: T): T =
    js("a * b")

actual fun <T : JsAny> unsafeDivide(a: T, b: T): T =
    js("a / b")

actual fun <T : JsAny> unsafeBitwiseOr(a: T, b: T): T =
    js("a | b")

actual fun <T : JsAny> unsafeBitwiseAnd(a: T, b: T): T =
    js("a & b")
