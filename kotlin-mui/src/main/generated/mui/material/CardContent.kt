// Automatically generated - do not modify!

@file:JsModule("@mui/material/CardContent")
@file:JsNonModule

package mui.material

external interface CardContentProps : react.PropsWithChildren {
    /**
     * The content of the component.
     */
    override var children: Array<out react.ReactNode>?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: CardContentClasses

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: SxProps<Theme>
}

/**
 *
 * Demos:
 *
 * - [Cards](https://mui.com/components/cards/)
 *
 * API:
 *
 * - [CardContent API](https://mui.com/api/card-content/)
 */
@JsName("default")
external val CardContent: react.FC<CardContentProps>
