package react.router

import remix.run.router.RelativeRoutingType


sealed external interface UseHrefOptions {
    var relative: RelativeRoutingType?
}
