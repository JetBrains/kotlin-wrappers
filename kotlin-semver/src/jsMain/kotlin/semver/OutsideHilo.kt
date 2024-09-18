package semver

import seskar.js.JsValue

sealed external interface OutsideHilo {
    companion object {
        @JsValue(">")
        val GT: OutsideHilo

        @JsValue("<")
        val LT: OutsideHilo
    }
}
