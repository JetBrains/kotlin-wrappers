@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
)

package js.iterable

import js.core.JsAny

sealed external interface IteratorResult<out T : JsAny?, out TReturn : JsAny?> :
    JsAny
