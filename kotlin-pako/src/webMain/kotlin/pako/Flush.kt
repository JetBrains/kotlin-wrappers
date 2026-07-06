@file:JsModule("pako")

package pako

@JsName("constants")
/* enum */
external class Flush
private constructor() {
    companion object {
        val Z_NO_FLUSH: Flush
        val Z_PARTIAL_FLUSH: Flush
        val Z_SYNC_FLUSH: Flush
        val Z_FINISH: Flush
        val Z_BLOCK: Flush
        val Z_TREES: Flush
    }
}
