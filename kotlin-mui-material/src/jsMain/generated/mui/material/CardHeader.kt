// Automatically generated - do not modify!

@file:JsModule("@mui/material/CardHeader")

@file:Suppress(
    "VAR_TYPE_MISMATCH_ON_OVERRIDE",
)

package mui.material

import mui.material.styles.Theme
import mui.system.PropsWithSx
import mui.system.SxProps
import react.ElementType
import react.FC
import react.Props
import react.ReactNode
import react.dom.html.HTMLAttributes
import web.html.HTMLDivElement

external interface CardHeaderProps :
    CardHeaderOwnProps,
    CardHeaderSlotsAndSlotProps,
    HTMLAttributes<HTMLDivElement>

external interface CardHeaderSlots {
    /**
     * The component that renders the root slot.
     * @default 'div'
     */
    var root: ElementType<*>

    /**
     * The component that renders the avatar slot.
     * @default 'div'
     */
    var avatar: ElementType<*>

    /**
     * The component that renders the action slot.
     * @default 'div'
     */
    var action: ElementType<*>

    /**
     * The component that renders the content slot.
     * @default 'div'
     */
    var content: ElementType<*>

    /**
     * The component that renders the title slot (as long as disableTypography is not `true`).
     * [Follow this guide](https://mui.com/material-ui/api/typography/#props) to learn more about the requirements for this component.
     * @default Typography
     */
    var title: ElementType<*>

    /**
     * The component that renders the subheader slot (as long as disableTypography is not `true`).
     * [Follow this guide](https://mui.com/material-ui/api/typography/#props) to learn more about the requirements for this component.
     * @default Typography
     */
    var subheader: ElementType<*>
}

external interface CardHeaderSlotsAndSlotProps : Props {
    var slots: CardHeaderSlots?

    var slotProps: Props?
}

external interface CardHeaderOwnProps :
    PropsWithSx,
    HTMLAttributes<HTMLDivElement> {
    /**
     * The action to display in the card header.
     */
    var action: ReactNode?

    /**
     * The Avatar element to display.
     */
    var avatar: ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: CardHeaderClasses?

    /**
     * If `true`, `subheader` and `title` won't be wrapped by a Typography component.
     * This can be useful to render an alternative Typography variant by wrapping
     * the `title` text, and optional `subheader` text
     * with the Typography component.
     * @default false
     */
    var disableTypography: Boolean?

    /**
     * The content of the component.
     */
    var subheader: ReactNode?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?

    /**
     * The content of the component.
     */
    override var title: ReactNode?
}

external interface CardHeaderOwnerState

/**
 *
 * Demos:
 *
 * - [Card](https://mui.com/material-ui/react-card/)
 *
 * API:
 *
 * - [CardHeader API](https://mui.com/material-ui/api/card-header/)
 */
@JsName("default")
external val CardHeader: FC<CardHeaderProps>
