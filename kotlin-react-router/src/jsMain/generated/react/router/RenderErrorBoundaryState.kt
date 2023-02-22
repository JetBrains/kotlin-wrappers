@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package react.router

import remix.run.router.Location


external interface RenderErrorBoundaryState {
    var location: Location
    var error: Any?
}

