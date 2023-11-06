// Automatically generated - do not modify!

@file:JsModule("@mui/material/LinearProgress")

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface LinearProgressProps :
    mui.system.StandardProps,
    react.dom.html.HTMLAttributes<web.html.HTMLSpanElement>,
    mui.system.PropsWithSx {
    /**
     * Override or extend the styles applied to the component.
     */
    var classes: LinearProgressClasses?

    /**
     * The color of the component.
     * It supports both default and custom theme colors, which can be added as shown in the
     * [palette customization guide](https://mui.com/material-ui/customization/palette/#adding-new-colors).
     * @default 'primary'
     */
    var color: LinearProgressColor?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?

    /**
     * The value of the progress indicator for the determinate and buffer variants.
     * Value between 0 and 100.
     */
    var value: Number?

    /**
     * The value for the buffer variant.
     * Value between 0 and 100.
     */
    var valueBuffer: Number?

    /**
     * The variant to use.
     * Use indeterminate or query when there is no progress value.
     * @default 'indeterminate'
     */
    var variant: LinearProgressVariant?
}

/**
 * ## ARIA
 *
 * If the progress bar is describing the loading progress of a particular region of a page,
 * you should use `aria-describedby` to point to the progress bar, and set the `aria-busy`
 * attribute to `true` on that region until it has finished loading.
 *
 * Demos:
 *
 * - [Progress](https://mui.com/material-ui/react-progress/)
 *
 * API:
 *
 * - [LinearProgress API](https://mui.com/material-ui/api/linear-progress/)
 */
@JsName("default")
external val LinearProgress: react.FC<LinearProgressProps>
