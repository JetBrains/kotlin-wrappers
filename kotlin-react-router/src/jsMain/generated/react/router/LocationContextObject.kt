package react.router

import remix.run.router.Location
import remix.run.router.Action as NavigationType


sealed external interface LocationContextObject {
    var location: Location
    var navigationType: NavigationType
}
