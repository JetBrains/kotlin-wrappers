// Automatically generated - do not modify!

package vscode

/**
 * The summary of a notebook cell execution.
 */
external interface NotebookCellExecutionSummary {
    /**
     * The order in which the execution happened.
     */
    val executionOrder: Int?

    /**
     * If the execution finished successfully.
     */
    val success: Boolean?

    /**
     * The times at which execution started and ended, as unix timestamps
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
    };
    */
}
