// Automatically generated - do not modify!

@file:JsModule("vscode")

package vscode

import js.array.ReadonlyArray
import js.core.JsAny
import js.core.JsString
import js.promise.PromiseLike
import vscode.window.createStatusBarItem
import vscode.window.showInformationMessage
import kotlin.js.JsModule
import kotlin.js.definedExternally

/**
 * Namespace for dealing with the current window of the editor. That is visible
 * and active editors, as well as, UI elements to show messages, selections, and
 * asking for user input.
 */
external object window {
    /**
     * Represents the grid widget within the main editor area
     */
    val tabGroups: TabGroups

    /**
     * The currently active editor or `undefined`. The active editor is the one
     * that currently has focus or, when none has focus, the one that has changed
     * input most recently.
     */
    var activeTextEditor: TextEditor?

    /**
     * The currently visible editors or an empty array.
     */
    var visibleTextEditors: ReadonlyArray<TextEditor>

    /**
     * An [Event] which fires when the [active editor][window.activeTextEditor]
     * has changed. *Note* that the event also fires when the active editor changes
     * to `undefined`.
     */
    val onDidChangeActiveTextEditor: Event<TextEditor?>

    /**
     * An [Event] which fires when the array of [visible editors][window.visibleTextEditors]
     * has changed.
     */
    val onDidChangeVisibleTextEditors: Event<ReadonlyArray<TextEditor>>

    /**
     * An [Event] which fires when the selection in an editor has changed.
     */
    val onDidChangeTextEditorSelection: Event<TextEditorSelectionChangeEvent>

    /**
     * An [Event] which fires when the visible ranges of an editor has changed.
     */
    val onDidChangeTextEditorVisibleRanges: Event<TextEditorVisibleRangesChangeEvent>

    /**
     * An [Event] which fires when the options of an editor have changed.
     */
    val onDidChangeTextEditorOptions: Event<TextEditorOptionsChangeEvent>

    /**
     * An [Event] which fires when the view column of an editor has changed.
     */
    val onDidChangeTextEditorViewColumn: Event<TextEditorViewColumnChangeEvent>

    /**
     * The currently visible [notebook editors][NotebookEditor] or an empty array.
     */
    val visibleNotebookEditors: ReadonlyArray<NotebookEditor>

    /**
     * An [Event] which fires when the [visible notebook editors][window.visibleNotebookEditors]
     * has changed.
     */
    val onDidChangeVisibleNotebookEditors: Event<ReadonlyArray<NotebookEditor>>

    /**
     * The currently active [notebook editor][NotebookEditor] or `undefined`. The active editor is the one
     * that currently has focus or, when none has focus, the one that has changed
     * input most recently.
     */
    val activeNotebookEditor: NotebookEditor?

    /**
     * An [Event] which fires when the [active notebook editor][window.activeNotebookEditor]
     * has changed. *Note* that the event also fires when the active editor changes
     * to `undefined`.
     */
    val onDidChangeActiveNotebookEditor: Event<NotebookEditor?>

    /**
     * An [Event] which fires when the [notebook editor selections][NotebookEditor.selections]
     * have changed.
     */
    val onDidChangeNotebookEditorSelection: Event<NotebookEditorSelectionChangeEvent>

    /**
     * An [Event] which fires when the [notebook editor visible ranges][NotebookEditor.visibleRanges]
     * have changed.
     */
    val onDidChangeNotebookEditorVisibleRanges: Event<NotebookEditorVisibleRangesChangeEvent>

    /**
     * The currently opened terminals or an empty array.
     */
    val terminals: ReadonlyArray<Terminal>

    /**
     * The currently active terminal or `undefined`. The active terminal is the one that
     * currently has focus or most recently had focus.
     */
    val activeTerminal: Terminal?

    /**
     * An [Event] which fires when the [active terminal][window.activeTerminal]
     * has changed. *Note* that the event also fires when the active terminal changes
     * to `undefined`.
     */
    val onDidChangeActiveTerminal: Event<Terminal?>

    /**
     * An [Event] which fires when a terminal has been created, either through the
     * [createTerminal][window.createTerminal] API or commands.
     */
    val onDidOpenTerminal: Event<Terminal>

    /**
     * An [Event] which fires when a terminal is disposed.
     */
    val onDidCloseTerminal: Event<Terminal>

    /**
     * An [Event] which fires when a [terminal's state][Terminal.state] has changed.
     */
    val onDidChangeTerminalState: Event<Terminal>

    /**
     * Fires when shell integration activates or one of its properties changes in a terminal.
     */
    val onDidChangeTerminalShellIntegration: Event<TerminalShellIntegrationChangeEvent>

    /**
     * This will be fired when a terminal command is started. This event will fire only when
     * [shell integration](https://code.visualstudio.com/docs/terminal/shell-integration) is
     * activated for the terminal.
     */
    val onDidStartTerminalShellExecution: Event<TerminalShellExecutionStartEvent>

    /**
     * This will be fired when a terminal command is ended. This event will fire only when
     * [shell integration](https://code.visualstudio.com/docs/terminal/shell-integration) is
     * activated for the terminal.
     */
    val onDidEndTerminalShellExecution: Event<TerminalShellExecutionEndEvent>

    /**
     * Represents the current window's state.
     */
    val state: WindowState

    /**
     * An [Event] which fires when the focus or activity state of the current window
     * changes. The value of the event represents whether the window is focused.
     */
    val onDidChangeWindowState: Event<WindowState>

    /**
     * Show the given document in a text editor. A [column][ViewColumn] can be provided
     * to control where the editor is being shown. Might change the [active editor][window.activeTextEditor].
     *
     * @param document A text document to be shown.
     * @param column A view column in which the [editor} should be shown. The default is the {@link ViewColumn.Active active][TextEditor].
     * Columns that do not exist will be created as needed up to the maximum of {@linkcode ViewColumn.Nine}. Use {@linkcode ViewColumn.Beside}
     * to open the editor to the side of the currently active one.
     * @param preserveFocus When `true` the editor will not take focus.
     * @returns A promise that resolves to an [editor][TextEditor].
     */
    fun showTextDocument(
        document: TextDocument,
        column: ViewColumn = definedExternally,
        preserveFocus: Boolean = definedExternally,
    ): PromiseLike<TextEditor>

    /**
     * Show the given document in a text editor. [Options][TextDocumentShowOptions] can be provided
     * to control options of the editor is being shown. Might change the [active editor][window.activeTextEditor].
     *
     * @param document A text document to be shown.
     * @param options [Editor options} to configure the behavior of showing the {@link TextEditor editor][TextDocumentShowOptions].
     * @returns A promise that resolves to an [editor][TextEditor].
     */
    fun showTextDocument(
        document: TextDocument,
        options: TextDocumentShowOptions = definedExternally,
    ): PromiseLike<TextEditor>

    /**
     * A short-hand for `openTextDocument(uri).then(document => showTextDocument(document, options))`.
     *
     * @see [workspace.openTextDocument]
     *
     * @param uri A resource identifier.
     * @param options [Editor options} to configure the behavior of showing the {@link TextEditor editor][TextDocumentShowOptions].
     * @returns A promise that resolves to an [editor][TextEditor].
     */
    fun showTextDocument(
        uri: Uri,
        options: TextDocumentShowOptions = definedExternally,
    ): PromiseLike<TextEditor>

    /**
     * Show the given [NotebookDocument] in a [notebook editor][NotebookEditor].
     *
     * @param document A text document to be shown.
     * @param options [Editor options} to configure the behavior of showing the {@link NotebookEditor notebook editor][NotebookDocumentShowOptions].
     *
     * @returns A promise that resolves to an [notebook editor][NotebookEditor].
     */
    fun showNotebookDocument(
        document: NotebookDocument,
        options: NotebookDocumentShowOptions = definedExternally,
    ): PromiseLike<NotebookEditor>

    /**
     * Create a TextEditorDecorationType that can be used to add decorations to text editors.
     *
     * @param options Rendering options for the decoration type.
     * @returns A new decoration type instance.
     */
    fun createTextEditorDecorationType(options: DecorationRenderOptions): TextEditorDecorationType

    /**
     * Show an information message to users. Optionally provide an array of items which will be presented as
     * clickable buttons.
     *
     * @param message The message to show.
     * @param items A set of items that will be rendered as actions in the message.
     * @returns A thenable that resolves to the selected item or `undefined` when being dismissed.
     */
    fun showInformationMessage(
        message: String,
        vararg items: String,
    ): PromiseLike<JsString?>

    /**
     * Show an information message to users. Optionally provide an array of items which will be presented as
     * clickable buttons.
     *
     * @param message The message to show.
     * @param options Configures the behaviour of the message.
     * @param items A set of items that will be rendered as actions in the message.
     * @returns A thenable that resolves to the selected item or `undefined` when being dismissed.
     */
    fun showInformationMessage(
        message: String,
        options: MessageOptions,
        vararg items: String,
    ): PromiseLike<JsString?>

    /**
     * Show an information message.
     *
     * @see [showInformationMessage][window.showInformationMessage]
     *
     * @param message The message to show.
     * @param items A set of items that will be rendered as actions in the message.
     * @returns A thenable that resolves to the selected item or `undefined` when being dismissed.
     */
    fun <T : MessageItem> showInformationMessage(
        message: String,
        vararg items: T,
    ): PromiseLike<T?>

    /**
     * Show an information message.
     *
     * @see [showInformationMessage][window.showInformationMessage]
     *
     * @param message The message to show.
     * @param options Configures the behaviour of the message.
     * @param items A set of items that will be rendered as actions in the message.
     * @returns A thenable that resolves to the selected item or `undefined` when being dismissed.
     */
    fun <T : MessageItem> showInformationMessage(
        message: String,
        options: MessageOptions,
        vararg items: T,
    ): PromiseLike<T?>

    /**
     * Show a warning message.
     *
     * @see [showInformationMessage][window.showInformationMessage]
     *
     * @param message The message to show.
     * @param items A set of items that will be rendered as actions in the message.
     * @returns A thenable that resolves to the selected item or `undefined` when being dismissed.
     */
    fun showWarningMessage(
        message: String,
        vararg items: String,
    ): PromiseLike<JsString?>

    /**
     * Show a warning message.
     *
     * @see [showInformationMessage][window.showInformationMessage]
     *
     * @param message The message to show.
     * @param options Configures the behaviour of the message.
     * @param items A set of items that will be rendered as actions in the message.
     * @returns A thenable that resolves to the selected item or `undefined` when being dismissed.
     */
    fun showWarningMessage(
        message: String,
        options: MessageOptions,
        vararg items: String,
    ): PromiseLike<JsString?>

    /**
     * Show a warning message.
     *
     * @see [showInformationMessage][window.showInformationMessage]
     *
     * @param message The message to show.
     * @param items A set of items that will be rendered as actions in the message.
     * @returns A thenable that resolves to the selected item or `undefined` when being dismissed.
     */
    fun <T : MessageItem> showWarningMessage(
        message: String,
        vararg items: T,
    ): PromiseLike<T?>

    /**
     * Show a warning message.
     *
     * @see [showInformationMessage][window.showInformationMessage]
     *
     * @param message The message to show.
     * @param options Configures the behaviour of the message.
     * @param items A set of items that will be rendered as actions in the message.
     * @returns A thenable that resolves to the selected item or `undefined` when being dismissed.
     */
    fun <T : MessageItem> showWarningMessage(
        message: String,
        options: MessageOptions,
        vararg items: T,
    ): PromiseLike<T?>

    /**
     * Show an error message.
     *
     * @see [showInformationMessage][window.showInformationMessage]
     *
     * @param message The message to show.
     * @param items A set of items that will be rendered as actions in the message.
     * @returns A thenable that resolves to the selected item or `undefined` when being dismissed.
     */
    fun showErrorMessage(
        message: String,
        vararg items: String,
    ): PromiseLike<JsString?>

    /**
     * Show an error message.
     *
     * @see [showInformationMessage][window.showInformationMessage]
     *
     * @param message The message to show.
     * @param options Configures the behaviour of the message.
     * @param items A set of items that will be rendered as actions in the message.
     * @returns A thenable that resolves to the selected item or `undefined` when being dismissed.
     */
    fun showErrorMessage(
        message: String,
        options: MessageOptions,
        vararg items: String,
    ): PromiseLike<JsString?>

    /**
     * Show an error message.
     *
     * @see [showInformationMessage][window.showInformationMessage]
     *
     * @param message The message to show.
     * @param items A set of items that will be rendered as actions in the message.
     * @returns A thenable that resolves to the selected item or `undefined` when being dismissed.
     */
    fun <T : MessageItem> showErrorMessage(
        message: String,
        vararg items: T,
    ): PromiseLike<T?>

    /**
     * Show an error message.
     *
     * @see [showInformationMessage][window.showInformationMessage]
     *
     * @param message The message to show.
     * @param options Configures the behaviour of the message.
     * @param items A set of items that will be rendered as actions in the message.
     * @returns A thenable that resolves to the selected item or `undefined` when being dismissed.
     */
    fun <T : MessageItem> showErrorMessage(
        message: String,
        options: MessageOptions,
        vararg items: T,
    ): PromiseLike<T?>

    /**
     * Shows a selection list allowing multiple selections.
     *
     * @param items An array of strings, or a promise that resolves to an array of strings.
     * @param options Configures the behavior of the selection list.
     * @param token A token that can be used to signal cancellation.
     * @returns A promise that resolves to the selected items or `undefined`.
     */
    // showQuickPick(items: readonly string[] | Thenable<readonly string[]>, options: QuickPickOptions & { /** literal-type defines return type */canPickMany: true }, token?: CancellationToken): Thenable<string[] | undefined>

    /**
     * Shows a selection list.
     *
     * @param items An array of strings, or a promise that resolves to an array of strings.
     * @param options Configures the behavior of the selection list.
     * @param token A token that can be used to signal cancellation.
     * @returns A promise that resolves to the selection or `undefined`.
     */
    fun showQuickPick(
        items: JsAny, /* string[] | Thenable<readonly string[]> */
        options: QuickPickOptions = definedExternally,
        token: CancellationToken = definedExternally,
    ): PromiseLike<JsString?>

    /**
     * Shows a selection list allowing multiple selections.
     *
     * @param items An array of items, or a promise that resolves to an array of items.
     * @param options Configures the behavior of the selection list.
     * @param token A token that can be used to signal cancellation.
     * @returns A promise that resolves to the selected items or `undefined`.
     */
    // showQuickPick<T extends QuickPickItem>(items: readonly T[] | Thenable<readonly T[]>, options: QuickPickOptions & { /** literal-type defines return type */ canPickMany: true }, token?: CancellationToken): Thenable<T[] | undefined>

    /**
     * Shows a selection list.
     *
     * @param items An array of items, or a promise that resolves to an array of items.
     * @param options Configures the behavior of the selection list.
     * @param token A token that can be used to signal cancellation.
     * @returns A promise that resolves to the selected item or `undefined`.
     */
    fun <T : QuickPickItem> showQuickPick(
        items: JsAny, /* T[] | Thenable<readonly T[]> */
        options: QuickPickOptions = definedExternally,
        token: CancellationToken = definedExternally,
    ): PromiseLike<T?>

    /**
     * Shows a selection list of [workspace folders][workspace.workspaceFolders] to pick from.
     * Returns `undefined` if no folder is open.
     *
     * @param options Configures the behavior of the workspace folder list.
     * @returns A promise that resolves to the workspace folder or `undefined`.
     */
    fun showWorkspaceFolderPick(options: WorkspaceFolderPickOptions = definedExternally): PromiseLike<WorkspaceFolder?>

    /**
     * Shows a file open dialog to the user which allows to select a file
     * for opening-purposes.
     *
     * @param options Options that control the dialog.
     * @returns A promise that resolves to the selected resources or `undefined`.
     */
    fun showOpenDialog(options: OpenDialogOptions = definedExternally): PromiseLike<ReadonlyArray<Uri>?>

    /**
     * Shows a file save dialog to the user which allows to select a file
     * for saving-purposes.
     *
     * @param options Options that control the dialog.
     * @returns A promise that resolves to the selected resource or `undefined`.
     */
    fun showSaveDialog(options: SaveDialogOptions = definedExternally): PromiseLike<Uri?>

    /**
     * Opens an input box to ask the user for input.
     *
     * The returned value will be `undefined` if the input box was canceled (e.g. pressing ESC). Otherwise the
     * returned value will be the string typed by the user or an empty string if the user did not type
     * anything but dismissed the input box with OK.
     *
     * @param options Configures the behavior of the input box.
     * @param token A token that can be used to signal cancellation.
     * @returns A promise that resolves to a string the user provided or to `undefined` in case of dismissal.
     */
    fun showInputBox(
        options: InputBoxOptions = definedExternally,
        token: CancellationToken = definedExternally,
    ): PromiseLike<JsString?>

    /**
     * Creates a [QuickPick] to let the user pick an item from a list
     * of items of type T.
     *
     * Note that in many cases the more convenient [window.showQuickPick]
     * is easier to use. [window.createQuickPick] should be used
     * when [window.showQuickPick] does not offer the required flexibility.
     *
     * @returns A new [QuickPick].
     */
    fun <T : QuickPickItem> createQuickPick(): QuickPick<T>

    /**
     * Creates a [InputBox] to let the user enter some text input.
     *
     * Note that in many cases the more convenient [window.showInputBox]
     * is easier to use. [window.createInputBox] should be used
     * when [window.showInputBox] does not offer the required flexibility.
     *
     * @returns A new [InputBox].
     */
    fun createInputBox(): InputBox

    /**
     * Creates a new [output channel][OutputChannel] with the given name and language id
     * If language id is not provided, then **Log** is used as default language id.
     *
     * You can access the visible or active output channel as a [text document} from {@link window.visibleTextEditors visible editors} or {@link window.activeTextEditor active editor][TextDocument]
     * and use the language id to contribute language features like syntax coloring, code lens etc.,
     *
     * @param name Human-readable string which will be used to represent the channel in the UI.
     * @param languageId The identifier of the language associated with the channel.
     * @returns A new output channel.
     */
    fun createOutputChannel(
        name: String,
        languageId: String = definedExternally,
    ): OutputChannel

    /**
     * Creates a new [log output channel][LogOutputChannel] with the given name.
     *
     * @param name Human-readable string which will be used to represent the channel in the UI.
     * @param options Options for the log output channel.
     * @returns A new log output channel.
     */
    // createOutputChannel(name: string, options: { /** literal-type defines return type */log: true }): LogOutputChannel

    /**
     * Create and show a new webview panel.
     *
     * @param viewType Identifies the type of the webview panel.
     * @param title Title of the panel.
     * @param showOptions Where to show the webview in the editor. If preserveFocus is set, the new webview will not take focus.
     * @param options Settings for the new panel.
     *
     * @returns New webview panel.
     */
    /*
    createWebviewPanel(viewType: string, title: string, showOptions: ViewColumn | {
        /**
         * The view column in which the {@link WebviewPanel} should be shown.
         */
        readonly viewColumn: ViewColumn;
        /**
         * An optional flag that when `true` will stop the panel from taking focus.
         */
        readonly preserveFocus?: boolean;
    }, options?: WebviewPanelOptions & WebviewOptions): WebviewPanel
    */

    /**
     * Set a message to the status bar. This is a short hand for the more powerful
     * status bar [items][window.createStatusBarItem].
     *
     * @param text The message to show, supports icon substitution as in status bar [items][StatusBarItem.text].
     * @param hideAfterTimeout Timeout in milliseconds after which the message will be disposed.
     * @returns A disposable which hides the status bar message.
     */
    fun setStatusBarMessage(
        text: String,
        hideAfterTimeout: Int,
    ): Disposable

    /**
     * Set a message to the status bar. This is a short hand for the more powerful
     * status bar [items][window.createStatusBarItem].
     *
     * @param text The message to show, supports icon substitution as in status bar [items][StatusBarItem.text].
     * @param hideWhenDone Thenable on which completion (resolve or reject) the message will be disposed.
     * @returns A disposable which hides the status bar message.
     */
    fun setStatusBarMessage(
        text: String,
        hideWhenDone: PromiseLike<JsAny?>,
    ): Disposable

    /**
     * Set a message to the status bar. This is a short hand for the more powerful
     * status bar [items][window.createStatusBarItem].
     *
     * *Note* that status bar messages stack and that they must be disposed when no
     * longer used.
     *
     * @param text The message to show, supports icon substitution as in status bar [items][StatusBarItem.text].
     * @returns A disposable which hides the status bar message.
     */
    fun setStatusBarMessage(text: String): Disposable

    /**
     * Show progress in the editor. Progress is shown while running the given callback
     * and while the promise it returned isn't resolved nor rejected. The location at which
     * progress should show (and other details) is defined via the passed {@linkcode ProgressOptions}.
     *
     * @param options A {@linkcode ProgressOptions}-object describing the options to use for showing progress, like its location
     * @param task A callback returning a promise. Progress state can be reported with
     * the provided [Progress]-object.
     *
     * To report discrete progress, use `increment` to indicate how much work has been completed. Each call with
     * a `increment` value will be summed up and reflected as overall progress until 100% is reached (a value of
     * e.g. `10` accounts for `10%` of work done).
     * Note that currently only `ProgressLocation.Notification` is capable of showing discrete progress.
     *
     * To monitor if the operation has been cancelled by the user, use the provided {@linkcode CancellationToken}.
     * Note that currently only `ProgressLocation.Notification` is supporting to show a cancel button to cancel the
     * long running operation.
     *
     * @returns The thenable the task-callback returned.
     */
    /*
    withProgress<R>(options: ProgressOptions, task: (progress: Progress<{
        /**
         * A progress message that represents a chunk of work
         */
        message?: string;
        /**
         * An increment for discrete progress. Increments will be summed up until 100% is reached
         */
        increment?: number;
    }>, token: CancellationToken) => Thenable<R>): Thenable<R>
    */

    /**
     * Creates a status bar [item][StatusBarItem].
     *
     * @param id The identifier of the item. Must be unique within the extension.
     * @param alignment The alignment of the item.
     * @param priority The priority of the item. Higher values mean the item should be shown more to the left.
     * @returns A new status bar item.
     */
    fun createStatusBarItem(
        id: String,
        alignment: StatusBarAlignment = definedExternally,
        priority: Int = definedExternally,
    ): StatusBarItem

    /**
     * Creates a status bar [item][StatusBarItem].
     *
     * @see [createStatusBarItem] for creating a status bar item with an identifier.
     * @param alignment The alignment of the item.
     * @param priority The priority of the item. Higher values mean the item should be shown more to the left.
     * @returns A new status bar item.
     */
    fun createStatusBarItem(
        alignment: StatusBarAlignment = definedExternally,
        priority: Int = definedExternally,
    ): StatusBarItem

    /**
     * Creates a [Terminal] with a backing shell process. The cwd of the terminal will be the workspace
     * directory if it exists.
     *
     * @param name Optional human-readable string which will be used to represent the terminal in the UI.
     * @param shellPath Optional path to a custom shell executable to be used in the terminal.
     * @param shellArgs Optional args for the custom shell executable. A string can be used on Windows only which
     * allows specifying shell args in
     * [command-line format](https://msdn.microsoft.com/en-au/08dfcab2-eb6e-49a4-80eb-87d4076c98c6).
     * @returns A new Terminal.
     * @throws When running in an environment where a new process cannot be started.
     */
    fun createTerminal(
        name: String = definedExternally,
        shellPath: String = definedExternally,
        shellArgs: JsAny /* string[] | string */ = definedExternally,
    ): Terminal

    /**
     * Creates a [Terminal] with a backing shell process.
     *
     * @param options A TerminalOptions object describing the characteristics of the new terminal.
     * @returns A new Terminal.
     * @throws When running in an environment where a new process cannot be started.
     */
    fun createTerminal(options: TerminalOptions): Terminal

    /**
     * Creates a [Terminal] where an extension controls its input and output.
     *
     * @param options An [ExtensionTerminalOptions] object describing
     * the characteristics of the new terminal.
     * @returns A new Terminal.
     */
    fun createTerminal(options: ExtensionTerminalOptions): Terminal

    /**
     * Register a [TreeDataProvider] for the view contributed using the extension point `views`.
     * This will allow you to contribute data to the [TreeView] and update if the data changes.
     *
     * **Note:** To get access to the [TreeView] and perform operations on it, use [createTreeView][window.createTreeView].
     *
     * @param viewId Id of the view contributed using the extension point `views`.
     * @param treeDataProvider A [TreeDataProvider] that provides tree data for the view
     * @returns A [disposable][Disposable] that unregisters the [TreeDataProvider].
     */
    fun <T : JsAny?> registerTreeDataProvider(
        viewId: String,
        treeDataProvider: TreeDataProvider<T>,
    ): Disposable

    /**
     * Create a [TreeView] for the view contributed using the extension point `views`.
     * @param viewId Id of the view contributed using the extension point `views`.
     * @param options Options for creating the [TreeView]
     * @returns a [TreeView].
     */
    fun <T : JsAny?> createTreeView(
        viewId: String,
        options: TreeViewOptions<T>,
    ): TreeView<T>

    /**
     * Registers a [uri handler} capable of handling system-wide {@link Uri uris][UriHandler].
     * In case there are multiple windows open, the topmost window will handle the uri.
     * A uri handler is scoped to the extension it is contributed from; it will only
     * be able to handle uris which are directed to the extension itself. A uri must respect
     * the following rules:
     *
     * - The uri-scheme must be `vscode.env.uriScheme`;
     * - The uri-authority must be the extension id (e.g. `my.extension`);
     * - The uri-path, -query and -fragment parts are arbitrary.
     *
     * For example, if the `my.extension` extension registers a uri handler, it will only
     * be allowed to handle uris with the prefix `product-name://my.extension`.
     *
     * An extension can only register a single uri handler in its entire activation lifetime.
     *
     * * *Note:* There is an activation event `onUri` that fires when a uri directed for
     * the current extension is about to be handled.
     *
     * @param handler The uri handler to register for this extension.
     * @returns A [disposable][Disposable] that unregisters the handler.
     */
    fun registerUriHandler(handler: UriHandler): Disposable

    /**
     * Registers a webview panel serializer.
     *
     * Extensions that support reviving should have an `"onWebviewPanel:viewType"` activation event and
     * make sure that `registerWebviewPanelSerializer` is called during activation.
     *
     * Only a single serializer may be registered at a time for a given `viewType`.
     *
     * @param viewType Type of the webview panel that can be serialized.
     * @param serializer Webview serializer.
     * @returns A [disposable][Disposable] that unregisters the serializer.
     */
    fun registerWebviewPanelSerializer(
        viewType: String,
        serializer: WebviewPanelSerializer<*>,
    ): Disposable

    /**
     * Register a new provider for webview views.
     *
     * @param viewId Unique id of the view. This should match the `id` from the
     *   `views` contribution in the package.json.
     * @param provider Provider for the webview views.
     *
     * @returns Disposable that unregisters the provider.
     */
    /*
    registerWebviewViewProvider(viewId: string, provider: WebviewViewProvider, options?: {
        /**
         * Content settings for the webview created for this view.
         */
        readonly webviewOptions?: {
            /**
             * Controls if the webview element itself (iframe) is kept around even when the view
             * is no longer visible.
             *
             * Normally the webview's html context is created when the view becomes visible
             * and destroyed when it is hidden. Extensions that have complex state
             * or UI can set the `retainContextWhenHidden` to make the editor keep the webview
             * context around, even when the webview moves to a background tab. When a webview using
             * `retainContextWhenHidden` becomes hidden, its scripts and other dynamic content are suspended.
             * When the view becomes visible again, the context is automatically restored
             * in the exact same state it was in originally. You cannot send messages to a
             * hidden webview, even with `retainContextWhenHidden` enabled.
             *
             * `retainContextWhenHidden` has a high memory overhead and should only be used if
             * your view's context cannot be quickly saved and restored.
             */
            readonly retainContextWhenHidden?: boolean;
        };
    }): Disposable
    */

    /**
     * Register a provider for custom editors for the `viewType` contributed by the `customEditors` extension point.
     *
     * When a custom editor is opened, an `onCustomEditor:viewType` activation event is fired. Your extension
     * must register a {@linkcode CustomTextEditorProvider}, {@linkcode CustomReadonlyEditorProvider},
     * {@linkcode CustomEditorProvider}for `viewType` as part of activation.
     *
     * @param viewType Unique identifier for the custom editor provider. This should match the `viewType` from the
     *   `customEditors` contribution point.
     * @param provider Provider that resolves custom editors.
     * @param options Options for the provider.
     *
     * @returns Disposable that unregisters the provider.
     */
    /*
    registerCustomEditorProvider(viewType: string, provider: CustomTextEditorProvider | CustomReadonlyEditorProvider | CustomEditorProvider, options?: {
        /**
         * Content settings for the webview panels created for this custom editor.
         */
        readonly webviewOptions?: WebviewPanelOptions;

        /**
         * Only applies to `CustomReadonlyEditorProvider | CustomEditorProvider`.
         *
         * Indicates that the provider allows multiple editor instances to be open at the same time for
         * the same resource.
         *
         * By default, the editor only allows one editor instance to be open at a time for each resource. If the
         * user tries to open a second editor instance for the resource, the first one is instead moved to where
         * the second one was to be opened.
         *
         * When `supportsMultipleEditorsPerDocument` is enabled, users can split and create copies of the custom
         * editor. In this case, the custom editor must make sure it can properly synchronize the states of all
         * editor instances for a resource so that they are consistent.
         */
        readonly supportsMultipleEditorsPerDocument?: boolean;
    }): Disposable
    */

    /**
     * Register provider that enables the detection and handling of links within the terminal.
     * @param provider The provider that provides the terminal links.
     * @returns Disposable that unregisters the provider.
     */
    fun registerTerminalLinkProvider(provider: TerminalLinkProvider<*>): Disposable

    /**
     * Registers a provider for a contributed terminal profile.
     *
     * @param id The ID of the contributed terminal profile.
     * @param provider The terminal profile provider.
     * @returns A [disposable][Disposable] that unregisters the provider.
     */
    fun registerTerminalProfileProvider(
        id: String,
        provider: TerminalProfileProvider,
    ): Disposable

    /**
     * Register a file decoration provider.
     *
     * @param provider A [FileDecorationProvider].
     * @returns A [Disposable] that unregisters the provider.
     */
    fun registerFileDecorationProvider(provider: FileDecorationProvider): Disposable

    /**
     * The currently active color theme as configured in the settings. The active
     * theme can be changed via the `workbench.colorTheme` setting.
     */
    var activeColorTheme: ColorTheme

    /**
     * An [Event] which fires when the active color theme is changed or has changes.
     */
    val onDidChangeActiveColorTheme: Event<ColorTheme>
}
