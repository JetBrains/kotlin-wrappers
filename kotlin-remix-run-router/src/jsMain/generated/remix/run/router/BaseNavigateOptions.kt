@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package remix.run.router


sealed external interface BaseNavigateOptions {
    var replace: Boolean?
    var state: Any?
    var preventScrollReset: Boolean?
    var relative: RelativeRoutingType?
    var fromRouteId: String?
}
