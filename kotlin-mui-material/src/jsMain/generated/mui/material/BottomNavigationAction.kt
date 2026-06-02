// Automatically generated - do not modify!

@file:JsModule("@mui/material/BottomNavigationAction")

@file:Suppress(
    "VAR_TYPE_MISMATCH_ON_OVERRIDE",
)

package mui.material

import mui.material.styles.Theme
import mui.system.PropsWithSx
import mui.system.SxProps
import mui.types.PropsWithComponent
import react.*
import react.dom.html.HTMLAttributes
import web.html.HTMLSpanElement

external interface BottomNavigationActionProps :
    BottomNavigationActionOwnProps,
    PropsWithComponent,
    ButtonBaseProps

external interface BottomNavigationActionSlots {
    /**
     * The component that renders the root.
     * @default ButtonBase
     */
    var root: ElementType<*>

    /**
     * The component that renders the label.
     * @default span
     */
    var label: ElementType<*>
}

external interface BottomNavigationActionSlotProps : Props {
    /** TS: SlotProps<React.ElementType<ButtonBaseProps>, {}, BottomNavigationActionOwnerState> */
    var root: ButtonBaseProps?

    /** TS: SlotProps<'span', {}, BottomNavigationActionOwnerState> */
    var label: HTMLAttributes<HTMLSpanElement>?
}

external interface BottomNavigationActionSlotsAndSlotProps : Props {
    var slots: BottomNavigationActionSlots?

    var slotProps: BottomNavigationActionSlotProps?
}

external interface BottomNavigationActionOwnProps :
    BottomNavigationActionSlotsAndSlotProps,
    PropsWithChildren,
    PropsWithSx,
    ButtonBaseProps {
    /**
     * This prop isn't supported.
     * Use the `component` prop if you need to change the children structure.
     */
    override var children: ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    override var classes: BottomNavigationActionClasses?

    /**
     * The icon to display.
     */
    var icon: ReactNode?

    /**
     * The label element.
     */
    var label: ReactNode?

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

external interface BottomNavigationActionOwnerState

/**
 *
 * Demos:
 *
 * - [Bottom Navigation](https://v6.mui.com/material-ui/react-bottom-navigation/)
 *
 * API:
 *
 * - [BottomNavigationAction API](https://v6.mui.com/material-ui/api/bottom-navigation-action/)
 * - inherits [ButtonBase API](https://v6.mui.com/material-ui/api/button-base/)
 */
@JsName("default")
external val BottomNavigationAction: FC<BottomNavigationActionProps>
