// Automatically generated - do not modify!

@file:JsModule("@mui/material/Radio")
@file:JsNonModule

@file:Suppress(
    "VIRTUAL_MEMBER_HIDDEN",
)

package mui.material

external interface RadioProps :
    mui.system.StandardProps,
    SwitchBaseProps {
    /**
     * The icon to display when the component is checked.
     * @default <RadioButtonIcon checked />
     */
    var checkedIcon: react.ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: RadioClasses?

    /**
     * The color of the component. It supports those theme colors that make sense for this component.
     * @default 'primary'
     */
    var color: RadioColor?

    /**
     * If `true`, the component is disabled.
     */
    var disabled: Boolean?

    /**
     * The icon to display when the component is unchecked.
     * @default <RadioButtonIcon />
     */
    var icon: react.ReactNode?

    /**
     * The size of the component.
     * `small` is equivalent to the dense radio styling.
     * @default 'medium'
     */
    var size: BaseSize?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: mui.system.SxProps<mui.system.Theme>?
}

/**
 *
 * Demos:
 *
 * - [Radio Buttons](https://mui.com/components/radio-buttons/)
 *
 * API:
 *
 * - [Radio API](https://mui.com/api/radio/)
 * - inherits [ButtonBase API](https://mui.com/api/button-base/)
 */
@JsName("default")
external val Radio: react.FC<RadioProps>
