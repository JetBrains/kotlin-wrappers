@file:JsModule("pako")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package pako

import kotlin.js.JsModule
import kotlin.js.JsName

@JsName("constants")
sealed /* enum */
external interface Flush {
    companion object {
        val Z_NO_FLUSH: Flush
        val Z_PARTIAL_FLUSH: Flush
        val Z_SYNC_FLUSH: Flush
        val Z_FINISH: Flush
        val Z_BLOCK: Flush
        val Z_TREES: Flush
    }
}
