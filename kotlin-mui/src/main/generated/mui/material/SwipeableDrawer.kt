// Automatically generated - do not modify!

@file:JsModule("@mui/material/SwipeableDrawer")
@file:JsNonModule

package mui.material

external interface SwipeableDrawerProps : react.Props {
    /**
     * Disable the backdrop transition.
     * This can improve the FPS on low-end devices.
     * @default false
     */
    var disableBackdropTransition: Boolean

    /**
     * If `true`, touching the screen near the edge of the drawer will not slide in the drawer a bit
     * to promote accidental discovery of the swipe gesture.
     * @default false
     */
    var disableDiscovery: Boolean

    /**
     * If `true`, swipe to open is disabled. This is useful in browsers where swiping triggers
     * navigation actions. Swipe to open is disabled on iOS browsers by default.
     * @default typeof navigator !== 'undefined' && /iPad|iPhone|iPod/.test(navigator.userAgent)
     */
    var disableSwipeToOpen: Boolean

    /**
     * Affects how far the drawer must be opened/closed to change its state.
     * Specified as percent (0-1) of the width of the drawer
     * @default 0.52
     */
    var hysteresis: Number

    /**
     * Defines, from which (average) velocity on, the swipe is
     * defined as complete although hysteresis isn't reached.
     * Good threshold is between 250 - 1000 px/s
     * @default 450
     */
    var minFlingVelocity: Number

    /**
     * Callback fired when the component requests to be closed.
     *
     * @param {React.SyntheticEvent<{}>} event The event source of the callback.
     */
    var onClose: react.dom.ReactEventHandler<*>

    /**
     * Callback fired when the component requests to be opened.
     *
     * @param {React.SyntheticEvent<{}>} event The event source of the callback.
     */
    var onOpen: react.dom.ReactEventHandler<*>

    /**
     * If `true`, the component is shown.
     */
    var open: Boolean

    /**
     * The element is used to intercept the touch events on the edge.
     */
    var SwipeAreaProps: Any

    /**
     * The width of the left most (or right most) area in `px` that
     * the drawer can be swiped open from.
     * @default 20
     */
    var swipeAreaWidth: Number
}

/**
 *
 * Demos:
 *
 * - [Drawers](https://mui.com/components/drawers/)
 *
 * API:
 *
 * - [SwipeableDrawer API](https://mui.com/api/swipeable-drawer/)
 * - inherits [Drawer API](https://mui.com/api/drawer/)
 */
@JsName("default")
external val SwipeableDrawer: react.FC<SwipeableDrawerProps>
