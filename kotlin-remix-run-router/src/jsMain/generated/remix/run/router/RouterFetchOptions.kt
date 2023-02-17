@file:JsModule("@remix-run/router")

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NAME_CONTAINS_ILLEGAL_CHARS",
)

package remix.run.router


/**
 * Options to pass to fetch()
 */
typealias RouterFetchOptions = Any /* Omit<LinkNavigateOptions, "replace"> | Omit<SubmissionNavigateOptions, "replace"> */
