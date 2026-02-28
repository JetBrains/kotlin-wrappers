// Automatically generated - do not modify!

package electron.core

external interface Offscreen {
    /**
     * Whether to use GPU shared texture for accelerated paint event. Defaults to
     * `false`. See the offscreen rendering tutorial for more details.
     *
     * @experimental
     */
    var useSharedTexture: Boolean?

    /**
     * The requested output format of the shared texture. Defaults to `argb`. The name
     * is originated from Chromium `media::VideoPixelFormat` enum suffix and only
     * subset of them are supported. The actual output pixel format and color space of
     * the texture should refer to `OffscreenSharedTexture` object in the `paint`
     * event.
     *
     * @experimental
     */
    var sharedTexturePixelFormat: (OffscreenSharedTexturePixelFormat)?
}
