package js.math

import kotlin.js.JsAny
import kotlin.js.js

fun <T : JsAny> unsafeNegate(a: T): T =
    js("-a")

fun <T : JsAny> unsafeAdd(a: T, b: T): T =
    js("a + b")

fun <T : JsAny> unsafeSubtract(a: T, b: T): T =
    js("a - b")

fun <T : JsAny> unsafeMultiply(a: T, b: T): T =
    js("a * b")

fun <T : JsAny> unsafeDivide(a: T, b: T): T =
    js("a / b")

fun <T : JsAny> unsafeBitwiseOr(a: T, b: T): T =
    js("a | b")

fun <T : JsAny> unsafeBitwiseAnd(a: T, b: T): T =
    js("a & b")
