// Automatically generated - do not modify!

package electron.core

external interface SendSharedTextureOptions {
    /**
     * The target frame to transfer the shared texture to. For `WebContents`, you can
     * pass `webContents.mainFrame`. If you provide a `webFrameMain` that is not a main
     * frame, you'll need to enable `webPreferences.nodeIntegrationInSubFrames` for
     * this, since this feature requires IPC between main and the frame.
     */
    var frame: WebFrameMain

    /**
     * The imported shared texture.
     */
    var importedSharedTexture: SharedTextureImported
}
