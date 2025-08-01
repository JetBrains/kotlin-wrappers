package js.reflect

import js.core.JsAny

expect fun <T : JsAny> legacyUnsafeCast(
    value: Function<*>,
): T
