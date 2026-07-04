// Automatically generated - do not modify!

@file:JsModule("@cesium/engine")

package cesium.engine

/**
 * Specifies whether the object casts or receives shadows from light sources when
 * shadows are enabled.
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#ShadowMode">Online Documentation</a>
 */
sealed /* enum */
external interface ShadowMode {
    companion object {

        /**
         * The object does not cast or receive shadows.
         *
         * Value - `0`
         */
        val DISABLED: ShadowMode

        /**
         * The object casts and receives shadows.
         *
         * Value - `1`
         */
        val ENABLED: ShadowMode

        /**
         * The object casts shadows only.
         *
         * Value - `2`
         */
        val CAST_ONLY: ShadowMode

        /**
         * The object receives shadows only.
         *
         * Value - `3`
         */
        val RECEIVE_ONLY: ShadowMode
    }
}
