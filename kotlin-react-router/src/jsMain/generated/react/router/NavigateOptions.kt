@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package react.router


external interface NavigateOptions {
    var replace: Boolean?
    var state: remix.run.router.LocationState?
    var preventScrollReset: Boolean?
    var relative: RelativeRoutingType?
}

