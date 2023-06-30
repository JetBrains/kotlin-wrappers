@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package remix.run.router

/**
 * Options for a navigate() call for a submission navigation
 */

sealed external interface SubmissionNavigateOptions : BaseNavigateOptions, BaseSubmissionOptions
