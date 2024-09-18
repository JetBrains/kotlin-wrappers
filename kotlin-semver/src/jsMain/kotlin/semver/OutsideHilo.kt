package semver

import seskar.js.JsValue

sealed external interface OutsideHilo {
    companion object {
        @JsValue(">")
        val greater: OutsideHilo

        @JsValue("<")
        val less: OutsideHilo
    }
}
