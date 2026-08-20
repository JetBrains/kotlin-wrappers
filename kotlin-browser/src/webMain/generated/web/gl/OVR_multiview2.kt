// Automatically generated - do not modify!

package web.gl

/**
 * The **`OVR_multiview2`** extension is part of the WebGL API and adds support for rendering into multiple views simultaneously. This especially useful for virtual reality (VR) and WebXR.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OVR_multiview2)
 */
external interface OVR_multiview2 {
    /**
     * The **`OVR_multiview2.framebufferTextureMultiviewOVR()`** method of the WebGL API attaches a multiview texture to a WebGLFramebuffer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OVR_multiview2/framebufferTextureMultiviewOVR)
     */
    fun framebufferTextureMultiviewOVR(
        target: GLenum,
        attachment: GLenum,
        texture: WebGLTexture?,
        level: GLint,
        baseViewIndex: GLint,
        numViews: GLsizei,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OVR_multiview2#ext.framebuffer_attachment_texture_num_views_ovr)
     */
    val FRAMEBUFFER_ATTACHMENT_TEXTURE_NUM_VIEWS_OVR: GLenum

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OVR_multiview2#ext.framebuffer_attachment_texture_base_view_index_ovr)
     */
    val FRAMEBUFFER_ATTACHMENT_TEXTURE_BASE_VIEW_INDEX_OVR: GLenum

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OVR_multiview2#ext.max_views_ovr)
     */
    val MAX_VIEWS_OVR: GLenum

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/OVR_multiview2#ext.framebuffer_incomplete_view_targets_ovr)
     */
    val FRAMEBUFFER_INCOMPLETE_VIEW_TARGETS_OVR: GLenum
}
