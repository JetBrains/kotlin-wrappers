// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package cesium

/**
 * The types of imagery provided by Bing Maps.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#BingMapsStyle">Online Documentation</a>
 */

sealed external interface BingMapsStyle {
    companion object {

        /**
         * Aerial imagery.
         */
        val AERIAL: BingMapsStyle

        /**
         * Aerial imagery with a road overlay.
         */
        val AERIAL_WITH_LABELS: BingMapsStyle

        /**
         * Aerial imagery with a road overlay.
         */
        val AERIAL_WITH_LABELS_ON_DEMAND: BingMapsStyle

        /**
         * Roads without additional imagery.
         */
        val ROAD: BingMapsStyle

        /**
         * Roads without additional imagery.
         */
        val ROAD_ON_DEMAND: BingMapsStyle

        /**
         * A dark version of the road maps.
         */
        val CANVAS_DARK: BingMapsStyle

        /**
         * A lighter version of the road maps.
         */
        val CANVAS_LIGHT: BingMapsStyle

        /**
         * A grayscale version of the road maps.
         */
        val CANVAS_GRAY: BingMapsStyle

        /**
         * Ordnance Survey imagery. This imagery is visible only for the London, UK area.
         */
        val ORDNANCE_SURVEY: BingMapsStyle

        /**
         * Collins Bart imagery.
         */
        val COLLINS_BART: BingMapsStyle
    }
}
