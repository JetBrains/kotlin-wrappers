// Automatically generated - do not modify!

package actions.artifact

import kotlinx.js.JsPlainObject

@JsPlainObject
sealed external interface FindOptions {
    /**
     * The criteria for finding Artifact(s) out of the scope of the current run.
     */
    var findBy: FindBy?

    @JsPlainObject
    interface FindBy {
        /**
         * Token with actions:read permissions
         */
        var token: String

        /**
         * WorkflowRun of the artifact(s) to lookup
         */
        var workflowRunId: Number

        /**
         * Repository owner (eg. 'actions')
         */
        var repositoryOwner: String

        /**
         * Repository owner (eg. 'toolkit')
         */
        var repositoryName: String
    }
}
