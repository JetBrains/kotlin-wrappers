@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package remix.run.router


sealed external interface BaseNavigateOptions : BaseNavigateOrFetchOptions {
    var replace: Boolean?
    var state: Any?
    var fromRouteId: String?
}
