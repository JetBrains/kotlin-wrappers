// Automatically generated - do not modify!

package vscode

import js.array.ReadonlyArray
import js.core.Void
import js.promise.PromiseLike
import kotlin.js.JsString

/**
 * A notebook controller represents an entity that can execute notebook cells. This is often referred to as a kernel.
 *
 * There can be multiple controllers and the editor will let users choose which controller to use for a certain notebook. The
 * [notebookType][NotebookController.notebookType]-property defines for what kind of notebooks a controller is for and
 * the [updateNotebookAffinity][NotebookController.updateNotebookAffinity]-function allows controllers to set a preference
 * for specific notebook documents. When a controller has been selected its
 * [onDidChangeSelectedNotebooks][NotebookController.onDidChangeSelectedNotebooks]-event fires.
 *
 * When a cell is being run the editor will invoke the [executeHandler][NotebookController.executeHandler] and a controller
 * is expected to create and finalize a [notebook cell execution][NotebookCellExecution]. However, controllers are also free
 * to create executions by themselves.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookController)
 */
external interface NotebookController :
    DisposableLike {
    /**
     * The identifier of this notebook controller.
     *
     * _Note_ that controllers are remembered by their identifier and that extensions should use
     * stable identifiers across sessions.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookController.id)
     */
    val id: String

    /**
     * The notebook type this controller is for.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookController.notebookType)
     */
    val notebookType: String

    /**
     * An array of language identifiers that are supported by this
     * controller. Any language identifier from [getLanguages][languages.getLanguages]
     * is possible. When falsy all languages are supported.
     *
     * Samples:
     * ```js
     * // support JavaScript and TypeScript
     * myController.supportedLanguages = ['javascript', 'typescript']
     *
     * // support all languages
     * myController.supportedLanguages = undefined; // falsy
     * myController.supportedLanguages = []; // falsy
     * ```
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookController.supportedLanguages)
     */
    var supportedLanguages: ReadonlyArray<JsString>?

    /**
     * The human-readable label of this notebook controller.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookController.label)
     */
    var label: String

    /**
     * The human-readable description which is rendered less prominent.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookController.description)
     */
    var description: String?

    /**
     * The human-readable detail which is rendered less prominent.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookController.detail)
     */
    var detail: String?

    /**
     * Whether this controller supports execution order so that the
     * editor can render placeholders for them.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookController.supportsExecutionOrder)
     */
    var supportsExecutionOrder: Boolean?

    /**
     * Create a cell execution task.
     *
     * _Note_ that there can only be one execution per cell at a time and that an error is thrown if
     * a cell execution is created while another is still active.
     *
     * This should be used in response to the [execution handler][NotebookController.executeHandler]
     * being called or when cell execution has been started else, e.g when a cell was already
     * executing or when cell execution was triggered from another source.
     *
     * @param cell The notebook cell for which to create the execution.
     * @returns A notebook cell execution.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookController.createNotebookCellExecution)
     */
    fun createNotebookCellExecution(cell: NotebookCell): NotebookCellExecution

    /**
     * The execute handler is invoked when the run gestures in the UI are selected, e.g Run Cell, Run All,
     * Run Selection etc. The execute handler is responsible for creating and managing [execution][NotebookCellExecution]-objects.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookController.executeHandler)
     */
    var executeHandler: (
        cells: ReadonlyArray<NotebookCell>,
        notebook: NotebookDocument,
        controller: NotebookController,
    ) -> PromiseLike<Void>?

    /**
     * Optional interrupt handler.
     *
     * By default cell execution is canceled via [tokens][NotebookCellExecution.token]. Cancellation
     * tokens require that a controller can keep track of its execution so that it can cancel a specific execution at a later
     * point. Not all scenarios allow for that, eg. REPL-style controllers often work by interrupting whatever is currently
     * running. For those cases the interrupt handler exists - it can be thought of as the equivalent of `SIGINT`
     * or `Control+C` in terminals.
     *
     * _Note_ that supporting [cancellation tokens][NotebookCellExecution.token] is preferred and that interrupt handlers should
     * only be used when tokens cannot be supported.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookController.interruptHandler)
     */
    var interruptHandler: (notebook: NotebookDocument) -> PromiseLike<Void>?

    /**
     * An event that fires whenever a controller has been selected or un-selected for a notebook document.
     *
     * There can be multiple controllers for a notebook and in that case a controllers needs to be _selected_. This is a user gesture
     * and happens either explicitly or implicitly when interacting with a notebook for which a controller was _suggested_. When possible,
     * the editor _suggests_ a controller that is most likely to be _selected_.
     *
     * _Note_ that controller selection is persisted (by the controllers [id][NotebookController.id]) and restored as soon as a
     * controller is re-created or as a notebook is [opened][workspace.onDidOpenNotebookDocument].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookController.onDidChangeSelectedNotebooks)
     */
    /*
    readonly onDidChangeSelectedNotebooks: Event<{
        /**
         * The notebook for which the controller has been selected or un-selected.
         */
        readonly notebook: NotebookDocument;
        /**
         * Whether the controller has been selected or un-selected.
         */
        readonly selected: boolean;
    }>
    */

    /**
     * A controller can set affinities for specific notebook documents. This allows a controller
     * to be presented more prominent for some notebooks.
     *
     * @param notebook The notebook for which a priority is set.
     * @param affinity A controller affinity
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookController.updateNotebookAffinity)
     */
    fun updateNotebookAffinity(
        notebook: NotebookDocument,
        affinity: NotebookControllerAffinity,
    )

    /**
     * Dispose and free associated resources.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookController.dispose)
     */
    override fun dispose()
}
