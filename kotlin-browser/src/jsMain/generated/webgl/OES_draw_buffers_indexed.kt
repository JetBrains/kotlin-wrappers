// Automatically generated - do not modify!

package webgl

sealed external interface OES_draw_buffers_indexed {
    fun blendEquationSeparateiOES(
        buf: GLuint,
        modeRGB: GLenum,
        modeAlpha: GLenum,
    )

    fun blendEquationiOES(
        buf: GLuint,
        mode: GLenum,
    )

    fun blendFuncSeparateiOES(
        buf: GLuint,
        srcRGB: GLenum,
        dstRGB: GLenum,
        srcAlpha: GLenum,
        dstAlpha: GLenum,
    )

    fun blendFunciOES(
        buf: GLuint,
        src: GLenum,
        dst: GLenum,
    )

    fun colorMaskiOES(
        buf: GLuint,
        r: GLboolean,
        g: GLboolean,
        b: GLboolean,
        a: GLboolean,
    )

    fun disableiOES(
        target: GLenum,
        index: GLuint,
    )

    fun enableiOES(
        target: GLenum,
        index: GLuint,
    )
}
