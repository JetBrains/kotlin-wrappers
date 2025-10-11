// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.array.ReadonlyArray
import js.core.Void
import js.promise.PromiseLike
import js.typedarrays.Uint8Array
import vscode.workspace.notebookDocuments
import kotlin.js.JsBoolean
import kotlin.js.JsModule
import kotlin.js.JsName
import kotlin.js.JsString
import kotlin.js.definedExternally

/**
 * Namespace for dealing with the current workspace. A workspace is the collection of one
 * or more folders that are opened in an editor window (instance).
 *
 * It is also possible to open an editor without a workspace. For example, when you open a
 * new editor window by selecting a file from your platform's File menu, you will not be
 * inside a workspace. In this mode, some of the editor's capabilities are reduced but you can
 * still open text files and edit them.
 *
 * Refer to https://code.visualstudio.com/docs/editor/workspaces for more information on
 * the concept of workspaces.
 *
 * The workspace offers support for [listening][workspace.createFileSystemWatcher] to fs
 * events and for [finding][workspace.findFiles] files. Both perform well and run _outside_
 * the editor-process so that they should be always used instead of nodejs-equivalents.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#workspace)
 */
external object workspace {
    /**
     * A [file system][FileSystem] instance that allows to interact with local and remote
     * files, e.g. `vscode.workspace.fs.readDirectory(someUri)` allows to retrieve all entries
     * of a directory or `vscode.workspace.fs.stat(anotherUri)` returns the meta data for a
     * file.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#workspace.fs)
     */
    val fs: FileSystem

    /**
     * List of workspace folders (0-N) that are open in the editor. `undefined` when no workspace
     * has been opened.
     *
     * Refer to https://code.visualstudio.com/docs/editor/workspaces for more information
     * on workspaces.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#workspace.workspaceFolders)
     */
    val workspaceFolders: ReadonlyArray<WorkspaceFolder>?

    /**
     * The name of the workspace. `undefined` when no workspace
     * has been opened.
     *
     * Refer to https://code.visualstudio.com/docs/editor/workspaces for more information on
     * the concept of workspaces.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#workspace.name)
     */
    val name: String?

    /**
     * The location of the workspace file, for example:
     *
     * `file:///Users/name/Development/myProject.code-workspace`
     *
     * or
     *
     * `untitled:1555503116870`
     *
     * for a workspace that is untitled and not yet saved.
     *
     * Depending on the workspace that is opened, the value will be:
     *  * `undefined` when no workspace is opened
     *  * the path of the workspace file as `Uri` otherwise. if the workspace
     * is untitled, the returned URI will use the `untitled:` scheme
     *
     * The location can e.g. be used with the `vscode.openFolder` command to
     * open the workspace again after it has been closed.
     *
     * **Example:**
     * ```typescript
     * vscode.commands.executeCommand('vscode.openFolder', uriOfWorkspace);
     * ```
     *
     * Refer to https://code.visualstudio.com/docs/editor/workspaces for more information on
     * the concept of workspaces.
     *
     * **Note:** it is not advised to use `workspace.workspaceFile` to write
     * configuration data into the file. You can use `workspace.getConfiguration().update()`
     * for that purpose which will work both when a single folder is opened as
     * well as an untitled or saved workspace.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#workspace.workspaceFile)
     */
    val workspaceFile: Uri?

    /**
     * An event that is emitted when a workspace folder is added or removed.
     *
     * **Note:** this event will not fire if the first workspace folder is added, removed or changed,
     * because in that case the currently executing extensions (including the one that listens to this
     * event) will be terminated and restarted so that the (deprecated) `rootPath` property is updated
     * to point to the first workspace folder.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#workspace.onDidChangeWorkspaceFolders)
     */
    val onDidChangeWorkspaceFolders: Event<WorkspaceFoldersChangeEvent>

    /**
     * Returns the [workspace folder][WorkspaceFolder] that contains a given uri.
     * * returns `undefined` when the given uri doesn't match any workspace folder
     * * returns the *input* when the given uri is a workspace folder itself
     *
     * @param uri An uri.
     * @returns A workspace folder or `undefined`
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#workspace.getWorkspaceFolder)
     */
    fun getWorkspaceFolder(uri: Uri): WorkspaceFolder?

    /**
     * Returns a path that is relative to the workspace folder or folders.
     *
     * When there are no [workspace folders][workspace.workspaceFolders] or when the path
     * is not contained in them, the input is returned.
     *
     * @param pathOrUri A path or uri. When a uri is given its [fsPath][Uri.fsPath] is used.
     * @param includeWorkspaceFolder When `true` and when the given path is contained inside a
     * workspace folder the name of the workspace is prepended. Defaults to `true` when there are
     * multiple workspace folders and `false` otherwise.
     * @returns A path relative to the root or the input.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#workspace.asRelativePath)
     */
    fun asRelativePath(
        pathOrUri: String,
        includeWorkspaceFolder: Boolean = definedExternally,
    ): String

    fun asRelativePath(
        pathOrUri: Uri,
        includeWorkspaceFolder: Boolean = definedExternally,
    ): String

    /**
     * This method replaces `deleteCount` [workspace folders][workspace.workspaceFolders] starting at index `start`
     * by an optional set of `workspaceFoldersToAdd` on the `vscode.workspace.workspaceFolders` array. This "splice"
     * behavior can be used to add, remove and change workspace folders in a single operation.
     *
     * **Note:** in some cases calling this method may result in the currently executing extensions (including the
     * one that called this method) to be terminated and restarted. For example when the first workspace folder is
     * added, removed or changed the (deprecated) `rootPath` property is updated to point to the first workspace
     * folder. Another case is when transitioning from an empty or single-folder workspace into a multi-folder
     * workspace (see also: https://code.visualstudio.com/docs/editor/workspaces).
     *
     * Use the {@linkcode onDidChangeWorkspaceFolders onDidChangeWorkspaceFolders()} event to get notified when the
     * workspace folders have been updated.
     *
     * **Example:** adding a new workspace folder at the end of workspace folders
     * ```typescript
     * workspace.updateWorkspaceFolders(workspace.workspaceFolders ? workspace.workspaceFolders.length : 0, null, { uri: ...});
     * ```
     *
     * **Example:** removing the first workspace folder
     * ```typescript
     * workspace.updateWorkspaceFolders(0, 1);
     * ```
     *
     * **Example:** replacing an existing workspace folder with a new one
     * ```typescript
     * workspace.updateWorkspaceFolders(0, 1, { uri: ...});
     * ```
     *
     * It is valid to remove an existing workspace folder and add it again with a different name
     * to rename that folder.
     *
     * **Note:** it is not valid to call [updateWorkspaceFolders()][updateWorkspaceFolders] multiple times
     * without waiting for the {@linkcode onDidChangeWorkspaceFolders onDidChangeWorkspaceFolders()} to fire.
     *
     * @param start the zero-based location in the list of currently opened [workspace folders][WorkspaceFolder]
     * from which to start deleting workspace folders.
     * @param deleteCount the optional number of workspace folders to remove.
     * @param workspaceFoldersToAdd the optional variable set of workspace folders to add in place of the deleted ones.
     * Each workspace is identified with a mandatory URI and an optional name.
     * @returns true if the operation was successfully started and false otherwise if arguments were used that would result
     * in invalid workspace folder state (e.g. 2 folders with the same URI).
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#workspace.updateWorkspaceFolders)
     */
    /*
    updateWorkspaceFolders(start: number, deleteCount: number | undefined | null, ...workspaceFoldersToAdd: {
        /**
         * The uri of a workspace folder that's to be added.
         */
        readonly uri: Uri;
        /**
         * The name of a workspace folder that's to be added.
         */
        readonly name?: string;
    }[]): boolean
    */

    /**
     * Creates a file system watcher that is notified on file events (create, change, delete)
     * depending on the parameters provided.
     *
     * By default, all opened [workspace folders][workspace.workspaceFolders] will be watched
     * for file changes recursively.
     *
     * Additional paths can be added for file watching by providing a [RelativePattern] with
     * a `base` path to watch. If the path is a folder and the `pattern` is complex (e.g. contains
     * `**` or path segments), it will be watched recursively and otherwise will be watched
     * non-recursively (i.e. only changes to the first level of the path will be reported).
     *
     * *Note* that paths that do not exist in the file system will be monitored with a delay until
     * created and then watched depending on the parameters provided. If a watched path is deleted,
     * the watcher will suspend and not report any events until the path is created again.
     *
     * If possible, keep the use of recursive watchers to a minimum because recursive file watching
     * is quite resource intense.
     *
     * Providing a `string` as `globPattern` acts as convenience method for watching file events in
     * all opened workspace folders. It cannot be used to add more folders for file watching, nor will
     * it report any file events from folders that are not part of the opened workspace folders.
     *
     * Optionally, flags to ignore certain kinds of events can be provided.
     *
     * To stop listening to events the watcher must be disposed.
     *
     * *Note* that file events from recursive file watchers may be excluded based on user configuration.
     * The setting `files.watcherExclude` helps to reduce the overhead of file events from folders
     * that are known to produce many file changes at once (such as `.git` folders). As such,
     * it is highly recommended to watch with simple patterns that do not require recursive watchers
     * where the exclude settings are ignored and you have full control over the events.
     *
     * *Note* that symbolic links are not automatically followed for file watching unless the path to
     * watch itself is a symbolic link.
     *
     * *Note* that the file paths that are reported for having changed may have a different path casing
     * compared to the actual casing on disk on case-insensitive platforms (typically macOS and Windows
     * but not Linux). We allow a user to open a workspace folder with any desired path casing and try
     * to preserve that. This means:
     * * if the path is within any of the workspace folders, the path will match the casing of the
     *   workspace folder up to that portion of the path and match the casing on disk for children
     * * if the path is outside of any of the workspace folders, the casing will match the case of the
     *   path that was provided for watching
     * In the same way, symbolic links are preserved, i.e. the file event will report the path of the
     * symbolic link as it was provided for watching and not the target.
     *
     * *Note* that file events from deleting a folder may not include events for contained files but
     * only the most top level folder that was deleted. This is a performance optimisation to reduce
     * the overhead of file events being sent. If you need to know about all deleted files, you have
     * to watch with `**` and deal with all file events yourself.
     *
     * ### Examples
     *
     * The basic anatomy of a file watcher is as follows:
     *
     * ```ts
     * const watcher = vscode.workspace.createFileSystemWatcher(new vscode.RelativePattern(<folder>, <pattern>));
     *
     * watcher.onDidChange(uri => { ... }); // listen to files being changed
     * watcher.onDidCreate(uri => { ... }); // listen to files/folders being created
     * watcher.onDidDelete(uri => { ... }); // listen to files/folders getting deleted
     *
     * watcher.dispose(); // dispose after usage
     * ```
     *
     * #### Workspace file watching
     *
     * If you only care about file events in a specific workspace folder:
     *
     * ```ts
     * vscode.workspace.createFileSystemWatcher(new vscode.RelativePattern(vscode.workspace.workspaceFolders[0], '**​/​*.js'));
     * ```
     *
     * If you want to monitor file events across all opened workspace folders:
     *
     * ```ts
     * vscode.workspace.createFileSystemWatcher('**​/​*.js');
     * ```
     *
     * *Note:* the array of workspace folders can be empty if no workspace is opened (empty window).
     *
     * #### Out of workspace file watching
     *
     * To watch a folder for changes to *.js files outside the workspace (non recursively), pass in a `Uri` to such
     * a folder:
     *
     * ```ts
     * vscode.workspace.createFileSystemWatcher(new vscode.RelativePattern(vscode.Uri.file(<path to folder outside workspace>), '*.js'));
     * ```
     *
     * And use a complex glob pattern to watch recursively:
     *
     * ```ts
     * vscode.workspace.createFileSystemWatcher(new vscode.RelativePattern(vscode.Uri.file(<path to folder outside workspace>), '**​/​*.js'));
     * ```
     *
     * Here is an example for watching the active editor for file changes:
     *
     * ```ts
     * vscode.workspace.createFileSystemWatcher(new vscode.RelativePattern(vscode.window.activeTextEditor.document.uri, '*'));
     * ```
     *
     * @param globPattern A [glob pattern][GlobPattern] that controls which file events the watcher should report.
     * @param ignoreCreateEvents Ignore when files have been created.
     * @param ignoreChangeEvents Ignore when files have been changed.
     * @param ignoreDeleteEvents Ignore when files have been deleted.
     * @returns A new file system watcher instance. Must be disposed when no longer needed.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#workspace.createFileSystemWatcher)
     */
    fun createFileSystemWatcher(
        globPattern: GlobPattern,
        ignoreCreateEvents: Boolean = definedExternally,
        ignoreChangeEvents: Boolean = definedExternally,
        ignoreDeleteEvents: Boolean = definedExternally,
    ): FileSystemWatcher

    /**
     * Find files across all [workspace folders][workspace.workspaceFolders] in the workspace.
     *
     * @example
     * findFiles('**​/​*.js', '**​/node_modules/​**', 10)
     *
     * @param include A [glob pattern][GlobPattern] that defines the files to search for. The glob pattern
     * will be matched against the file paths of resulting matches relative to their workspace. Use a [relative pattern][RelativePattern]
     * to restrict the search results to a [workspace folder][WorkspaceFolder].
     * @param exclude  A [glob pattern][GlobPattern] that defines files and folders to exclude. The glob pattern
     * will be matched against the file paths of resulting matches relative to their workspace. When `undefined`, default file-excludes (e.g. the `files.exclude`-setting
     * but not `search.exclude`) will apply. When `null`, no excludes will apply.
     * @param maxResults An upper-bound for the result.
     * @param token A token that can be used to signal cancellation to the underlying search engine.
     * @returns A thenable that resolves to an array of resource identifiers. Will return no results if no
     * [workspace folders][workspace.workspaceFolders] are opened.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#workspace.findFiles)
     */
    @JsName("findFiles")
    fun findFilesAsync(
        include: GlobPattern,
        exclude: GlobPattern? = definedExternally,
        maxResults: Int = definedExternally,
        token: CancellationToken = definedExternally,
    ): PromiseLike<ReadonlyArray<Uri>>

    /**
     * Saves the editor identified by the given resource and returns the resulting resource or `undefined`
     * if save was not successful or no editor with the given resource was found.
     *
     * **Note** that an editor with the provided resource must be opened in order to be saved.
     *
     * @param uri the associated uri for the opened editor to save.
     * @returns A thenable that resolves when the save operation has finished.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#workspace.save)
     */
    @JsName("save")
    fun saveAsync(uri: Uri): PromiseLike<Uri?>

    /**
     * Saves the editor identified by the given resource to a new file name as provided by the user and
     * returns the resulting resource or `undefined` if save was not successful or cancelled or no editor
     * with the given resource was found.
     *
     * **Note** that an editor with the provided resource must be opened in order to be saved as.
     *
     * @param uri the associated uri for the opened editor to save as.
     * @returns A thenable that resolves when the save-as operation has finished.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#workspace.saveAs)
     */
    @JsName("saveAs")
    fun saveAsAsync(uri: Uri): PromiseLike<Uri?>

    /**
     * Save all dirty files.
     *
     * @param includeUntitled Also save files that have been created during this session.
     * @returns A thenable that resolves when the files have been saved. Will return `false`
     * for any file that failed to save.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#workspace.saveAll)
     */
    @JsName("saveAll")
    fun saveAllAsync(includeUntitled: Boolean = definedExternally): PromiseLike<JsBoolean>

    /**
     * Make changes to one or many resources or create, delete, and rename resources as defined by the given
     * [workspace edit][WorkspaceEdit].
     *
     * All changes of a workspace edit are applied in the same order in which they have been added. If
     * multiple textual inserts are made at the same position, these strings appear in the resulting text
     * in the order the 'inserts' were made, unless that are interleaved with resource edits. Invalid sequences
     * like 'delete file a' -> 'insert text in file a' cause failure of the operation.
     *
     * When applying a workspace edit that consists only of text edits an 'all-or-nothing'-strategy is used.
     * A workspace edit with resource creations or deletions aborts the operation, e.g. consecutive edits will
     * not be attempted, when a single edit fails.
     *
     * @param edit A workspace edit.
     * @param metadata Optional [metadata][WorkspaceEditMetadata] for the edit.
     * @returns A thenable that resolves when the edit could be applied.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#workspace.applyEdit)
     */
    @JsName("applyEdit")
    fun applyEditAsync(
        edit: WorkspaceEdit,
        metadata: WorkspaceEditMetadata = definedExternally,
    ): PromiseLike<JsBoolean>

    /**
     * All text documents currently known to the editor.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#workspace.textDocuments)
     */
    val textDocuments: ReadonlyArray<TextDocument>

    /**
     * Opens a document. Will return early if this document is already open. Otherwise
     * the document is loaded and the [didOpen][workspace.onDidOpenTextDocument]-event fires.
     *
     * The document is denoted by an [Uri]. Depending on the [scheme][Uri.scheme] the
     * following rules apply:
     * * `file`-scheme: Open a file on disk (`openTextDocument(Uri.file(path))`). Will be rejected if the file
     * does not exist or cannot be loaded.
     * * `untitled`-scheme: Open a blank untitled file with associated path (`openTextDocument(Uri.file(path).with({ scheme: 'untitled' }))`).
     * The language will be derived from the file name.
     * * For all other schemes contributed [text document content providers][TextDocumentContentProvider] and
     * [file system providers][FileSystemProvider] are consulted.
     *
     * *Note* that the lifecycle of the returned document is owned by the editor and not by the extension. That means an
     * {@linkcode workspace.onDidCloseTextDocument onDidClose}-event can occur at any time after opening it.
     *
     * @param uri Identifies the resource to open.
     * @returns A promise that resolves to a [document][TextDocument].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#workspace.openTextDocument)
     */
    /*
    openTextDocument(uri: Uri, options?: {
        /**
         * The {@link TextDocument.encoding encoding} of the document to use
         * for decoding the underlying buffer to text. If omitted, the encoding
         * will be guessed based on the file content and/or the editor settings
         * unless the document is already opened.
         *
         * Opening a text document that was already opened with a different encoding
         * has the potential of changing the text contents of the text document.
         * Specifically, when the encoding results in a different set of characters
         * than the previous encoding. As such, an error is thrown for dirty documents
         * when the specified encoding is different from the encoding of the document.
         *
         * See {@link TextDocument.encoding} for more information about valid
         * values for encoding. Using an unsupported encoding will fallback to the
         * default encoding for the document.
         *
         * *Note* that if you open a document with an encoding that does not
         * support decoding the underlying bytes, content may be replaced with
         * substitution characters as appropriate.
         */
        readonly encoding?: string;
    }): Thenable<TextDocument>
    */

    /**
     * A short-hand for `openTextDocument(Uri.file(path))`.
     *
     * @see [workspace.openTextDocument]
     * @param path A path of a file on disk.
     * @returns A promise that resolves to a [document][TextDocument].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#workspace.openTextDocument)
     */
    /*
    openTextDocument(path: string, options?: {
        /**
         * The {@link TextDocument.encoding encoding} of the document to use
         * for decoding the underlying buffer to text. If omitted, the encoding
         * will be guessed based on the file content and/or the editor settings
         * unless the document is already opened.
         *
         * Opening a text document that was already opened with a different encoding
         * has the potential of changing the text contents of the text document.
         * Specifically, when the encoding results in a different set of characters
         * than the previous encoding. As such, an error is thrown for dirty documents
         * when the specified encoding is different from the encoding of the document.
         *
         * See {@link TextDocument.encoding} for more information about valid
         * values for encoding. Using an unsupported encoding will fallback to the
         * default encoding for the document.
         *
         * *Note* that if you open a document with an encoding that does not
         * support decoding the underlying bytes, content may be replaced with
         * substitution characters as appropriate.
         */
        readonly encoding?: string;
    }): Thenable<TextDocument>
    */

    /**
     * Opens an untitled text document. The editor will prompt the user for a file
     * path when the document is to be saved. The `options` parameter allows to
     * specify the *language* and/or the *content* of the document.
     *
     * @param options Options to control how the document will be created.
     * @returns A promise that resolves to a [document][TextDocument].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#workspace.openTextDocument)
     */
    /*
    openTextDocument(options?: {
        /**
         * The {@link TextDocument.languageId language} of the document.
         */
        language?: string;
        /**
         * The initial contents of the document.
         */
        content?: string;
        /**
         * The {@link TextDocument.encoding encoding} of the document.
         *
         * See {@link TextDocument.encoding} for more information about valid
         * values for encoding. Using an unsupported encoding will fallback to the
         * default encoding for the document.
         */
        readonly encoding?: string;
    }): Thenable<TextDocument>
    */

    /**
     * Register a text document content provider.
     *
     * Only one provider can be registered per scheme.
     *
     * @param scheme The uri-scheme to register for.
     * @param provider A content provider.
     * @returns A [Disposable] that unregisters this provider when being disposed.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#workspace.registerTextDocumentContentProvider)
     */
    fun registerTextDocumentContentProvider(
        scheme: String,
        provider: TextDocumentContentProvider,
    ): Disposable

    /**
     * An event that is emitted when a [text document][TextDocument] is opened or when the language id
     * of a text document [has been changed][languages.setTextDocumentLanguage].
     *
     * To add an event listener when a visible text document is opened, use the [TextEditor] events in the
     * [window] namespace. Note that:
     *
     * - The event is emitted before the [document][TextDocument] is updated in the
     * [active text editor][window.activeTextEditor]
     * - When a [text document} is already open (e.g.: open in another {@link window.visibleTextEditors visible text editor][TextDocument]) this event is not emitted
     *
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#workspace.onDidOpenTextDocument)
     */
    val onDidOpenTextDocument: Event<TextDocument>

    /**
     * An event that is emitted when a [text document][TextDocument] is disposed or when the language id
     * of a text document [has been changed][languages.setTextDocumentLanguage].
     *
     * *Note 1:* There is no guarantee that this event fires when an editor tab is closed, use the
     * {@linkcode window.onDidChangeVisibleTextEditors onDidChangeVisibleTextEditors}-event to know when editors change.
     *
     * *Note 2:* A document can be open but not shown in an editor which means this event can fire
     * for a document that has not been shown in an editor.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#workspace.onDidCloseTextDocument)
     */
    val onDidCloseTextDocument: Event<TextDocument>

    /**
     * An event that is emitted when a [text document][TextDocument] is changed. This usually happens
     * when the [contents][TextDocument.getText] changes but also when other things like the
     * [dirty][TextDocument.isDirty]-state changes.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#workspace.onDidChangeTextDocument)
     */
    val onDidChangeTextDocument: Event<TextDocumentChangeEvent>

    /**
     * An event that is emitted when a [text document][TextDocument] will be saved to disk.
     *
     * *Note 1:* Subscribers can delay saving by registering asynchronous work. For the sake of data integrity the editor
     * might save without firing this event. For instance when shutting down with dirty files.
     *
     * *Note 2:* Subscribers are called sequentially and they can [delay][TextDocumentWillSaveEvent.waitUntil] saving
     * by registering asynchronous work. Protection against misbehaving listeners is implemented as such:
     *  * there is an overall time budget that all listeners share and if that is exhausted no further listener is called
     *  * listeners that take a long time or produce errors frequently will not be called anymore
     *
     * The current thresholds are 1.5 seconds as overall time budget and a listener can misbehave 3 times before being ignored.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#workspace.onWillSaveTextDocument)
     */
    val onWillSaveTextDocument: Event<TextDocumentWillSaveEvent>

    /**
     * An event that is emitted when a [text document][TextDocument] is saved to disk.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#workspace.onDidSaveTextDocument)
     */
    val onDidSaveTextDocument: Event<TextDocument>

    /**
     * All notebook documents currently known to the editor.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#workspace.notebookDocuments)
     */
    val notebookDocuments: ReadonlyArray<NotebookDocument>

    /**
     * Open a notebook. Will return early if this notebook is already [loaded][notebookDocuments]. Otherwise
     * the notebook is loaded and the {@linkcode onDidOpenNotebookDocument}-event fires.
     *
     * *Note* that the lifecycle of the returned notebook is owned by the editor and not by the extension. That means an
     * {@linkcode onDidCloseNotebookDocument}-event can occur at any time after.
     *
     * *Note* that opening a notebook does not show a notebook editor. This function only returns a notebook document which
     * can be shown in a notebook editor but it can also be used for other things.
     *
     * @param uri The resource to open.
     * @returns A promise that resolves to a [notebook][NotebookDocument]
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#workspace.openNotebookDocument)
     */
    @JsName("openNotebookDocument")
    fun openNotebookDocumentAsync(uri: Uri): PromiseLike<NotebookDocument>

    /**
     * Open an untitled notebook. The editor will prompt the user for a file
     * path when the document is to be saved.
     *
     * @see [workspace.openNotebookDocument]
     * @param notebookType The notebook type that should be used.
     * @param content The initial contents of the notebook.
     * @returns A promise that resolves to a [notebook][NotebookDocument].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#workspace.openNotebookDocument)
     */
    @JsName("openNotebookDocument")
    fun openNotebookDocumentAsync(
        notebookType: String,
        content: NotebookData = definedExternally,
    ): PromiseLike<NotebookDocument>

    /**
     * An event that is emitted when a [notebook][NotebookDocument] has changed.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#workspace.onDidChangeNotebookDocument)
     */
    val onDidChangeNotebookDocument: Event<NotebookDocumentChangeEvent>

    /**
     * An event that is emitted when a [notebook document][NotebookDocument] will be saved to disk.
     *
     * *Note 1:* Subscribers can delay saving by registering asynchronous work. For the sake of data integrity the editor
     * might save without firing this event. For instance when shutting down with dirty files.
     *
     * *Note 2:* Subscribers are called sequentially and they can [delay][NotebookDocumentWillSaveEvent.waitUntil] saving
     * by registering asynchronous work. Protection against misbehaving listeners is implemented as such:
     *  * there is an overall time budget that all listeners share and if that is exhausted no further listener is called
     *  * listeners that take a long time or produce errors frequently will not be called anymore
     *
     * The current thresholds are 1.5 seconds as overall time budget and a listener can misbehave 3 times before being ignored.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#workspace.onWillSaveNotebookDocument)
     */
    val onWillSaveNotebookDocument: Event<NotebookDocumentWillSaveEvent>

    /**
     * An event that is emitted when a [notebook][NotebookDocument] is saved.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#workspace.onDidSaveNotebookDocument)
     */
    val onDidSaveNotebookDocument: Event<NotebookDocument>

    /**
     * Register a [notebook serializer][NotebookSerializer].
     *
     * A notebook serializer must be contributed through the `notebooks` extension point. When opening a notebook file, the editor will send
     * the `onNotebook:<notebookType>` activation event, and extensions must register their serializer in return.
     *
     * @param notebookType A notebook.
     * @param serializer A notebook serializer.
     * @param options Optional context options that define what parts of a notebook should be persisted
     * @returns A [Disposable] that unregisters this serializer when being disposed.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#workspace.registerNotebookSerializer)
     */
    fun registerNotebookSerializer(
        notebookType: String,
        serializer: NotebookSerializer,
        options: NotebookDocumentContentOptions = definedExternally,
    ): Disposable

    /**
     * An event that is emitted when a [notebook][NotebookDocument] is opened.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#workspace.onDidOpenNotebookDocument)
     */
    val onDidOpenNotebookDocument: Event<NotebookDocument>

    /**
     * An event that is emitted when a [notebook][NotebookDocument] is disposed.
     *
     * *Note 1:* There is no guarantee that this event fires when an editor tab is closed.
     *
     * *Note 2:* A notebook can be open but not shown in an editor which means this event can fire
     * for a notebook that has not been shown in an editor.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#workspace.onDidCloseNotebookDocument)
     */
    val onDidCloseNotebookDocument: Event<NotebookDocument>

    /**
     * An event that is emitted when files are being created.
     *
     * *Note 1:* This event is triggered by user gestures, like creating a file from the
     * explorer, or from the {@linkcode workspace.applyEdit}-api. This event is *not* fired when
     * files change on disk, e.g triggered by another application, or when using the
     * {@linkcode FileSystem workspace.fs}-api.
     *
     * *Note 2:* When this event is fired, edits to files that are are being created cannot be applied.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#workspace.onWillCreateFiles)
     */
    val onWillCreateFiles: Event<FileWillCreateEvent>

    /**
     * An event that is emitted when files have been created.
     *
     * *Note:* This event is triggered by user gestures, like creating a file from the
     * explorer, or from the {@linkcode workspace.applyEdit}-api, but this event is *not* fired when
     * files change on disk, e.g triggered by another application, or when using the
     * {@linkcode FileSystem workspace.fs}-api.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#workspace.onDidCreateFiles)
     */
    val onDidCreateFiles: Event<FileCreateEvent>

    /**
     * An event that is emitted when files are being deleted.
     *
     * *Note 1:* This event is triggered by user gestures, like deleting a file from the
     * explorer, or from the {@linkcode workspace.applyEdit}-api, but this event is *not* fired when
     * files change on disk, e.g triggered by another application, or when using the
     * {@linkcode FileSystem workspace.fs}-api.
     *
     * *Note 2:* When deleting a folder with children only one event is fired.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#workspace.onWillDeleteFiles)
     */
    val onWillDeleteFiles: Event<FileWillDeleteEvent>

    /**
     * An event that is emitted when files have been deleted.
     *
     * *Note 1:* This event is triggered by user gestures, like deleting a file from the
     * explorer, or from the {@linkcode workspace.applyEdit}-api, but this event is *not* fired when
     * files change on disk, e.g triggered by another application, or when using the
     * {@linkcode FileSystem workspace.fs}-api.
     *
     * *Note 2:* When deleting a folder with children only one event is fired.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#workspace.onDidDeleteFiles)
     */
    val onDidDeleteFiles: Event<FileDeleteEvent>

    /**
     * An event that is emitted when files are being renamed.
     *
     * *Note 1:* This event is triggered by user gestures, like renaming a file from the
     * explorer, and from the {@linkcode workspace.applyEdit}-api, but this event is *not* fired when
     * files change on disk, e.g triggered by another application, or when using the
     * {@linkcode FileSystem workspace.fs}-api.
     *
     * *Note 2:* When renaming a folder with children only one event is fired.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#workspace.onWillRenameFiles)
     */
    val onWillRenameFiles: Event<FileWillRenameEvent>

    /**
     * An event that is emitted when files have been renamed.
     *
     * *Note 1:* This event is triggered by user gestures, like renaming a file from the
     * explorer, and from the {@linkcode workspace.applyEdit}-api, but this event is *not* fired when
     * files change on disk, e.g triggered by another application, or when using the
     * {@linkcode FileSystem workspace.fs}-api.
     *
     * *Note 2:* When renaming a folder with children only one event is fired.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#workspace.onDidRenameFiles)
     */
    val onDidRenameFiles: Event<FileRenameEvent>

    /**
     * Get a workspace configuration object.
     *
     * When a section-identifier is provided only that part of the configuration
     * is returned. Dots in the section-identifier are interpreted as child-access,
     * like `{ myExt: { setting: { doIt: true }}}` and `getConfiguration('myExt.setting').get('doIt') === true`.
     *
     * When a scope is provided configuration confined to that scope is returned. Scope can be a resource or a language identifier or both.
     *
     * @param section A dot-separated identifier.
     * @param scope A scope for which the configuration is asked for.
     * @returns The full configuration or a subset.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#workspace.getConfiguration)
     */
    fun getConfiguration(
        section: String = definedExternally,
        scope: ConfigurationScope? = definedExternally,
    ): WorkspaceConfiguration

    /**
     * An event that is emitted when the [configuration][WorkspaceConfiguration] changed.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#workspace.onDidChangeConfiguration)
     */
    val onDidChangeConfiguration: Event<ConfigurationChangeEvent>

    /**
     * Register a filesystem provider for a given scheme, e.g. `ftp`.
     *
     * There can only be one provider per scheme and an error is being thrown when a scheme
     * has been claimed by another provider or when it is reserved.
     *
     * @param scheme The uri-[scheme][Uri.scheme] the provider registers for.
     * @param provider The filesystem provider.
     * @param options Immutable metadata about the provider.
     * @returns A [Disposable] that unregisters this provider when being disposed.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#workspace.registerFileSystemProvider)
     */
    /*
    registerFileSystemProvider(scheme: string, provider: FileSystemProvider, options?: {
        /**
         * Whether the file system provider use case sensitive compare for {@link Uri.path paths}
         */
        readonly isCaseSensitive?: boolean;
        /**
         * Whether the file system provider is readonly, no modifications like write, delete, create are possible.
         * If a {@link MarkdownString} is given, it will be shown as the reason why the file system is readonly.
         */
        readonly isReadonly?: boolean | MarkdownString;
    }): Disposable
    */

    /**
     * When true, the user has explicitly trusted the contents of the workspace.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#workspace.isTrusted)
     */
    val isTrusted: Boolean

    /**
     * Event that fires when the current workspace has been trusted.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#workspace.onDidGrantWorkspaceTrust)
     */
    val onDidGrantWorkspaceTrust: Event<Void>

    /**
     * Decodes the content from a `Uint8Array` to a `string`. You MUST
     * provide the entire content at once to ensure that the encoding
     * can properly apply. Do not use this method to decode content
     * in chunks, as that may lead to incorrect results.
     *
     * Will pick an encoding based on settings and the content of the
     * buffer (for example byte order marks).
     *
     * *Note* that if you decode content that is unsupported by the
     * encoding, the result may contain substitution characters as
     * appropriate.
     *
     * @throws This method will throw an error when the content is binary.
     *
     * @param content The text content to decode as a `Uint8Array`.
     * @returns A thenable that resolves to the decoded `string`.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#workspace.decode)
     */
    @JsName("decode")
    fun decodeAsync(content: Uint8Array<*>): PromiseLike<JsString>

    /**
     * Decodes the content from a `Uint8Array` to a `string` using the
     * provided encoding. You MUST provide the entire content at once
     * to ensure that the encoding can properly apply. Do not use this
     * method to decode content in chunks, as that may lead to incorrect
     * results.
     *
     * *Note* that if you decode content that is unsupported by the
     * encoding, the result may contain substitution characters as
     * appropriate.
     *
     * @throws This method will throw an error when the content is binary.
     *
     * @param content The text content to decode as a `Uint8Array`.
     * @param options Additional context for picking the encoding.
     * @returns A thenable that resolves to the decoded `string`.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#workspace.decode)
     */
    /*
    decode(content: Uint8Array, options: {
        /**
         * Allows to explicitly pick the encoding to use.
         * See {@link TextDocument.encoding} for more information
         * about valid values for encoding.
         * Using an unsupported encoding will fallback to the
         * default configured encoding.
         */
        readonly encoding: string;
    }): Thenable<string>
    */

    /**
     * Decodes the content from a `Uint8Array` to a `string`. You MUST
     * provide the entire content at once to ensure that the encoding
     * can properly apply. Do not use this method to decode content
     * in chunks, as that may lead to incorrect results.
     *
     * The encoding is picked based on settings and the content
     * of the buffer (for example byte order marks).
     *
     * *Note* that if you decode content that is unsupported by the
     * encoding, the result may contain substitution characters as
     * appropriate.
     *
     * @throws This method will throw an error when the content is binary.
     *
     * @param content The content to decode as a `Uint8Array`.
     * @param options Additional context for picking the encoding.
     * @returns A thenable that resolves to the decoded `string`.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#workspace.decode)
     */
    /*
    decode(content: Uint8Array, options: {
        /**
         * The URI that represents the file if known. This information
         * is used to figure out the encoding related configuration
         * for the file if any.
         */
        readonly uri: Uri;
    }): Thenable<string>
    */

    /**
     * Encodes the content of a `string` to a `Uint8Array`.
     *
     * Will pick an encoding based on settings.
     *
     * @param content The content to decode as a `string`.
     * @returns A thenable that resolves to the encoded `Uint8Array`.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#workspace.encode)
     */
    @JsName("encode")
    fun encodeAsync(content: String): PromiseLike<Uint8Array<*>>

    /**
     * Encodes the content of a `string` to a `Uint8Array` using the
     * provided encoding.
     *
     * @param content The content to decode as a `string`.
     * @param options Additional context for picking the encoding.
     * @returns A thenable that resolves to the encoded `Uint8Array`.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#workspace.encode)
     */
    /*
    encode(content: string, options: {
        /**
         * Allows to explicitly pick the encoding to use.
         * See {@link TextDocument.encoding} for more information
         * about valid values for encoding.
         * Using an unsupported encoding will fallback to the
         * default configured encoding.
         */
        readonly encoding: string;
    }): Thenable<Uint8Array>
    */

    /**
     * Encodes the content of a `string` to a `Uint8Array`.
     *
     * The encoding is picked based on settings.
     *
     * @param content The content to decode as a `string`.
     * @param options Additional context for picking the encoding.
     * @returns A thenable that resolves to the encoded `Uint8Array`.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#workspace.encode)
     */
    /*
    encode(content: string, options: {
        /**
         * The URI that represents the file if known. This information
         * is used to figure out the encoding related configuration
         * for the file if any.
         */
        readonly uri: Uri;
    }): Thenable<Uint8Array>
    */
}
