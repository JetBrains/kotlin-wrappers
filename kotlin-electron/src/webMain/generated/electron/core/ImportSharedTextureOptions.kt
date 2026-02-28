// Automatically generated - do not modify!

package electron.core

external interface ImportSharedTextureOptions {
    /**
     * The information of the shared texture to import.
     */
    var textureInfo: SharedTextureImportTextureInfo

    /**
     * Called when all references in all processes are released. You should keep the
     * imported texture valid until this callback is called.
     */
    var allReferencesReleased: (() -> Unit)?
}
