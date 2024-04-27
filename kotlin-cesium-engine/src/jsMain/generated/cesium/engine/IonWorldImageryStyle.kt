// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

/**
 * The types of imagery provided by [createWorldImagery].
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#IonWorldImageryStyle">Online Documentation</a>
 */
sealed external interface IonWorldImageryStyle {
    companion object {

        /**
         * Aerial imagery.
         */
        val AERIAL: IonWorldImageryStyle

        /**
         * Aerial imagery with a road overlay.
         */
        val AERIAL_WITH_LABELS: IonWorldImageryStyle

        /**
         * Roads without additional imagery.
         */
        val ROAD: IonWorldImageryStyle
    }
}
