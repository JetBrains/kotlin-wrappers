@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package react.router

import remix.run.router.InitialEntry


external interface MemoryRouterProps : react.PropsWithChildren {
    var basename: String?
    var initialEntries: js.core.ReadonlyArray<InitialEntry>?
    var initialIndex: Double?
}

