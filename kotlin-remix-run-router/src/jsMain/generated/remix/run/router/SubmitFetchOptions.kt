@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package remix.run.router


/**
 * Options for a fetch() submission
 */

sealed external interface SubmitFetchOptions : BaseNavigateOrFetchOptions, BaseSubmissionOptions
