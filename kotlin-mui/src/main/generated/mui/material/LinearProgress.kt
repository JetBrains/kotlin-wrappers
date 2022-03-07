// Automatically generated - do not modify!

@file:JsModule("@mui/material/LinearProgress")
@file:JsNonModule

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface LinearProgressProps :
    mui.system.StandardProps,
    react.dom.html.HTMLAttributes<org.w3c.dom.HTMLSpanElement>,
    mui.system.PropsWithSx {
    /**
     * Override or extend the styles applied to the component.
     */
    var classes: LinearProgressClasses?

    /**
     * The color of the component. It supports those theme colors that make sense for this component.
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
 * - [Progress](https://mui.com/components/progress/)
 *
 * API:
 *
 * - [LinearProgress API](https://mui.com/api/linear-progress/)
 */
@JsName("default")
external val LinearProgress: react.FC<LinearProgressProps>
