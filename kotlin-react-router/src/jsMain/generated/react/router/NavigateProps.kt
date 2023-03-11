@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package react.router

import remix.run.router.To


external interface NavigateProps : react.Props {
    var to: To
    var replace: Boolean?
    var state: remix.run.router.LocationState?
    var relative: RelativeRoutingType?
}
