package js.typedarrays

import seskar.js.JsValue

sealed external interface Alphabet {
    companion object {
        @JsValue("base64")
        val base64: Alphabet

        @JsValue("base64url")
        val base64url: Alphabet
    }
}
