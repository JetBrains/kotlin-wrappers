// Automatically generated - do not modify!

package webgl

sealed external interface OES_draw_buffers_indexed {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/OES_draw_buffers_indexed/blendEquationSeparateiOES) */
    fun blendEquationSeparateiOES(
        buf: GLuint,
        modeRGB: GLenum,
        modeAlpha: GLenum,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/OES_draw_buffers_indexed/blendEquationiOES) */
    fun blendEquationiOES(
        buf: GLuint,
        mode: GLenum,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/OES_draw_buffers_indexed/blendFuncSeparateiOES) */
    fun blendFuncSeparateiOES(
        buf: GLuint,
        srcRGB: GLenum,
        dstRGB: GLenum,
        srcAlpha: GLenum,
        dstAlpha: GLenum,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/OES_draw_buffers_indexed/blendFunciOES) */
    fun blendFunciOES(
        buf: GLuint,
        src: GLenum,
        dst: GLenum,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/OES_draw_buffers_indexed/colorMaskiOES) */
    fun colorMaskiOES(
        buf: GLuint,
        r: GLboolean,
        g: GLboolean,
        b: GLboolean,
        a: GLboolean,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/OES_draw_buffers_indexed/disableiOES) */
    fun disableiOES(
        target: GLenum,
        index: GLuint,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/OES_draw_buffers_indexed/enableiOES) */
    fun enableiOES(
        target: GLenum,
        index: GLuint,
    )
}
