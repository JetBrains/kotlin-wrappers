// Automatically generated - do not modify!

package mui.material

import seskar.js.JsValue
import seskar.js.JsVirtual

@Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsVirtual
sealed external interface DrawerVariant {
    companion object {
        @JsValue("permanent")
        val permanent: DrawerVariant

        @JsValue("persistent")
        val persistent: DrawerVariant

        @JsValue("temporary")
        val temporary: DrawerVariant
    }
}

@Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsVirtual
sealed external interface DrawerAnchor {
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
