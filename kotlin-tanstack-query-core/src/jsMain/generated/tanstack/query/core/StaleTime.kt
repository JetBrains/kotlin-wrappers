// Automatically generated - do not modify!

package tanstack.query.core

import js.reflect.unsafeCast
import seskar.js.JsValue

sealed external interface StaleTime {
    companion object {
        @JsValue("static")
        val static: StaleTime
    }
}

inline fun StaleTime(
    value: JsDuration,
): StaleTime =
    unsafeCast(value)
