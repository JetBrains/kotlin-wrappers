// Automatically generated - do not modify!

package web.gl

sealed external interface OES_draw_buffers_indexed {
    /**
     * The `blendEquationSeparateiOES()` method of the OES_draw_buffers_indexed WebGL extension sets the RGB and alpha blend equations separately for a particular draw buffer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OES_draw_buffers_indexed/blendEquationSeparateiOES)
     */
    fun blendEquationSeparateiOES(
        buf: GLuint,
        modeRGB: GLenum,
        modeAlpha: GLenum,
    )

    /**
     * The `blendEquationiOES()` method of the `OES_draw_buffers_indexed` WebGL extension sets both the RGB blend and alpha blend equations for a particular draw buffer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OES_draw_buffers_indexed/blendEquationiOES)
     */
    fun blendEquationiOES(
        buf: GLuint,
        mode: GLenum,
    )

    /**
     * The `blendFuncSeparateiOES()` method of the OES_draw_buffers_indexed WebGL extension defines which function is used when blending pixels for RGB and alpha components separately for a particular draw buffer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OES_draw_buffers_indexed/blendFuncSeparateiOES)
     */
    fun blendFuncSeparateiOES(
        buf: GLuint,
        srcRGB: GLenum,
        dstRGB: GLenum,
        srcAlpha: GLenum,
        dstAlpha: GLenum,
    )

    /**
     * The `blendFunciOES()` method of the OES_draw_buffers_indexed WebGL extension defines which function is used when blending pixels for a particular draw buffer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OES_draw_buffers_indexed/blendFunciOES)
     */
    fun blendFunciOES(
        buf: GLuint,
        src: GLenum,
        dst: GLenum,
    )

    /**
     * The `colorMaskiOES()` method of the OES_draw_buffers_indexed WebGL extension sets which color components to enable or to disable when drawing or rendering for a particular draw buffer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OES_draw_buffers_indexed/colorMaskiOES)
     */
    fun colorMaskiOES(
        buf: GLuint,
        r: GLboolean,
        g: GLboolean,
        b: GLboolean,
        a: GLboolean,
    )

    /**
     * The `disableiOES()` method of the OES_draw_buffers_indexed WebGL extension enables blending for a particular draw buffer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OES_draw_buffers_indexed/disableiOES)
     */
    fun disableiOES(
        target: GLenum,
        index: GLuint,
    )

    /**
     * The `enableiOES()` method of the OES_draw_buffers_indexed WebGL extension enables blending for a particular draw buffer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OES_draw_buffers_indexed/enableiOES)
     */
    fun enableiOES(
        target: GLenum,
        index: GLuint,
    )
}
