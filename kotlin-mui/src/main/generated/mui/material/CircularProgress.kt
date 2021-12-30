// Automatically generated - do not modify!

@file:JsModule("@mui/material/CircularProgress")
@file:JsNonModule

package mui.material

external interface CircularProgressProps :
    mui.system.StandardProps,
    react.dom.html.HTMLAttributes<org.w3c.dom.HTMLSpanElement> {
    /**
     * Override or extend the styles applied to the component.
     */
    var classes: CircularProgressClasses?

    /**
     * The color of the component. It supports those theme colors that make sense for this component.
     * @default 'primary'
     */
    var color: CircularProgressColor?

    /**
     * If `true`, the shrink animation is disabled.
     * This only works if variant is `indeterminate`.
     * @default false
     */
    var disableShrink: Boolean?

    /**
     * The size of the component.
     * If using a number, the pixel unit is assumed.
     * If using a string, you need to provide the CSS unit, e.g '3rem'.
     * @default 40
     */
    var size: dynamic

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: mui.system.SxProps<mui.system.Theme>?

    /**
     * The thickness of the circle.
     * @default 3.6
     */
    var thickness: Number?

    /**
     * The value of the progress indicator for the determinate variant.
     * Value between 0 and 100.
     * @default 0
     */
    var value: Number?

    /**
     * The variant to use.
     * Use indeterminate when there is no progress value.
     * @default 'indeterminate'
     */
    var variant: CircularProgressVariant?
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
 * - [CircularProgress API](https://mui.com/api/circular-progress/)
 */
@JsName("default")
external val CircularProgress: react.FC<CircularProgressProps>
