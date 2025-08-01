// Automatically generated - do not modify!

package vscode

import js.objects.JsPlainObject

/**
 * The summary of a notebook cell execution.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookCellExecutionSummary)
 */
@JsPlainObject
external interface NotebookCellExecutionSummary {
    /**
     * The order in which the execution happened.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookCellExecutionSummary.executionOrder)
     */
    val executionOrder: Int?

    /**
     * If the execution finished successfully.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookCellExecutionSummary.success)
     */
    val success: Boolean?

    /**
     * The times at which execution started and ended, as unix timestamps
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#NotebookCellExecutionSummary.timing)
     */
    /*
    readonly timing?: {
        /**
         * Execution start time.
         */
        readonly startTime: number;
        /**
         * Execution end time.
         */
        readonly endTime: number;
    }
    */
}
