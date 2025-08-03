@file:JsModule("pako")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package pako

import kotlin.js.JsModule
import kotlin.js.JsName

@JsName("constants")
sealed /* enum */
external interface ReturnCode {
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

