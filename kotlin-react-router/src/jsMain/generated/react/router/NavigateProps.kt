package react.router

import remix.run.router.RelativeRoutingType
import remix.run.router.To


sealed external interface NavigateProps : react.Props {
    var to: To
    var replace: Boolean?
    var state: remix.run.router.LocationState?
    var relative: RelativeRoutingType?
}
