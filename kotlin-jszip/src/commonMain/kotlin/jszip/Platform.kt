@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package jszip

import seskar.js.JsValue

sealed external interface Platform {
    companion object {
        @JsValue("DOS")
        val DOS: Platform

        @JsValue("UNIX")
        val UNIX: Platform
    }
}
