@file:JsModule("@remix-run/router")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package remix.run.router


/**
 * Options to pass to fetch()
 */
typealias RouterFetchOptions = Any /* Omit<LinkNavigateOptions, "replace"> | Omit<SubmissionNavigateOptions, "replace"> */
