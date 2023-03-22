// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package cesium

/**
 * Describes how to draw a label.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#LabelStyle">Online Documentation</a>
 */

sealed external interface LabelStyle {
    companion object {

        /**
         * Fill the text of the label, but do not outline.
         */
        val FILL: LabelStyle

        /**
         * Outline the text of the label, but do not fill.
         */
        val OUTLINE: LabelStyle

        /**
         * Fill and outline the text of the label.
         */
        val FILL_AND_OUTLINE: LabelStyle
    }
}
