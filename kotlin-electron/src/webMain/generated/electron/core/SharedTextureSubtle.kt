// Automatically generated - do not modify!

package electron.core

external interface SharedTextureSubtle {
// Docs: https://electronjs.org/docs/api/structures/shared-texture-subtle
    /**
     * Finishes the transfer of the shared texture and gets the transferred shared
     * texture. Returns the imported shared texture from the transfer object.
     */
    var finishTransferSharedTexture: (transfer: SharedTextureTransfer) -> SharedTextureImportedSubtle

    /**
     * Imports the shared texture from the given options. Returns the imported shared
     * texture.
     */
    var importSharedTexture: (textureInfo: SharedTextureImportTextureInfo) -> SharedTextureImportedSubtle
}
