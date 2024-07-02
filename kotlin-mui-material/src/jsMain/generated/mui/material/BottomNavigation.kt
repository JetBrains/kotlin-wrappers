// Automatically generated - do not modify!

@file:JsModule("@mui/material/BottomNavigation")

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface BottomNavigationProps :
    BottomNavigationOwnProps,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    mui.types.PropsWithComponent

external interface BottomNavigationOwnProps :
    react.PropsWithChildren,
    mui.system.PropsWithSx {
    /**
     * The content of the component.
     */
    override var children: react.ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: BottomNavigationClasses?

    /**
     * Callback fired when the value changes.
     *
     * @param {React.SyntheticEvent} event The event source of the callback. **Warning**: This is a generic event not a change event.
     * @param {any} value We default to the index of the child.
     */
    var onChange: ((event: react.dom.events.SyntheticEvent<*, *>, value: Any) -> Unit)?

    /**
     * If `true`, all `BottomNavigationAction`s will show their labels.
     * By default, only the selected `BottomNavigationAction` will show its label.
     * @default false
     */
    var showLabels: Boolean?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?

    /**
     * The value of the currently selected `BottomNavigationAction`.
     */
    var value: Any?
}

/**
 *
 * Demos:
 *
 * - [Bottom Navigation](https://mui.com/material-ui/react-bottom-navigation/)
 *
 * API:
 *
 * - [BottomNavigation API](https://mui.com/material-ui/api/bottom-navigation/)
 */
@JsName("default")
external val BottomNavigation: react.FC<BottomNavigationProps>
