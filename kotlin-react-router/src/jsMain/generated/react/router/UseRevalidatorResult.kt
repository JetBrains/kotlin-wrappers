package react.router

import remix.run.router.RevalidationState


external interface UseRevalidatorResult {
    var revalidate: () -> Unit
    var state: /* import("@remix-run/router") */ RevalidationState
}

