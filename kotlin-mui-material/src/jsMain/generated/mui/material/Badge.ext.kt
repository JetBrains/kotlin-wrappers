// Automatically generated - do not modify!

package mui.material

import seskar.js.JsValue
import seskar.js.JsVirtual

@Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsVirtual
sealed external interface BadgeColor {
    companion object {
        @JsValue("primary")
        val primary: BadgeColor

        @JsValue("secondary")
        val secondary: BadgeColor

        @JsValue("default")
        val default: BadgeColor

        @JsValue("error")
        val error: BadgeColor

        @JsValue("info")
        val info: BadgeColor

        @JsValue("success")
        val success: BadgeColor

        @JsValue("warning")
        val warning: BadgeColor
    }
}

@Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsVirtual
sealed external interface BadgeVariant {
    companion object {
        @JsValue("standard")
        val standard: BadgeVariant

        @JsValue("dot")
        val dot: BadgeVariant
    }
}

@Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsVirtual
sealed external interface BadgeOverlap {
    companion object {
        @JsValue("rectangular")
        val rectangular: BadgeOverlap

        @JsValue("circular")
        val circular: BadgeOverlap
    }
}

@Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsVirtual
sealed external interface BadgeOriginVertical {
    companion object {
        @JsValue("top")
        val top: BadgeOriginVertical

        @JsValue("bottom")
        val bottom: BadgeOriginVertical
    }
}

@Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsVirtual
sealed external interface BadgeOriginHorizontal {
    companion object {
        @JsValue("left")
        val left: BadgeOriginHorizontal

        @JsValue("right")
        val right: BadgeOriginHorizontal
    }
}
