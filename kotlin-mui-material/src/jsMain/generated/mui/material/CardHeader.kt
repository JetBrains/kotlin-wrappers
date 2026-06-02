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

external interface CardHeaderSlotProps : Props {
    /** TS: SlotProps<'div', CardHeaderRootSlotPropsOverrides, CardHeaderOwnerState> */
    var root: HTMLAttributes<HTMLDivElement>?

    /** TS: SlotProps<'div', CardHeaderAvatarSlotPropsOverrides, CardHeaderOwnerState> */
    var avatar: HTMLAttributes<HTMLDivElement>?

    /** TS: SlotProps<'div', CardHeaderActionSlotPropsOverrides, CardHeaderOwnerState> */
    var action: HTMLAttributes<HTMLDivElement>?

    /** TS: SlotProps<'div', CardHeaderContentSlotPropsOverrides, CardHeaderOwnerState> */
    var content: HTMLAttributes<HTMLDivElement>?

    /** TS: SlotProps< React.ElementType<TypographyProps>, CardHeaderTitleSlotPropsOverrides, CardHeaderOwnerState > */
    var title: TypographyProps?

    /** TS: SlotProps< React.ElementType<TypographyProps>, CardHeaderSubheaderSlotPropsOverrides, CardHeaderOwnerState > */
    var subheader: TypographyProps?
}

external interface CardHeaderSlotsAndSlotProps : Props {
    var slots: CardHeaderSlots?

    var slotProps: CardHeaderSlotProps?
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
     * These props will be forwarded to the subheader
     * (as long as disableTypography is not `true`).
     * @deprecated Use `slotProps.subheader` instead. This prop will be removed in v7. See [Migrating from deprecated APIs](/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     */
    var subheaderTypographyProps: TypographyProps?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?

    /**
     * The content of the component.
     */
    override var title: ReactNode?

    /**
     * These props will be forwarded to the title
     * (as long as disableTypography is not `true`).
     * @deprecated Use `slotProps.title` instead. This prop will be removed in v7. See [Migrating from deprecated APIs](/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     */
    var titleTypographyProps: TypographyProps?
}

external interface CardHeaderOwnerState

/**
 *
 * Demos:
 *
 * - [Card](https://v6.mui.com/material-ui/react-card/)
 *
 * API:
 *
 * - [CardHeader API](https://v6.mui.com/material-ui/api/card-header/)
 */
@JsName("default")
external val CardHeader: FC<CardHeaderProps>
