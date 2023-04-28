@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package react.router

import remix.run.router.Location
import remix.run.router.RevalidationState


sealed external interface RenderErrorBoundaryState {
    var location: Location
    var revalidation: RevalidationState
    var error: Any?
}
