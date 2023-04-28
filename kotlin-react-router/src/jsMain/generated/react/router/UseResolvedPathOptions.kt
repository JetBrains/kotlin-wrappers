package react.router

import remix.run.router.RelativeRoutingType


sealed external interface UseResolvedPathOptions {
    var relative: RelativeRoutingType?
}
