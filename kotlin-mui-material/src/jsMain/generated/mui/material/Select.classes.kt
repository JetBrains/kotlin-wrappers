// Automatically generated - do not modify!

@file:JsModule("@mui/material/Select")

package mui.material

import web.cssom.ClassName

sealed external interface SelectClasses {
    /** Styles applied to the root element. */
    val root: ClassName

    /** Styles applied to the select component `select` class. */
    val select: ClassName

    /** Styles applied to the select component if `multiple={true}`. */
    val multiple: ClassName

    /** Styles applied to the select component if `variant="filled"`. */
    val filled: ClassName

    /** Styles applied to the select component if it is focused. */
    val focused: ClassName

    /** Styles applied to the select component if `variant="outlined"`. */
    val outlined: ClassName

    /** Styles applied to the select component if `variant="standard"`. */
    val standard: ClassName

    /** State class applied to the select component `disabled` class. */
    val disabled: ClassName

    /** Styles applied to the icon component. */
    val icon: ClassName

    /** Styles applied to the icon component if the popup is open. */
    val iconOpen: ClassName

    /** Styles applied to the icon component if `variant="filled"`.
     * @deprecated Combine the [.MuiSelect-icon](/material-ui/api/select/#select-classes-icon) and [.MuiSelect-filled](/material-ui/api/select/#select-classes-filled) classes instead. See [Migrating from deprecated APIs](/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     */
    val iconFilled: ClassName

    /** Styles applied to the icon component if `variant="outlined"`.
     * @deprecated Combine the [.MuiSelect-icon](/material-ui/api/select/#select-classes-icon) and [.MuiSelect-outlined](/material-ui/api/select/#select-classes-outlined) classes instead. See [Migrating from deprecated APIs](/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     */
    val iconOutlined: ClassName

    /** Styles applied to the icon component if `variant="standard"`.
     * @deprecated Combine the [.MuiSelect-icon](/material-ui/api/select/#select-classes-icon) and [.MuiSelect-standard](/material-ui/api/select/#select-classes-standard) classes instead. See [Migrating from deprecated APIs](/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     */
    val iconStandard: ClassName

    /** Styles applied to the underlying native input component. */
    val nativeInput: ClassName

    /** State class applied to the root element if `error={true}`. */
    val error: ClassName
}

external val selectClasses: SelectClasses
