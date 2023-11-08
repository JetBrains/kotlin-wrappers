// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package tanstack.query.core

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface FetchStatus {
    companion object {
        @JsValue("fetching")
        val fetching: FetchStatus

        @JsValue("paused")
        val paused: FetchStatus

        @JsValue("idle")
        val idle: FetchStatus
    }
}
