@file:JsModule("pako")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package pako

import kotlin.js.JsModule
import kotlin.js.JsName

@JsName("constants")
sealed /* enum */
external interface Strategy {
    companion object {
        val Z_FILTERED: Strategy
        val Z_HUFFMAN_ONLY: Strategy
        val Z_RLE: Strategy
        val Z_FIXED: Strategy
        val Z_DEFAULT_STRATEGY: Strategy
    }
}
