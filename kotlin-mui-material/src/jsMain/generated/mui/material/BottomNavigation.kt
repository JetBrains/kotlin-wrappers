// Automatically generated - do not modify!

@file:JsModule("@mui/material/BottomNavigation")

package mui.material

import mui.material.styles.Theme
import mui.system.PropsWithSx
import mui.system.SxProps
import mui.types.PropsWithComponent
import react.FC
import react.PropsWithChildren
import react.ReactNode
import react.dom.events.SyntheticEvent
import react.dom.html.HTMLAttributes
import web.html.HTMLDivElement

external interface BottomNavigationProps :
    BottomNavigationOwnProps,
    HTMLAttributes<HTMLDivElement>,
    PropsWithComponent

external interface BottomNavigationOwnProps :
    PropsWithChildren,
    PropsWithSx {
    /**
     * The content of the component.
     */
    override var children: ReactNode?

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
    var onChange: ((event: SyntheticEvent<*, *>, value: Any) -> Unit)?

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
 * - [Bottom Navigation](https://v6.mui.com/material-ui/react-bottom-navigation/)
 *
 * API:
 *
 * - [BottomNavigation API](https://v6.mui.com/material-ui/api/bottom-navigation/)
 */
@JsName("default")
external val BottomNavigation: FC<BottomNavigationProps>
