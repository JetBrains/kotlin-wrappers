package react.router

import remix.run.router.RevalidationState


sealed external interface UseRevalidatorResult {
    var revalidate: () -> Unit
    var state: /* import("@remix-run/router") */ RevalidationState
}
