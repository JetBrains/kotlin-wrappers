package js.reflect

import kotlin.js.JsAny

expect fun <T : JsAny> legacyUnsafeCast(
    value: Function<*>,
): T
