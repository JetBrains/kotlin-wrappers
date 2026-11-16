// Automatically generated - do not modify!

package web.gl

external interface EXT_clip_control {
    fun clipControlEXT(
        origin: GLenum,
        depth: GLenum,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EXT_clip_control#ext.lower_left_ext)
     */
    val LOWER_LEFT_EXT: GLenum

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EXT_clip_control#ext.upper_left_ext)
     */
    val UPPER_LEFT_EXT: GLenum

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EXT_clip_control#ext.negative_one_to_one_ext)
     */
    val NEGATIVE_ONE_TO_ONE_EXT: GLenum

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EXT_clip_control#ext.zero_to_one_ext)
     */
    val ZERO_TO_ONE_EXT: GLenum

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EXT_clip_control#ext.clip_origin_ext)
     */
    val CLIP_ORIGIN_EXT: GLenum

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EXT_clip_control#ext.clip_depth_mode_ext)
     */
    val CLIP_DEPTH_MODE_EXT: GLenum
}
