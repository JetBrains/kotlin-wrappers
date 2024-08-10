// Automatically generated - do not modify!

package mui.material

import seskar.js.JsValue

sealed external interface SkeletonAnimation {
    companion object {
        @JsValue("pulse")
        val pulse: SkeletonAnimation

        @JsValue("wave")
        val wave: SkeletonAnimation

        @JsValue("`false`")
        val `false`: SkeletonAnimation
    }
}

sealed external interface SkeletonVariant {
    companion object {
        @JsValue("text")
        val text: SkeletonVariant

        @JsValue("rectangular")
        val rectangular: SkeletonVariant

        @JsValue("rounded")
        val rounded: SkeletonVariant

        @JsValue("circular")
        val circular: SkeletonVariant
    }
}
