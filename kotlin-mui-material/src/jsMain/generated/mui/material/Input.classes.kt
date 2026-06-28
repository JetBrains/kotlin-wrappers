// Automatically generated - do not modify!

@file:JsModule("@mui/material/Input")

package mui.material

import web.cssom.ClassName

sealed external interface InputClasses {
    /** Styles applied to the root element. */
    val root: ClassName

    /** Styles applied to the root element if the component is a descendant of `FormControl`. */
    val formControl: ClassName

    /** Styles applied to the root element if the component is focused. */
    val focused: ClassName

    /** Styles applied to the root element if `disabled={true}`. */
    val disabled: ClassName

    /** Styles applied to the root element if color secondary. */
    val colorSecondary: ClassName

    /** Styles applied to the root element unless `disableUnderline={true}`. */
    val underline: ClassName

    /** State class applied to the root element if `error={true}`. */
    val error: ClassName

    /** Styles applied to the input element if `size="small"`. */
    val sizeSmall: ClassName

    /** Styles applied to the root element if `multiline={true}`. */
    val multiline: ClassName

    /** Styles applied to the root element if `fullWidth={true}`. */
    val fullWidth: ClassName

    /** Styles applied to the input element. */
    val input: ClassName

    /** Styles applied to the input element if `size="small"`.
     * @deprecated Combine the [.MuiInputBase-input](/material-ui/api/input-base/#input-base-classes-MuiInputBase-input) and [.MuiInputBase-sizeSmall](/material-ui/api/input-base/#input-base-classes-MuiInputBase-sizeSmall) classes instead. See [Migrating from deprecated APIs](/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     */
    val inputSizeSmall: ClassName

    /** Styles applied to the input element if `multiline={true}`.
     * @deprecated Combine the [.MuiInputBase-input](/material-ui/api/input-base/#input-base-classes-MuiInputBase-input) and [.MuiInputBase-multiline](/material-ui/api/input-base/#input-base-classes-MuiInputBase-multiline) classes instead. See [Migrating from deprecated APIs](/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     */
    val inputMultiline: ClassName

    /** Styles applied to the input element if `startAdornment` is provided.
     * @deprecated Combine the [.MuiInputBase-input](/material-ui/api/input-base/#input-base-classes-MuiInputBase-input) and [.MuiInputBase-adornedStart](/material-ui/api/input-base/#input-base-classes-MuiInputBase-adornedStart) classes instead. See [Migrating from deprecated APIs](/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     */
    val inputAdornedStart: ClassName

    /** Styles applied to the input element if `endAdornment` is provided.
     * @deprecated Combine the [.MuiInputBase-input](/material-ui/api/input-base/#input-base-classes-MuiInputBase-input) and [.MuiInputBase-adornedEnd](/material-ui/api/input-base/#input-base-classes-MuiInputBase-adornedEnd) classes instead. See [Migrating from deprecated APIs](/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     */
    val inputAdornedEnd: ClassName

    /** Styles applied to the input element if `type="search"`. */
    val inputTypeSearch: ClassName
}

external val inputClasses: InputClasses
