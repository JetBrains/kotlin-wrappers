// Automatically generated - do not modify!

@file:JsModule("@mui/material/Card")
@file:JsNonModule

package mui.material

external interface CardProps :
    react.dom.html.HTMLAttributes<org.w3c.dom.HTMLDivElement> {
    /**
     * Override or extend the styles applied to the component.
     */
    var classes: CardClasses

    /**
     * If `true`, the card will use raised styling.
     * @default false
     */
    var raised: Boolean

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: mui.system.SxProps<mui.system.Theme>
}

/**
 *
 * Demos:
 *
 * - [Cards](https://mui.com/components/cards/)
 *
 * API:
 *
 * - [Card API](https://mui.com/api/card/)
 * - inherits [Paper API](https://mui.com/api/paper/)
 */

@JsName("default")
external val Card: react.FC<CardProps>
