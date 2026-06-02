// Automatically generated - do not modify!

@file:JsModule("@mui/material/ToggleButtonGroup")

package mui.material

import web.cssom.ClassName

sealed external interface ToggleButtonGroupClasses {
    /** Styles applied to the root element. */
    val root: ClassName

    /** State class applied to the root element if `selected={true}`. */
    val selected: ClassName

    /** Styles applied to the root element if `orientation="horizontal"`. */
    val horizontal: ClassName

    /** Styles applied to the root element if `orientation="vertical"`. */
    val vertical: ClassName

    /** State class applied to the root element if `disabled={true}`. */
    val disabled: ClassName

    /** Styles applied to the children. */
    val grouped: ClassName

    /** Styles applied to the children if `orientation="horizontal"`.
     *  @deprecated Combine the [.MuiToggleButtonGroup-horizontal](/material-ui/api/toggle-button-group/#toggle-button-group-classes-horizontal) and [.MuiToggleButtonGroup-grouped](/material-ui/api/toggle-button-group/#toggle-button-group-classes-grouped) classes instead. See [Migrating from deprecated APIs](/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     */
    val groupedHorizontal: ClassName

    /** Styles applied to the children if `orientation="vertical"`.
     * @deprecated Combine the [.MuiToggleButtonGroup-vertical](/material-ui/api/toggle-button-group/#toggle-button-group-classes-vertical) and [.MuiToggleButtonGroup-grouped](/material-ui/api/toggle-button-group/#toggle-button-group-classes-grouped) classes instead. See [Migrating from deprecated APIs](/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     */
    val groupedVertical: ClassName

    /** Styles applied to the root element if `fullWidth={true}`. */
    val fullWidth: ClassName

    /** Styles applied to the first button in the toggle button group. */
    val firstButton: ClassName

    /** Styles applied to the last button in the toggle button group. */
    val lastButton: ClassName

    /** Styles applied to buttons in the middle of the toggle button group. */
    val middleButton: ClassName
}

external val toggleButtonGroupClasses: ToggleButtonGroupClasses
