package react.dom.svg

import seskar.js.JsValue

sealed external interface SVGRepeatCount {
    companion object {
        @JsValue("indefinite")
        val indefinite: SVGRepeatCount
    }
}
