package js.math

import kotlin.js.JsAny

expect fun <T : JsAny> unsafeNegate(a: T): T

expect fun <T : JsAny> unsafeAdd(a: T, b: T): T

expect fun <T : JsAny> unsafeSubtract(a: T, b: T): T

expect fun <T : JsAny> unsafeMultiply(a: T, b: T): T

expect fun <T : JsAny> unsafeDivide(a: T, b: T): T

expect fun <T : JsAny> unsafeBitwiseOr(a: T, b: T): T

expect fun <T : JsAny> unsafeBitwiseAnd(a: T, b: T): T
