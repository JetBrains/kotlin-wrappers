// Automatically generated - do not modify!

@file:JsModule("@mui/material/Paper")
@file:JsNonModule

package mui.material

import kotlinext.js.ReadonlyArray

external interface PaperProps :
    react.dom.html.HTMLAttributes<org.w3c.dom.HTMLDivElement>,
    react.PropsWithChildren {
    /**
     * The content of the component.
     */
    override var children: ReadonlyArray<react.ReactNode>?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: PaperClasses

    /**
     * Shadow depth, corresponds to `dp` in the spec.
     * It accepts values between 0 and 24 inclusive.
     * @default 1
     */
    var elevation: Number

    /**
     * If `true`, rounded corners are disabled.
     * @default false
     */
    var square: Boolean

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: mui.system.SxProps<mui.system.Theme>

    /**
     * The variant to use.
     * @default 'elevation'
     */
    var variant: mui.system.Union /* 'elevation' | 'outlined', PaperPropsVariantOverrides */
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
