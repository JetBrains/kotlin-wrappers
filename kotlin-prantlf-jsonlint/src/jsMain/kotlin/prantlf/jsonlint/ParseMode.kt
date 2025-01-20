package prantlf.jsonlint

import seskar.js.JsValue

/**
 * JSON parsing modes, which are a shortcut for setting multiple parsing options.
 */
sealed external interface ParseMode {
    companion object {
        @JsValue("json")
        val json: ParseMode

        @JsValue("cjson")
        val cjson: ParseMode

        @JsValue("json5")
        val json5: ParseMode
    }
}
