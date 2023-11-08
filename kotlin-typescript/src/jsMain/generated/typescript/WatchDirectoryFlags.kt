// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package typescript

import seskar.js.JsIntValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface WatchDirectoryFlags {
    companion object {
        @JsIntValue(0)
        val None: WatchDirectoryFlags

        @JsIntValue(1)
        val Recursive: WatchDirectoryFlags
    }
}
