// Automatically generated - do not modify!

@file:JsModule("cesium")

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package cesium

/**
 * Constants for WebGL index datatypes.  These corresponds to the
 * `type` parameter of [drawElements](http://www.khronos.org/opengles/sdk/docs/man/xhtml/glDrawElements.xml).
 * @see <a href="https://cesium.com/docs/cesiumjs-ref-doc/global.html#IndexDatatype">Online Documentation</a>
 */
sealed external interface IndexDatatype {
    companion object {

        /**
         * 8-bit unsigned byte corresponding to `UNSIGNED_BYTE` and the type
         * of an element in `Uint8Array`.
         */
        val UNSIGNED_BYTE: IndexDatatype

        /**
         * 16-bit unsigned short corresponding to `UNSIGNED_SHORT` and the type
         * of an element in `Uint16Array`.
         */
        val UNSIGNED_SHORT: IndexDatatype

        /**
         * 32-bit unsigned int corresponding to `UNSIGNED_INT` and the type
         * of an element in `Uint32Array`.
         */
        val UNSIGNED_INT: IndexDatatype
    }
}
