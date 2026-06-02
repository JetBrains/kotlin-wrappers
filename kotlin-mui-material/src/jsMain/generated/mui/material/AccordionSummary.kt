// Automatically generated - do not modify!

@file:JsModule("@mui/material/AccordionSummary")

package mui.material

import mui.material.styles.Theme
import mui.system.PropsWithSx
import mui.system.SxProps
import mui.types.PropsWithComponent
import react.*
import react.dom.html.HTMLAttributes
import web.html.HTMLDivElement

external interface AccordionSummaryProps :
    AccordionSummaryOwnProps,
    HTMLAttributes<HTMLDivElement>,
    PropsWithComponent

external interface AccordionSummarySlots {
    /**
     * The component that renders the root slot.
     * @default ButtonBase
     */
    var root: ElementType<*>

    /**
     * The component that renders the content slot.
     * @default div
     */
    var content: ElementType<*>

    /**
     * The component that renders the expand icon wrapper slot.
     * @default div
     */
    var expandIconWrapper: ElementType<*>
}

external interface AccordionSummarySlotProps : Props {
    /** TS: SlotProps< React.ElementType<ButtonBaseProps>, AccordionSummaryRootSlotPropsOverrides, AccordionSummaryOwnerState > */
    var root: ButtonBaseProps?

    /** TS: SlotProps< 'div', AccordionSummaryContentSlotPropsOverrides, AccordionSummaryOwnerState > */
    var content: HTMLAttributes<HTMLDivElement>?

    /** TS: SlotProps< 'div', AccordionSummaryExpandIconWrapperSlotPropsOverrides, AccordionSummaryOwnerState > */
    var expandIconWrapper: HTMLAttributes<HTMLDivElement>?
}

external interface AccordionSummarySlotsAndSlotProps : Props {
    var slots: AccordionSummarySlots?

    var slotProps: AccordionSummarySlotProps?
}

external interface AccordionSummaryOwnProps :
    AccordionSummarySlotsAndSlotProps,
    PropsWithChildren,
    PropsWithSx {
    override var children: ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: AccordionSummaryClasses?

    /**
     * The icon to display as the expand indicator.
     */
    var expandIcon: ReactNode?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

external interface AccordionSummaryOwnerState

/**
 *
 * Demos:
 *
 * - [Accordion](https://v6.mui.com/material-ui/react-accordion/)
 *
 * API:
 *
 * - [AccordionSummary API](https://v6.mui.com/material-ui/api/accordion-summary/)
 * - inherits [ButtonBase API](https://v6.mui.com/material-ui/api/button-base/)
 */
@JsName("default")
external val AccordionSummary: FC<AccordionSummaryProps>
