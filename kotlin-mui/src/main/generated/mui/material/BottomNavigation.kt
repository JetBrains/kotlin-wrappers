// Automatically generated - do not modify!

@file:JsModule("@mui/material/BottomNavigation")
@file:JsNonModule

package mui.material

external interface BottomNavigationProps : react.PropsWithChildren {
    /**
     * The content of the component.
     */
    override var children: Array<out react.ReactNode>?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: BottomNavigationClasses

    /**
     * Callback fired when the value changes.
     *
     * @param {React.SyntheticEvent} event The event source of the callback. **Warning**: This is a generic event not a change event.
     * @param {any} value We default to the index of the child.
     */
    var onChange: (event: react.dom.SyntheticEvent<*, *>, value: dynamic) -> Unit

    /**
     * If `true`, all `BottomNavigationAction`s will show their labels.
     * By default, only the selected `BottomNavigationAction` will show its label.
     * @default false
     */
    var showLabels: Boolean

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: SxProps<Theme>

    /**
     * The value of the currently selected `BottomNavigationAction`.
     */
    var value: Any
}

/**
 *
 * Demos:
 *
 * - [Bottom Navigation](https://mui.com/components/bottom-navigation/)
 *
 * API:
 *
 * - [BottomNavigation API](https://mui.com/api/bottom-navigation/)
 */
@JsName("default")
external val BottomNavigation: react.FC<BottomNavigationProps>
