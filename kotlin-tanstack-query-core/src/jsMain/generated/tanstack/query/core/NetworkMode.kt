// Automatically generated - do not modify!

package tanstack.query.core

import seskar.js.JsValue

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
