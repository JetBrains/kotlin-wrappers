// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

/**
 * The types of imagery provided by Bing Maps.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#BingMapsStyle">Online Documentation</a>
 */
sealed /* enum */
external interface BingMapsStyle {
    companion object {

        /**
         * Aerial imagery.
         *
         * Value - `"Aerial"`
         */
        val AERIAL: BingMapsStyle

        /**
         * Aerial imagery with a road overlay.
         *
         * Value - `"AerialWithLabels"`
         */
        val AERIAL_WITH_LABELS: BingMapsStyle

        /**
         * Aerial imagery with a road overlay.
         *
         * Value - `"AerialWithLabelsOnDemand"`
         */
        val AERIAL_WITH_LABELS_ON_DEMAND: BingMapsStyle

        /**
         * Roads without additional imagery.
         *
         * Value - `"Road"`
         */
        val ROAD: BingMapsStyle

        /**
         * Roads without additional imagery.
         *
         * Value - `"RoadOnDemand"`
         */
        val ROAD_ON_DEMAND: BingMapsStyle

        /**
         * A dark version of the road maps.
         *
         * Value - `"CanvasDark"`
         */
        val CANVAS_DARK: BingMapsStyle

        /**
         * A lighter version of the road maps.
         *
         * Value - `"CanvasLight"`
         */
        val CANVAS_LIGHT: BingMapsStyle

        /**
         * A grayscale version of the road maps.
         *
         * Value - `"CanvasGray"`
         */
        val CANVAS_GRAY: BingMapsStyle

        /**
         * Ordnance Survey imagery. This imagery is visible only for the London, UK area.
         *
         * Value - `"OrdnanceSurvey"`
         */
        val ORDNANCE_SURVEY: BingMapsStyle

        /**
         * Collins Bart imagery.
         *
         * Value - `"CollinsBart"`
         */
        val COLLINS_BART: BingMapsStyle
    }
}
