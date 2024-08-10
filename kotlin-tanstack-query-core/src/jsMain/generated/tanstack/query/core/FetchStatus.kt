// Automatically generated - do not modify!

package tanstack.query.core

import seskar.js.JsValue

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
