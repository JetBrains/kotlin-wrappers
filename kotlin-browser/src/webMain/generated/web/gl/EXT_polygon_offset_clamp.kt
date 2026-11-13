// Automatically generated - do not modify!

package web.gl

/**
 * The **`EXT_polygon_offset_clamp`** extension is part of the WebGL API and adds a limit to the depth offset set with polygonOffset().
 */
external interface EXT_polygon_offset_clamp {
    /**
     * The **`polygonOffsetClampEXT()`** method of the EXT_polygon_offset_clamp extension of the WebGL API specifies the scale factor and units used to calculate depth offsets, like WebGLRenderingContext.polygonOffset(), and a limit for the resulting offset.
     */
    fun polygonOffsetClampEXT(
        factor: GLfloat,
        units: GLfloat,
        clamp: GLfloat,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EXT_polygon_offset_clamp#ext.polygon_offset_clamp_ext)
     */
    val POLYGON_OFFSET_CLAMP_EXT: GLenum
}
