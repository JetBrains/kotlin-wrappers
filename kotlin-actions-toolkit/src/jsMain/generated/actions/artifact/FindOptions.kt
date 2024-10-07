// Automatically generated - do not modify!

package actions.artifact

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface FindOptions {
    /**
     * The criteria for finding Artifact(s) out of the scope of the current run.
     */
    val findBy: FindBy?

    @JsPlainObject
    interface FindBy {
        /**
         * Token with actions:read permissions
         */
        val token: String

        /**
         * WorkflowRun of the artifact(s) to lookup
         */
        val workflowRunId: Number

        /**
         * Repository owner (eg. 'actions')
         */
        val repositoryOwner: String

        /**
         * Repository owner (eg. 'toolkit')
         */
        val repositoryName: String
    }
}
