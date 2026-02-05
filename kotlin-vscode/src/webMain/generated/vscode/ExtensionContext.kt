// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray

/**
 * An extension context is a collection of utilities private to an
 * extension.
 *
 * An instance of an `ExtensionContext` is provided as the first
 * parameter to the `activate`-call of an extension.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ExtensionContext)
 */
external interface ExtensionContext {
    /**
     * An array to which disposables can be added. When this
     * extension is deactivated the disposables will be disposed.
     *
     * *Note* that asynchronous dispose-functions aren't awaited.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ExtensionContext.subscriptions)
     */
    val subscriptions: ReadonlyArray<DisposableLike>

    /**
     * A memento object that stores state in the context
     * of the currently opened [workspace][workspace.workspaceFolders].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ExtensionContext.workspaceState)
     */
    val workspaceState: Memento

    /**
     * A memento object that stores state independent
     * of the current opened [workspace][workspace.workspaceFolders].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ExtensionContext.globalState)
     */
    /*
    readonly globalState: Memento & {
        /**
         * Set the keys whose values should be synchronized across devices when synchronizing user-data
         * like configuration, extensions, and mementos.
         *
         * Note that this function defines the whole set of keys whose values are synchronized:
         *  - calling it with an empty array stops synchronization for this memento
         *  - calling it with a non-empty array replaces all keys whose values are synchronized
         *
         * For any given set of keys this function needs to be called only once but there is no harm in
         * repeatedly calling it.
         *
         * @param keys The set of keys whose values are synced.
         */
        setKeysForSync(keys: readonly string[]): void;
    }
    */

    /**
     * A secret storage object that stores state independent
     * of the current opened [workspace][workspace.workspaceFolders].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ExtensionContext.secrets)
     */
    val secrets: SecretStorage

    /**
     * The uri of the directory containing the extension.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ExtensionContext.extensionUri)
     */
    val extensionUri: Uri

    /**
     * The absolute file path of the directory containing the extension. Shorthand
     * notation for [ExtensionContext.extensionUri.fsPath][TextDocument.uri] (independent of the uri scheme).
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ExtensionContext.extensionPath)
     */
    val extensionPath: String

    /**
     * Gets the extension's global environment variable collection for this workspace, enabling changes to be
     * applied to terminal environment variables.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ExtensionContext.environmentVariableCollection)
     */
    val environmentVariableCollection: GlobalEnvironmentVariableCollection

    /**
     * Get the absolute path of a resource contained in the extension.
     *
     * *Note* that an absolute uri can be constructed via [Uri.joinPath] and
     * [extensionUri][ExtensionContext.extensionUri], e.g. `vscode.Uri.joinPath(context.extensionUri, relativePath);`
     *
     * @param relativePath A relative path to a resource contained in the extension.
     * @returns The absolute path of the resource.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ExtensionContext.asAbsolutePath)
     */
    fun asAbsolutePath(relativePath: String): String

    /**
     * The uri of a workspace specific directory in which the extension
     * can store private state. The directory might not exist and creation is
     * up to the extension. However, the parent directory is guaranteed to be existent.
     * The value is `undefined` when no workspace nor folder has been opened.
     *
     * Use [workspaceState][ExtensionContext.workspaceState] or
     * [globalState][ExtensionContext.globalState] to store key value data.
     *
     * @see [workspace.fs][FileSystem] for how to read and write files and folders from
     *  a uri.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ExtensionContext.storageUri)
     */
    val storageUri: Uri?

    /**
     * The uri of a directory in which the extension can store global state.
     * The directory might not exist on disk and creation is
     * up to the extension. However, the parent directory is guaranteed to be existent.
     *
     * Use [globalState][ExtensionContext.globalState] to store key value data.
     *
     * @see [workspace.fs][FileSystem] for how to read and write files and folders from
     *  an uri.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ExtensionContext.globalStorageUri)
     */
    val globalStorageUri: Uri

    /**
     * The uri of a directory in which the extension can create log files.
     * The directory might not exist on disk and creation is up to the extension. However,
     * the parent directory is guaranteed to be existent.
     *
     * @see [workspace.fs][FileSystem] for how to read and write files and folders from
     *  an uri.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ExtensionContext.logUri)
     */
    val logUri: Uri

    /**
     * The mode the extension is running in. See [ExtensionMode]
     * for possible values and scenarios.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ExtensionContext.extensionMode)
     */
    val extensionMode: ExtensionMode

    /**
     * The current `Extension` instance.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ExtensionContext.extension)
     */
    val extension: Extension<*>

    /**
     * An object that keeps information about how this extension can use language models.
     *
     * @see [LanguageModelChat.sendRequest]
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ExtensionContext.languageModelAccessInformation)
     */
    val languageModelAccessInformation: LanguageModelAccessInformation
}
