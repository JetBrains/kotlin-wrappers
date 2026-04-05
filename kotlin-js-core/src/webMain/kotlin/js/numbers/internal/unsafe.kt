package js.numbers.internal

import js.internal.InternalApi
import kotlin.js.JsAny
import kotlin.js.js

@InternalApi
fun <T : JsAny> unsafeNegate(a: T): T =
    js("-a")

@InternalApi
fun <T : JsAny> unsafeAdd(a: T, b: T): T =
    js("a + b")

@InternalApi
fun <T : JsAny> unsafeSubtract(a: T, b: T): T =
    js("a - b")

@InternalApi
fun <T : JsAny> unsafeMultiply(a: T, b: T): T =
    js("a * b")

@InternalApi
fun <T : JsAny> unsafeDivide(a: T, b: T): T =
    js("a / b")

@InternalApi
fun <T : JsAny> unsafeBitwiseOr(a: T, b: T): T =
    js("a | b")

@InternalApi
fun <T : JsAny> unsafeBitwiseAnd(a: T, b: T): T =
    js("a & b")
