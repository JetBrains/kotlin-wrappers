// Automatically generated - do not modify!

package electron.core

external interface OffscreenSharedTexture {
// Docs: https://electronjs.org/docs/api/structures/offscreen-shared-texture
    /**
     * Release the resources. The `texture` cannot be directly passed to another
     * process, users need to maintain texture lifecycles in main process, but it is
     * safe to pass the `textureInfo` to another process. Only a limited number of
     * textures can exist at the same time, so it's important that you call
     * `texture.release()` as soon as you're done with the texture.
     */
    var release: () -> Unit

    /**
     * The shared texture info.
     */
    var textureInfo: TextureInfo
}
