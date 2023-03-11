@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package react.router

import remix.run.router.Location
import remix.run.router.Action as NavigationType


external interface LocationContextObject {
    var location: Location
    var navigationType: NavigationType
}
