// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package cesium

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
