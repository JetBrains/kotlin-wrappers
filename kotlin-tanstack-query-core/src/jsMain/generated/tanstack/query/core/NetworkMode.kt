// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package tanstack.query.core

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface NetworkMode {
    companion object {
        @JsValue("online")
        val online: NetworkMode

        @JsValue("always")
        val always: NetworkMode

        @JsValue("offlineFirst")
        val offlineFirst: NetworkMode
    }
}
