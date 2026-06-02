// Automatically generated - do not modify!

@file:JsModule("@mui/material/ListItemText")

package mui.material

import mui.material.styles.Theme
import mui.system.PropsWithSx
import mui.system.StandardProps
import mui.system.SxProps
import react.*
import react.dom.html.HTMLAttributes
import web.html.HTMLDivElement

external interface ListItemTextProps :
    StandardProps,
    HTMLAttributes<HTMLDivElement>,
    ListItemTextSlotsAndSlotProps,
    PropsWithChildren,
    PropsWithSx {
    /**
     * Alias for the `primary` prop.
     */
    override var children: ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: ListItemTextClasses?

    /**
     * If `true`, the children won't be wrapped by a Typography component.
     * This can be useful to render an alternative Typography variant by wrapping
     * the `children` (or `primary`) text, and optional `secondary` text
     * with the Typography component.
     * @default false
     */
    var disableTypography: Boolean?

    /**
     * If `true`, the children are indented.
     * This should be used if there is no left avatar or left icon.
     * @default false
     */
    var inset: Boolean?

    /**
     * The main content element.
     */
    var primary: ReactNode?

    /**
     * These props will be forwarded to the primary typography component
     * (as long as disableTypography is not `true`).
     * @deprecated Use `slotProps.primary` instead. This prop will be removed in v7. See [Migrating from deprecated APIs](/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     */
    var primaryTypographyProps: TypographyProps?

    /**
     * The secondary content element.
     */
    var secondary: ReactNode?

    /**
     * These props will be forwarded to the secondary typography component
     * (as long as disableTypography is not `true`).
     * @deprecated Use `slotProps.secondary` instead. This prop will be removed in v7. See [Migrating from deprecated APIs](/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     */
    var secondaryTypographyProps: TypographyProps?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

external interface ListItemTextSlots {
    /**
     * The component that renders the root slot.
     * @default 'div'
     */
    var root: ElementType<*>?

    /**
     * The component that renders the primary slot.
     * @default Typography
     */
    var primary: ElementType<*>?

    /**
     * The component that renders the secondary slot.
     * @default Typography
     */
    var secondary: ElementType<*>?
}

external interface ListItemTextSlotProps : Props {
    /** TS: SlotProps<'div', {}, ListItemTextOwnerState> */
    var root: HTMLAttributes<HTMLDivElement>?

    /** TS: SlotProps<React.ElementType<TypographyProps>, {}, ListItemTextOwnerState> */
    var primary: TypographyProps?

    /** TS: SlotProps<React.ElementType<TypographyProps>, {}, ListItemTextOwnerState> */
    var secondary: TypographyProps?
}

external interface ListItemTextSlotsAndSlotProps : Props {
    var slots: ListItemTextSlots?

    var slotProps: ListItemTextSlotProps?
}

external interface ListItemTextOwnerState

/**
 *
 * Demos:
 *
 * - [Lists](https://v6.mui.com/material-ui/react-list/)
 *
 * API:
 *
 * - [ListItemText API](https://v6.mui.com/material-ui/api/list-item-text/)
 */
@JsName("default")
external val ListItemText: FC<ListItemTextProps>
