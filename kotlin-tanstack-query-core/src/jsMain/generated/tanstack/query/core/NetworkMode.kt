// Automatically generated - do not modify!

package tanstack.query.core

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
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
