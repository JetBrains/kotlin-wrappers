package react.router.dom

import remix.run.router.RelativeRoutingType


sealed external interface UseViewTransitionStateOpts {
    var relative: RelativeRoutingType?
}
