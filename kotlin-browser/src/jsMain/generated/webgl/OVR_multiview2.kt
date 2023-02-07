// Automatically generated - do not modify!

package webgl

sealed external interface OVR_multiview2 {
    fun framebufferTextureMultiviewOVR(
        target: GLenum,
        attachment: GLenum,
        texture: WebGLTexture?,
        level: GLint,
        baseViewIndex: GLint,
        numViews: GLsizei,
    )

    val FRAMEBUFFER_ATTACHMENT_TEXTURE_NUM_VIEWS_OVR: GLenum
    val FRAMEBUFFER_ATTACHMENT_TEXTURE_BASE_VIEW_INDEX_OVR: GLenum
    val MAX_VIEWS_OVR: GLenum
    val FRAMEBUFFER_INCOMPLETE_VIEW_TARGETS_OVR: GLenum
}
