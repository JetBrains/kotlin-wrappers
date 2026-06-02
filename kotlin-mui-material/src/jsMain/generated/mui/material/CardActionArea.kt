// Automatically generated - do not modify!

@file:JsModule("@mui/material/CardActionArea")

@file:Suppress(
    "VAR_TYPE_MISMATCH_ON_OVERRIDE",
)

package mui.material

import mui.material.styles.Theme
import mui.system.PropsWithSx
import mui.system.SxProps
import mui.types.PropsWithComponent
import react.ElementType
import react.FC
import react.Props
import react.dom.html.HTMLAttributes
import web.cssom.ClassName
import web.html.HTMLSpanElement

external interface CardActionAreaProps :
    CardActionAreaOwnProps,
    PropsWithComponent,
    ButtonBaseProps

external interface CardActionAreaSlots {
    /**
     * The component that renders the root.
     * @default ButtonBase
     */
    var root: ElementType<*>

    /**
     * The component that renders the focusHighlight.
     * @default span
     */
    var focusHighlight: ElementType<*>
}

external interface CardActionAreaSlotProps : Props {
    /** TS: SlotProps<React.ElementType<ButtonBaseProps>, {}, CardActionAreaOwnerState> */
    var root: ButtonBaseProps?

    /** TS: SlotProps<'span', {}, CardActionAreaOwnerState> */
    var focusHighlight: HTMLAttributes<HTMLSpanElement>?
}

external interface CardActionAreaSlotsAndSlotProps : Props {
    var slots: CardActionAreaSlots?

    var slotProps: CardActionAreaSlotProps?
}

external interface CardActionAreaOwnerState

external interface CardActionAreaOwnProps :
    PropsWithSx,
    ButtonBaseProps {
    /**
     * Override or extend the styles applied to the component.
     */
    override var classes: CardActionAreaClasses?

    override var focusVisibleClassName: ClassName?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

/**
 *
 * Demos:
 *
 * - [Card](https://v6.mui.com/material-ui/react-card/)
 *
 * API:
 *
 * - [CardActionArea API](https://v6.mui.com/material-ui/api/card-action-area/)
 * - inherits [ButtonBase API](https://v6.mui.com/material-ui/api/button-base/)
 */
@JsName("default")
external val CardActionArea: FC<CardActionAreaProps>
