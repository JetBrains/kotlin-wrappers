// Automatically generated - do not modify!

package vscode

/**
// ORIGINAL SOURCE

/**
 * An extension context is a collection of utilities private to an
 * extension.
 *
 * An instance of an `ExtensionContext` is provided as the first
 * parameter to the `activate`-call of an extension.
*/
export interface ExtensionContext {

/**
 * An array to which disposables can be added. When this
 * extension is deactivated the disposables will be disposed.
 *
 * *Note* that asynchronous dispose-functions aren't awaited.
*/
readonly subscriptions: {
/**
 * Function to clean up resources.
*/
dispose(): any;
}[];

/**
 * A memento object that stores state in the context
 * of the currently opened {@link workspace.workspaceFolders workspace}.
*/
readonly workspaceState: Memento;

/**
 * A memento object that stores state independent
 * of the current opened {@link workspace.workspaceFolders workspace}.
*/
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
};

/**
 * A secret storage object that stores state independent
 * of the current opened {@link workspace.workspaceFolders workspace}.
*/
readonly secrets: SecretStorage;

/**
 * The uri of the directory containing the extension.
*/
readonly extensionUri: Uri;

/**
 * The absolute file path of the directory containing the extension. Shorthand
 * notation for {@link TextDocument.uri ExtensionContext.extensionUri.fsPath} (independent of the uri scheme).
*/
readonly extensionPath: string;

/**
 * Gets the extension's global environment variable collection for this workspace, enabling changes to be
 * applied to terminal environment variables.
*/
readonly environmentVariableCollection: GlobalEnvironmentVariableCollection;

/**
 * Get the absolute path of a resource contained in the extension.
 *
 * *Note* that an absolute uri can be constructed via {@linkcode Uri.joinPath} and
 * {@linkcode ExtensionContext.extensionUri extensionUri}, e.g. `vscode.Uri.joinPath(context.extensionUri, relativePath);`
 *
 * @param relativePath A relative path to a resource contained in the extension.
 * @returns The absolute path of the resource.
*/
asAbsolutePath(relativePath: string): string;

/**
 * The uri of a workspace specific directory in which the extension
 * can store private state. The directory might not exist and creation is
 * up to the extension. However, the parent directory is guaranteed to be existent.
 * The value is `undefined` when no workspace nor folder has been opened.
 *
 * Use {@linkcode ExtensionContext.workspaceState workspaceState} or
 * {@linkcode ExtensionContext.globalState globalState} to store key value data.
 *
 * @see {@linkcode FileSystem workspace.fs} for how to read and write files and folders from
 *  a uri.
*/
readonly storageUri: Uri | undefined;

/**
 * An absolute file path of a workspace specific directory in which the extension
 * can store private state. The directory might not exist on disk and creation is
 * up to the extension. However, the parent directory is guaranteed to be existent.
 *
 * Use {@linkcode ExtensionContext.workspaceState workspaceState} or
 * {@linkcode ExtensionContext.globalState globalState} to store key value data.
 *
 * @deprecated Use {@link ExtensionContext.storageUri storageUri} instead.
*/
readonly storagePath: string | undefined;

/**
 * The uri of a directory in which the extension can store global state.
 * The directory might not exist on disk and creation is
 * up to the extension. However, the parent directory is guaranteed to be existent.
 *
 * Use {@linkcode ExtensionContext.globalState globalState} to store key value data.
 *
 * @see {@linkcode FileSystem workspace.fs} for how to read and write files and folders from
 *  an uri.
*/
readonly globalStorageUri: Uri;

/**
 * An absolute file path in which the extension can store global state.
 * The directory might not exist on disk and creation is
 * up to the extension. However, the parent directory is guaranteed to be existent.
 *
 * Use {@linkcode ExtensionContext.globalState globalState} to store key value data.
 *
 * @deprecated Use {@link ExtensionContext.globalStorageUri globalStorageUri} instead.
*/
readonly globalStoragePath: string;

/**
 * The uri of a directory in which the extension can create log files.
 * The directory might not exist on disk and creation is up to the extension. However,
 * the parent directory is guaranteed to be existent.
 *
 * @see {@linkcode FileSystem workspace.fs} for how to read and write files and folders from
 *  an uri.
*/
readonly logUri: Uri;

/**
 * An absolute file path of a directory in which the extension can create log files.
 * The directory might not exist on disk and creation is up to the extension. However,
 * the parent directory is guaranteed to be existent.
 *
 * @deprecated Use {@link ExtensionContext.logUri logUri} instead.
*/
readonly logPath: string;

/**
 * The mode the extension is running in. See {@link ExtensionMode}
 * for possible values and scenarios.
*/
readonly extensionMode: ExtensionMode;

/**
 * The current `Extension` instance.
*/
readonly extension: Extension<any>;

/**
 * An object that keeps information about how this extension can use language models.
 *
 * @see {@link LanguageModelChat.sendRequest}
*/
readonly languageModelAccessInformation: LanguageModelAccessInformation;
}

// ORIGINAL SOURCE
 **/
