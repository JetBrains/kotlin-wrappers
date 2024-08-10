package react.dom

import seskar.js.JsValue

sealed external interface PreinitAs {
    companion object {
        @JsValue("script")
        val script: PreinitAs

        @JsValue("style")
        val style: PreinitAs
    }
}
