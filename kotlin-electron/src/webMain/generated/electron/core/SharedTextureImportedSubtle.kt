// Automatically generated - do not modify!

package electron.core

external interface SharedTextureImportedSubtle {
// Docs: https://electronjs.org/docs/api/structures/shared-texture-imported-subtle
    /**
     * This method is for advanced users. If used, it is typically called after
     * `finishTransferSharedTexture`, and should be passed to the object which was
     * called `startTransferSharedTexture` to prevent the source object release the
     * underlying resource before the target object actually acquire the reference at
     * gpu process asyncly.
     */
    var getFrameCreationSyncToken: () -> SharedTextureSyncToken

    /**
     * Create a `VideoFrame` that uses the imported shared texture in the current
     * process. You can call `VideoFrame.close()` once you've finished using the
     * object. The underlying resources will wait for GPU finish internally.
     */
    var getVideoFrame: () -> web.codecs.VideoFrame

    /**
     * Release the resources. If you transferred and get multiple
     * `SharedTextureImported` objects, you have to `release` every one of them. The
     * resource on the GPU process will be destroyed when the last one is released.
     */
    var release: (callback: (() -> Unit)? /* use undefined for default */) -> Unit

    /**
     * This method is for advanced users. If used, this object's underlying resource
     * will not be released until the set sync token is fulfilled at gpu process. By
     * using sync tokens, users are not required to use release callbacks for lifetime
     * management.
     */
    var setReleaseSyncToken: (syncToken: SharedTextureSyncToken) -> Unit

    /**
     * Create a `SharedTextureTransfer` that can be serialized and transferred to other
     * processes.
     */
    var startTransferSharedTexture: () -> SharedTextureTransfer
}
