// Automatically generated - do not modify!

package electron.core

external interface SharedTexture {
// Docs: https://electronjs.org/docs/api/shared-texture
    /**
     * Imports the shared texture from the given options.
     *
     * > [!NOTE] This method is only available in the main process.
     *
     * The imported shared texture.
     *
     * @experimental
     */
    fun importSharedTexture(options: ImportSharedTextureOptions): SharedTextureImported

    /**
     * Send the imported shared texture to a renderer process. You must register a
     * receiver at renderer process before calling this method. This method has a
     * 1000ms timeout. Ensure the receiver is set and the renderer process is alive
     * before calling this method.
     *
     * > [!NOTE] This method is only available in the main process.
     *
     * Resolves when the transfer is complete.
     *
     * @experimental
     */
    fun sendSharedTexture(
        options: SendSharedTextureOptions,
        vararg args: Any?,
    ): js.promise.Promise<js.core.Void>

    /**
     * Set a callback to receive imported shared textures from the main process.
     *
     * > [!NOTE] This method is only available in the renderer process.
     *
     * @experimental
     */
    fun setSharedTextureReceiver(
        callback: Function<js.promise.Promise<js.core.Void>>, // (receivedSharedTextureData: ReceivedSharedTextureData, ...args: any[]) => Promise<void>
    )

    /**
     * A `SharedTextureSubtle` property, provides subtle APIs for interacting with
     * shared texture for advanced users.
     *
     * @experimental
     */
    var subtle: SharedTextureSubtle
}
