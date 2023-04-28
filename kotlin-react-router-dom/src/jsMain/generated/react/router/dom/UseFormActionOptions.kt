package react.router.dom

import remix.run.router.RelativeRoutingType


sealed external interface UseFormActionOptions {
    var relative: RelativeRoutingType?
}
