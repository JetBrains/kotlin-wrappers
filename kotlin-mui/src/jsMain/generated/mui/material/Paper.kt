// Automatically generated - do not modify!

@file:JsModule("@mui/material/Paper")

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface PaperProps :
    PaperOwnProps,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    mui.types.PropsWithComponent

external interface PaperOwnProps :
    react.PropsWithChildren,
    mui.system.PropsWithSx {
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
    override var sx: SxProps<Theme>?

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
 * - [Card](https://mui.com/material-ui/react-card/)
 * - [Paper](https://mui.com/material-ui/react-paper/)
 *
 * API:
 *
 * - [Paper API](https://mui.com/material-ui/api/paper/)
 */
@JsName("default")
external val Paper: react.FC<PaperProps>
