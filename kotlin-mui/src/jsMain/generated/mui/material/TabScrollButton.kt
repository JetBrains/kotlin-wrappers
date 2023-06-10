// Automatically generated - do not modify!

@file:JsModule("@mui/material/TabScrollButton")
@file:JsNonModule

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface TabScrollButtonProps :
    mui.system.StandardProps,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    react.PropsWithChildren,
    mui.system.PropsWithSx {
    /**
     * The content of the component.
     */
    override var children: react.ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: TabScrollButtonClasses?

    /**
     * The components used for each slot inside.
     * @default {}
     */
    var slots: Slots?

    interface Slots {
        var StartScrollButtonIcon: react.ElementType<*>?
        var EndScrollButtonIcon: react.ElementType<*>?
    }

    /**
     * The extra props for the slot components.
     * You can override the existing props or add new ones.
     * @default {}
     */
    var slotProps: SlotProps?

    interface SlotProps {
        var startScrollButtonIcon: react.Props? /* SlotComponentProps<
  typeof SvgIcon,
  TabScrollButtonStartIconSlotPropsOverrides,
  TabScrollButtonOwnerState
> */
        var endScrollButtonIcon: react.Props? /* SlotComponentProps<
  typeof SvgIcon,
  TabScrollButtonEndIconSlotPropsOverrides,
  TabScrollButtonOwnerState
> */
    }

    /**
     * The direction the button should indicate.
     */
    var direction: TabScrollButtonDirection

    /**
     * If `true`, the component is disabled.
     * @default false
     */
    var disabled: Boolean?

    /**
     * The component orientation (layout flow direction).
     */
    var orientation: Orientation

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

external interface TabScrollButtonOwnerState {
    var isRtl: Boolean
}

/**
 *
 * Demos:
 *
 * - [Tabs](https://mui.com/material-ui/react-tabs/)
 *
 * API:
 *
 * - [TabScrollButton API](https://mui.com/material-ui/api/tab-scroll-button/)
 */
@JsName("default")
external val TabScrollButton: react.FC<TabScrollButtonProps>
