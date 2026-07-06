@file:JsModule("pako")

package pako

@JsName("constants")
/* enum */
external class Strategy
private constructor() {
    companion object {
        val Z_FILTERED: Strategy
        val Z_HUFFMAN_ONLY: Strategy
        val Z_RLE: Strategy
        val Z_FIXED: Strategy
        val Z_DEFAULT_STRATEGY: Strategy
    }
}
