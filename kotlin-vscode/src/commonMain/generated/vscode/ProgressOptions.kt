// Automatically generated - do not modify!

package vscode

/**
 * Value-object describing where and how progress should show.
 *
 * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ProgressOptions)
 */
external interface ProgressOptions {
    /**
     * The location at which progress should show.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ProgressOptions.location)
     */
    /*
    location: ProgressLocation | {
        /**
         * The identifier of a view for which progress should be shown.
         */
        viewId: string;
    }
    */

    /**
     * A human-readable string which will be used to describe the
     * operation.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ProgressOptions.title)
     */
    var title: String?

    /**
     * Controls if a cancel button should show to allow the user to
     * cancel the long running operation.  Note that currently only
     * `ProgressLocation.Notification` is supporting to show a cancel
     * button.
     *
     * [Online Documentation](https://code.visualstudio.com/api/references/vscode-api#ProgressOptions.cancellable)
     */
    var cancellable: Boolean?
}
