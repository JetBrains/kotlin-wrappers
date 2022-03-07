// Automatically generated - do not modify!

@file:JsModule("@mui/material/Paper")
@file:JsNonModule

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface PaperProps :
    react.dom.html.HTMLAttributes<org.w3c.dom.HTMLDivElement>,
    react.PropsWithChildren,
    mui.types.PropsWithComponent {
    /**
     * The content of the component.
     */
    override var children: react.ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: PaperClasses?

    /**
     * Shadow depth, corresponds to `dp` in the spec.
     * It accepts values between 0 and 24 inclusive.
     * @default 1
     */
    var elevation: Number?

    /**
     * If `true`, rounded corners are disabled.
     * @default false
     */
    var square: Boolean?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: SxProps<Theme>?

    /**
     * The variant to use.
     * @default 'elevation'
     */
    var variant: PaperVariant?
}

/**
 *
 * Demos:
 *
 * - [Cards](https://mui.com/components/cards/)
 * - [Paper](https://mui.com/components/paper/)
 *
 * API:
 *
 * - [Paper API](https://mui.com/api/paper/)
 */
@JsName("default")
external val Paper: react.FC<PaperProps>
