// Automatically generated - do not modify!

@file:JsModule("@mui/material/Backdrop")

package mui.material

import mui.material.styles.Theme
import mui.material.transitions.TransitionProps
import mui.system.PropsWithSx
import mui.system.SxProps
import mui.types.PropsWithComponent
import react.*
import react.dom.html.HTMLAttributes
import web.html.HTMLDivElement

external interface BackdropProps :
    BackdropOwnProps,
    HTMLAttributes<HTMLDivElement>,
    PropsWithComponent

external interface BackdropSlots {
    /**
     * The component that renders the root.
     * @default 'div'
     */
    var root: ElementType<*>

    /**
     * The component that renders the transition.
     * [Follow this guide](https://mui.com/material-ui/transitions/#transitioncomponent-prop) to learn more about the requirements for this component.
     * @default Fade
     */
    var transition: ElementType<*>
}

external interface BackdropComponentsPropsOverrides

external interface BackdropTransitionSlotPropsOverrides

external interface BackdropSlotProps : Props {
    /** TS: SlotProps<'div', BackdropComponentsPropsOverrides, BackdropOwnerState> */
    var root: HTMLAttributes<HTMLDivElement>?

    /** TS: SlotComponentProps< React.ElementType, TransitionProps & BackdropTransitionSlotPropsOverrides, BackdropOwnerState > */
    var transition: TransitionProps?
}

external interface BackdropSlotsAndSlotProps : Props {
    var slots: BackdropSlots?

    var slotProps: BackdropSlotProps?
}

external interface BackdropOwnProps :
    FadeProps,
    BackdropSlotsAndSlotProps,
    PropsWithChildren,
    PropsWithSx {
    /**
     * The content of the component.
     */
    override var children: ReactNode?

    /**
     * The components used for each slot inside.
     *
     * @deprecated Use the `slots` prop instead. This prop will be removed in v7. See [Migrating from deprecated APIs](https://mui.com/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     *
     * @default {}
     */
    var components: Components?

    interface Components {
        var Root: ElementType<*>?
    }

    /**
     * The extra props for the slot components.
     * You can override the existing props or add new ones.
     *
     * @deprecated Use the `slotProps` prop instead. This prop will be removed in v7. See [Migrating from deprecated APIs](https://mui.com/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     *
     * @default {}
     */
    var componentsProps: ComponentsProps?

    interface ComponentsProps {
        var root: Props? /* React.HTMLAttributes<HTMLDivElement> & BackdropComponentsPropsOverrides */
    }

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: BackdropClasses?

    /**
     * If `true`, the backdrop is invisible.
     * It can be used when rendering a popover or a custom select component.
     * @default false
     */
    var invisible: Boolean?

    /**
     * If `true`, the component is shown.
     */
    var open: Boolean

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?

    /**
     * The duration for the transition, in milliseconds.
     * You may specify a single timeout for all transitions, or individually with an object.
     */
    var transitionDuration: Any? /* TransitionProps['timeout'] */

    /**
     * The component used for the transition.
     * [Follow this guide](https://mui.com/material-ui/transitions/#transitioncomponent-prop) to learn more about the requirements for this component.
     * @default Fade
     * @deprecated Use `slots.transition` instead. This prop will be removed in v7. See [Migrating from deprecated APIs](/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     */
    var TransitionComponent: ComponentType<*>?
}

external interface BackdropOwnerState

/**
 *
 * Demos:
 *
 * - [Backdrop](https://v6.mui.com/material-ui/react-backdrop/)
 *
 * API:
 *
 * - [Backdrop API](https://v6.mui.com/material-ui/api/backdrop/)
 * - inherits [Fade API](https://v6.mui.com/material-ui/api/fade/)
 */
@JsName("default")
external val Backdrop: FC<BackdropProps>
