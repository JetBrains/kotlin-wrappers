package react.select

import seskar.js.JsValue

sealed external interface CreateOptionPosition {
    companion object {
        @JsValue("first")
        val first: CreateOptionPosition

        @JsValue("last")
        val last: CreateOptionPosition
    }
}
