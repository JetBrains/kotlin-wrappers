// Automatically generated - do not modify!

package web.window

import seskar.js.JsValue

sealed external interface WindowTarget {
    companion object {
        @JsValue("_self")
        val _self: WindowTarget

        @JsValue("_blank")
        val _blank: WindowTarget

        @JsValue("_parent")
        val _parent: WindowTarget

        @JsValue("_top")
        val _top: WindowTarget
    }
}
