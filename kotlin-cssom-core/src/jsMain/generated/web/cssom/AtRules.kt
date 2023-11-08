// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.cssom

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface AtRules {
    companion object {
        @JsValue("@charset")
        val charset: AtRules

        @JsValue("@counter-style")
        val counterStyle: AtRules

        @JsValue("@document")
        val document: AtRules

        @JsValue("@font-face")
        val fontFace: AtRules

        @JsValue("@font-feature-values")
        val fontFeatureValues: AtRules

        @JsValue("@font-palette-values")
        val fontPaletteValues: AtRules

        @JsValue("@import")
        val import: AtRules

        @JsValue("@keyframes")
        val keyframes: AtRules

        @JsValue("@layer")
        val layer: AtRules

        @JsValue("@media")
        val media: AtRules

        @JsValue("@namespace")
        val namespace: AtRules

        @JsValue("@page")
        val page: AtRules

        @JsValue("@property")
        val property: AtRules

        @JsValue("@scroll-timeline")
        val scrollTimeline: AtRules

        @JsValue("@supports")
        val supports: AtRules

        @JsValue("@viewport")
        val viewport: AtRules
    }
}
