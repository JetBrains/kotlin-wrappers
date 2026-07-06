@file:JsModule("pako")

package pako

@JsName("constants")
/* enum */
external class ReturnCode
private constructor() {
    companion object {
        val Z_OK: ReturnCode
        val Z_STREAM_END: ReturnCode
        val Z_NEED_DICT: ReturnCode
        val Z_ERRNO: ReturnCode
        val Z_STREAM_ERROR: ReturnCode
        val Z_DATA_ERROR: ReturnCode
        val Z_BUF_ERROR: ReturnCode
        val Z_DEFAULT_STRATEGY: ReturnCode
    }
}

