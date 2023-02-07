// Automatically generated - do not modify!

@file:JsModule("@mui/material/Rating")
@file:JsNonModule

@file:Suppress(
    "VIRTUAL_MEMBER_HIDDEN",
)

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface RatingProps :
    mui.system.StandardProps,
    react.dom.html.HTMLAttributes<web.html.HTMLSpanElement>,
    mui.system.PropsWithSx {
    /**
     * Override or extend the styles applied to the component.
     */
    var classes: RatingClasses?

    /**
     * The default value. Use when the component is not controlled.
     * @default null
     */
    var defaultValue: Number?

    /**
     * If `true`, the component is disabled.
     * @default false
     */
    var disabled: Boolean?

    /**
     * The icon to display when empty.
     * @default <StarBorder fontSize="inherit" />
     */
    var emptyIcon: react.ReactNode?

    /**
     * The label read when the rating input is empty.
     * @default 'Empty'
     */
    var emptyLabelText: react.ReactNode?

    /**
     * Accepts a function which returns a string value that provides a user-friendly name for the current value of the rating.
     * This is important for screen reader users.
     *
     * For localization purposes, you can use the provided [translations](/material-ui/guides/localization/).
     * @param {number} value The rating label's value to format.
     * @returns {string}
     * @default function defaultLabelText(value) {
     *   return `${value} Star${value !== 1 ? 's' : ''}`;
     * }
     */
    var getLabelText: ((value: Number) -> String)?

    /**
     * If `true`, only the selected icon will be highlighted.
     * @default false
     */
    var highlightSelectedOnly: Boolean?

    /**
     * The icon to display.
     * @default <Star fontSize="inherit" />
     */
    var icon: react.ReactNode?

    /**
     * The component containing the icon.
     * @default function IconContainer(props) {
     *   const { value, ...other } = props;
     *   return <span {...other} />;
     * }
     */
    var IconContainerComponent: react.ElementType<IconContainerProps>?

    /**
     * Maximum rating.
     * @default 5
     */
    var max: Number?

    /**
     * The name attribute of the radio `input` elements.
     * This input `name` should be unique within the page.
     * Being unique within a form is insufficient since the `name` is used to generated IDs.
     */
    var name: String?

    /**
     * Callback fired when the value changes.
     * @param {React.SyntheticEvent} event The event source of the callback.
     * @param {number|null} value The new value.
     */
    var onChange: ((event: react.dom.events.SyntheticEvent<*, *>, value: Number?) -> Unit)?

    /**
     * Callback function that is fired when the hover state changes.
     * @param {React.SyntheticEvent} event The event source of the callback.
     * @param {number} value The new value.
     */
    var onChangeActive: ((event: react.dom.events.SyntheticEvent<*, *>, value: Number) -> Unit)?

    /**
     * The minimum increment value change allowed.
     * @default 1
     */
    var precision: Number?

    /**
     * Removes all hover effects and pointer events.
     * @default false
     */
    var readOnly: Boolean?

    /**
     * The size of the component.
     * @default 'medium'
     */
    var size: Size?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?

    /**
     * The rating value.
     */
    var value: Number?
}

external interface IconContainerProps :
    react.dom.html.HTMLAttributes<web.html.HTMLSpanElement> {
    var value: Number
}

/**
 *
 * Demos:
 *
 * - [Rating](https://mui.com/material-ui/react-rating/)
 *
 * API:
 *
 * - [Rating API](https://mui.com/material-ui/api/rating/)
 */
@JsName("default")
external val Rating: react.FC<RatingProps>
