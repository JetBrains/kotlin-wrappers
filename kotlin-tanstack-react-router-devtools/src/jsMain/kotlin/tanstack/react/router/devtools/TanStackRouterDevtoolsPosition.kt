package tanstack.react.router.devtools

import js.reflect.unsafeCast

sealed external interface TanStackRouterDevtoolsPosition {
    companion object
}

inline val TanStackRouterDevtoolsPosition.Companion.topLeft: TanStackRouterDevtoolsPosition
    get() = unsafeCast("top-left")

inline val TanStackRouterDevtoolsPosition.Companion.topRight: TanStackRouterDevtoolsPosition
    get() = unsafeCast("top-right")

inline val TanStackRouterDevtoolsPosition.Companion.bottomLeft: TanStackRouterDevtoolsPosition
    get() = unsafeCast("bottom-left")

inline val TanStackRouterDevtoolsPosition.Companion.bottomRight: TanStackRouterDevtoolsPosition
    get() = unsafeCast("bottom-right")
