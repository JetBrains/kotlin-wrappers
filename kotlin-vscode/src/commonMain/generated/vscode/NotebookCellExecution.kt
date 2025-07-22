// Automatically generated - do not modify!

package vscode

/**
 * A NotebookCellExecution is how {@link NotebookController notebook controller} modify a notebook cell as
 * it is executing.
 *
 * When a cell execution object is created, the cell enters the {@linkcode NotebookCellExecutionState.Pending Pending} state.
 * When {@linkcode NotebookCellExecution.start start(...)} is called on the execution task, it enters the {@linkcode NotebookCellExecutionState.Executing Executing} state. When
 * {@linkcode NotebookCellExecution.end end(...)} is called, it enters the {@linkcode NotebookCellExecutionState.Idle Idle} state.
 */
external interface NotebookCellExecution {
    /**
     * The {@link NotebookCell cell} for which this execution has been created.
     */
    val cell: NotebookCell

    /**
     * A cancellation token which will be triggered when the cell execution is canceled
     * from the UI.
     *
     * _Note_ that the cancellation token will not be triggered when the {@link NotebookController controller}
     * that created this execution uses an {@link NotebookController.interruptHandler interrupt-handler}.
     */
    val token: CancellationToken

    /**
     * Set and unset the order of this cell execution.
     */
//  executionOrder: number | undefined;

    /**
     * Signal that the execution has begun.
     *
     * @param startTime The time that execution began, in milliseconds in the Unix epoch. Used to drive the clock
     * that shows for how long a cell has been running. If not given, the clock won't be shown.
     */
//  start(startTime?: number): void;

    /**
     * Signal that execution has ended.
     *
     * @param success If true, a green check is shown on the cell status bar.
     * If false, a red X is shown.
     * If undefined, no check or X icon is shown.
     * @param endTime The time that execution finished, in milliseconds in the Unix epoch.
     */
//  end(success: boolean | undefined, endTime?: number): void;

    /**
     * Clears the output of the cell that is executing or of another cell that is affected by this execution.
     *
     * @param cell Cell for which output is cleared. Defaults to the {@link NotebookCellExecution.cell cell} of
     * this execution.
     * @returns A thenable that resolves when the operation finished.
     */
//  clearOutput(cell?: NotebookCell): Thenable<void>;

    /**
     * Replace the output of the cell that is executing or of another cell that is affected by this execution.
     *
     * @param out Output that replaces the current output.
     * @param cell Cell for which output is cleared. Defaults to the {@link NotebookCellExecution.cell cell} of
     * this execution.
     * @returns A thenable that resolves when the operation finished.
     */
//  replaceOutput(out: NotebookCellOutput | readonly NotebookCellOutput[], cell?: NotebookCell): Thenable<void>;

    /**
     * Append to the output of the cell that is executing or to another cell that is affected by this execution.
     *
     * @param out Output that is appended to the current output.
     * @param cell Cell for which output is cleared. Defaults to the {@link NotebookCellExecution.cell cell} of
     * this execution.
     * @returns A thenable that resolves when the operation finished.
     */
//  appendOutput(out: NotebookCellOutput | readonly NotebookCellOutput[], cell?: NotebookCell): Thenable<void>;

    /**
     * Replace all output items of existing cell output.
     *
     * @param items Output items that replace the items of existing output.
     * @param output Output object that already exists.
     * @returns A thenable that resolves when the operation finished.
     */
//  replaceOutputItems(items: NotebookCellOutputItem | readonly NotebookCellOutputItem[], output: NotebookCellOutput): Thenable<void>;

    /**
     * Append output items to existing cell output.
     *
     * @param items Output items that are append to existing output.
     * @param output Output object that already exists.
     * @returns A thenable that resolves when the operation finished.
     */
//  appendOutputItems(items: NotebookCellOutputItem | readonly NotebookCellOutputItem[], output: NotebookCellOutput): Thenable<void>;
}
