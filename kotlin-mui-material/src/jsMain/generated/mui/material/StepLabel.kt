// Automatically generated - do not modify!

@file:JsModule("@mui/material/StepLabel")

package mui.material

import mui.material.styles.Theme
import mui.system.PropsWithSx
import mui.system.StandardProps
import mui.system.SxProps
import react.*
import react.dom.html.HTMLAttributes
import web.html.HTMLDivElement
import web.html.HTMLSpanElement

external interface StepLabelProps :
    StandardProps,
    HTMLAttributes<HTMLDivElement>,
    StepLabelSlotsAndSlotProps,
    PropsWithChildren,
    PropsWithSx {
    /**
     * In most cases will simply be a string containing a title for the label.
     */
    override var children: ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: StepLabelClasses?

    /**
     * If `true`, the step is marked as failed.
     * @default false
     */
    var error: Boolean?

    /**
     * Override the default label of the step icon.
     */
    var icon: ReactNode?

    /**
     * The optional node to display.
     */
    var optional: ReactNode?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

external interface StepLabelSlots {
    /**
     * The component that renders the root.
     * @default span
     */
    var root: ElementType<*>

    /**
     * The component that renders the label.
     * @default span
     */
    var label: ElementType<*>

    /**
     * The component to render in place of the [`StepIcon`](https://mui.com/material-ui/api/step-icon/).
     */
    var stepIcon: ElementType<*>
}

external interface StepLabelSlotProps : Props {
    /** TS: SlotProps<'span', {}, StepLabelOwnerState> */
    var root: HTMLAttributes<HTMLSpanElement>?

    /** TS: SlotProps<'span', {}, StepLabelOwnerState> */
    var label: HTMLAttributes<HTMLSpanElement>?

    /** TS: SlotProps<React.ElementType<StepIconProps>, {}, StepLabelOwnerState> */
    var stepIcon: StepIconProps?
}

external interface StepLabelSlotsAndSlotProps : Props {
    var slots: StepLabelSlots?

    var slotProps: StepLabelSlotProps?
}

external interface StepLabelOwnerState

/**
 *
 * Demos:
 *
 * - [Stepper](https://v7.mui.com/material-ui/react-stepper/)
 *
 * API:
 *
 * - [StepLabel API](https://v7.mui.com/material-ui/api/step-label/)
 */
@JsName("default")
external val StepLabel: FC<StepLabelProps>
