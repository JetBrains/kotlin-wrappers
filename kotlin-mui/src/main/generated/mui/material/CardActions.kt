// Automatically generated - do not modify!

@file:JsModule("@mui/material/CardActions")
@file:JsNonModule

package mui.material

import kotlinext.js.ReadonlyArray

external interface CardActionsProps : react.PropsWithChildren {
    /**
     * The content of the component.
     */
    override var children: ReadonlyArray<react.ReactNode>?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: CardActionsClasses

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: mui.system.SxProps<mui.system.Theme>

    /**
     * If `true`, the actions do not have additional margin.
     * @default false
     */
    var disableSpacing: Boolean
}

/**
 *
 * Demos:
 *
 * - [Cards](https://mui.com/components/cards/)
 *
 * API:
 *
 * - [CardActions API](https://mui.com/api/card-actions/)
 */
@JsName("default")
external val CardActions: react.FC<CardActionsProps>
