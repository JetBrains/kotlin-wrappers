package react.router

import remix.run.router.RelativeRoutingType


sealed external interface NavigateOptions {
    var replace: Boolean?
    var state: remix.run.router.LocationState?
    var preventScrollReset: Boolean?
    var relative: RelativeRoutingType?
}
