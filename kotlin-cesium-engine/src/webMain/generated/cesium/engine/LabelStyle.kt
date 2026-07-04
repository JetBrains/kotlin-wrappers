// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

/**
 * Describes how to draw a label.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#LabelStyle">Online Documentation</a>
 */
sealed /* enum */
external interface LabelStyle {
    companion object {

        /**
         * Fill the text of the label, but do not outline.
         *
         * Value - `0`
         */
        val FILL: LabelStyle

        /**
         * Outline the text of the label, but do not fill.
         *
         * Value - `1`
         */
        val OUTLINE: LabelStyle

        /**
         * Fill and outline the text of the label.
         *
         * Value - `2`
         */
        val FILL_AND_OUTLINE: LabelStyle
    }
}
