// Automatically generated - do not modify!

package vscode

import js.core.JsAny
import js.core.JsInt53
import js.core.Void
import js.promise.PromiseLike
import kotlin.js.definedExternally

/**
 * A NotebookCellExecution is how [notebook controller][NotebookController] modify a notebook cell as
 * it is executing.
 *
 * When a cell execution object is created, the cell enters the {@linkcode NotebookCellExecutionState.Pending Pending} state.
 * When {@linkcode NotebookCellExecution.start start(...)} is called on the execution task, it enters the {@linkcode NotebookCellExecutionState.Executing Executing} state. When
 * {@linkcode NotebookCellExecution.end end(...)} is called, it enters the {@linkcode NotebookCellExecutionState.Idle Idle} state.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookCellExecution)
 */
external interface NotebookCellExecution {
    /**
     * The [cell][NotebookCell] for which this execution has been created.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookCellExecution.cell)
     */
    val cell: NotebookCell

    /**
     * A cancellation token which will be triggered when the cell execution is canceled
     * from the UI.
     *
     * _Note_ that the cancellation token will not be triggered when the [controller][NotebookController]
     * that created this execution uses an [interrupt-handler][NotebookController.interruptHandler].
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookCellExecution.token)
     */
    val token: CancellationToken

    /**
     * Set and unset the order of this cell execution.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookCellExecution.executionOrder)
     */
    var executionOrder: Int?

    /**
     * Signal that the execution has begun.
     *
     * @param startTime The time that execution began, in milliseconds in the Unix epoch. Used to drive the clock
     * that shows for how long a cell has been running. If not given, the clock won't be shown.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookCellExecution.start)
     */
    fun start(startTime: JsInt53 = definedExternally)

    /**
     * Signal that execution has ended.
     *
     * @param success If true, a green check is shown on the cell status bar.
     * If false, a red X is shown.
     * If undefined, no check or X icon is shown.
     * @param endTime The time that execution finished, in milliseconds in the Unix epoch.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookCellExecution.end)
     */
    fun end(
        success: Boolean?,
        endTime: JsInt53 = definedExternally,
    )

    /**
     * Clears the output of the cell that is executing or of another cell that is affected by this execution.
     *
     * @param cell Cell for which output is cleared. Defaults to the [cell][NotebookCellExecution.cell] of
     * this execution.
     * @returns A thenable that resolves when the operation finished.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookCellExecution.clearOutput)
     */
    fun clearOutput(cell: NotebookCell = definedExternally): PromiseLike<Void>

    /**
     * Replace the output of the cell that is executing or of another cell that is affected by this execution.
     *
     * @param out Output that replaces the current output.
     * @param cell Cell for which output is cleared. Defaults to the [cell][NotebookCellExecution.cell] of
     * this execution.
     * @returns A thenable that resolves when the operation finished.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookCellExecution.replaceOutput)
     */
    fun replaceOutput(
        out: JsAny, /* NotebookCellOutput | readonly NotebookCellOutput[] */
        cell: NotebookCell = definedExternally,
    ): PromiseLike<Void>

    /**
     * Append to the output of the cell that is executing or to another cell that is affected by this execution.
     *
     * @param out Output that is appended to the current output.
     * @param cell Cell for which output is cleared. Defaults to the [cell][NotebookCellExecution.cell] of
     * this execution.
     * @returns A thenable that resolves when the operation finished.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookCellExecution.appendOutput)
     */
    fun appendOutput(
        out: JsAny, /* NotebookCellOutput | readonly NotebookCellOutput[] */
        cell: NotebookCell = definedExternally,
    ): PromiseLike<Void>

    /**
     * Replace all output items of existing cell output.
     *
     * @param items Output items that replace the items of existing output.
     * @param output Output object that already exists.
     * @returns A thenable that resolves when the operation finished.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookCellExecution.replaceOutputItems)
     */
    fun replaceOutputItems(
        items: JsAny, /* NotebookCellOutputItem | readonly NotebookCellOutputItem[] */
        output: NotebookCellOutput,
    ): PromiseLike<Void>

    /**
     * Append output items to existing cell output.
     *
     * @param items Output items that are append to existing output.
     * @param output Output object that already exists.
     * @returns A thenable that resolves when the operation finished.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookCellExecution.appendOutputItems)
     */
    fun appendOutputItems(
        items: JsAny, /* NotebookCellOutputItem | readonly NotebookCellOutputItem[] */
        output: NotebookCellOutput,
    ): PromiseLike<Void>
}
