package js.reflect

expect fun <T : JsAny> unsafeCast(
    value: Boolean,
): T

expect fun <T : JsAny> unsafeCast(
    value: String,
): T

expect fun <T : JsAny> unsafeCast(
    value: String?,
): T?

expect fun <T : JsAny> unsafeCast(
    value: Int,
): T

inline fun <T : JsAny> unsafeCast(
    value: UInt,
): T =
    unsafeCast(value.toDouble())

expect fun <T : JsAny> unsafeCast(
    value: Double,
): T

expect fun <T : JsAny> unsafeCast(
    value: JsAny,
): T

expect fun <T : JsAny> unsafeCast(
    value: JsAny?,
): T?
