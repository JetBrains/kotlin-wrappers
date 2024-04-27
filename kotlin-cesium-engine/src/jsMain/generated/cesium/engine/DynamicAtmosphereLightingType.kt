// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

/**
 * Atmosphere lighting effects (sky atmosphere, ground atmosphere, fog) can be
 * further modified with dynamic lighting from the sun or other light source
 * that changes over time. This enum determines which light source to use.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#DynamicAtmosphereLightingType">Online Documentation</a>
 */
sealed external interface DynamicAtmosphereLightingType {
    companion object {

        /**
         * Do not use dynamic atmosphere lighting. Atmosphere lighting effects will
         * be lit from directly above rather than using the scene's light source.
         */
        val NONE: DynamicAtmosphereLightingType

        /**
         * Use the scene's current light source for dynamic atmosphere lighting.
         */
        val SCENE_LIGHT: DynamicAtmosphereLightingType

        /**
         * Force the dynamic atmosphere lighting to always use the sunlight direction,
         * even if the scene uses a different light source.
         */
        val SUNLIGHT: DynamicAtmosphereLightingType
    }
}
