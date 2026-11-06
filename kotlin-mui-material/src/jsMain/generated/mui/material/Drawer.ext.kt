// Automatically generated - do not modify!

package mui.material

import seskar.js.JsValue

sealed /* union */
external interface DrawerVariant {
    companion object {
        @JsValue("permanent")
        val permanent: DrawerVariant

        @JsValue("persistent")
        val persistent: DrawerVariant

        @JsValue("temporary")
        val temporary: DrawerVariant
    }
}

sealed /* union */
external interface DrawerAnchor {
    companion object {
        @JsValue("left")
        val left: DrawerAnchor

        @JsValue("top")
        val top: DrawerAnchor

        @JsValue("right")
        val right: DrawerAnchor

        @JsValue("bottom")
        val bottom: DrawerAnchor
    }
}
