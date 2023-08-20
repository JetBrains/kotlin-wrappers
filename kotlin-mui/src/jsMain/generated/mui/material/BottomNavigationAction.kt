// Automatically generated - do not modify!

@file:JsModule("@mui/material/BottomNavigationAction")

@file:Suppress(
    "VAR_TYPE_MISMATCH_ON_OVERRIDE",
)

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface BottomNavigationActionProps :
    react.PropsWithChildren,
    mui.system.PropsWithSx,
    mui.types.PropsWithComponent,
    ButtonBaseProps {
    /**
     * This prop isn't supported.
     * Use the `component` prop if you need to change the children structure.
     */
    override var children: react.ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    override var classes: BottomNavigationActionClasses?

    /**
     * The icon to display.
     */
    var icon: react.ReactNode?

    /**
     * The label element.
     */
    var label: react.ReactNode?

    /**
     * If `true`, the `BottomNavigationAction` will show its label.
     * By default, only the selected `BottomNavigationAction`
     * inside `BottomNavigation` will show its label.
     *
     * The prop defaults to the value (`false`) inherited from the parent BottomNavigation component.
     */
    var showLabel: Boolean?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?

    /**
     * You can provide your own value. Otherwise, we fallback to the child position index.
     */
    override var value: Any?
}

/**
 *
 * Demos:
 *
 * - [Bottom Navigation](https://mui.com/material-ui/react-bottom-navigation/)
 *
 * API:
 *
 * - [BottomNavigationAction API](https://mui.com/material-ui/api/bottom-navigation-action/)
 * - inherits [ButtonBase API](https://mui.com/material-ui/api/button-base/)
 */
@JsName("default")
external val BottomNavigationAction: react.FC<BottomNavigationActionProps>
