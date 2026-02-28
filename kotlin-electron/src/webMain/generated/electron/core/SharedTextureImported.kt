// Automatically generated - do not modify!

package electron.core

external interface SharedTextureImported {
// Docs: https://electronjs.org/docs/api/structures/shared-texture-imported
    /**
     * Create a `VideoFrame` that uses the imported shared texture in the current
     * process. You can call `VideoFrame.close()` once you've finished using the
     * object. The underlying resources will wait for GPU finish internally.
     */
    var getVideoFrame: () -> web.codecs.VideoFrame

    /**
     * Release this object's reference of the imported shared texture. The underlying
     * resource will be alive until every reference is released.
     */
    var release: () -> Unit

    /**
     * Provides subtle APIs to interact with the imported shared texture for advanced
     * users.
     */
    var subtle: SharedTextureImportedSubtle

    /**
     * The unique identifier of the imported shared texture.
     */
    var textureId: String
}
