// Automatically generated - do not modify!

@file:JsModule("@mui/material/Chip")

package mui.material

import web.cssom.ClassName

sealed external interface ChipClasses {
    /** Styles applied to the root element. */
    val root: ClassName

    /** Styles applied to the root element if `size="small"`. */
    val sizeSmall: ClassName

    /** Styles applied to the root element if `size="medium"`. */
    val sizeMedium: ClassName

    /** Styles applied to the root element if `color="default"`. */
    val colorDefault: ClassName

    /** Styles applied to the root element if `color="error"`. */
    val colorError: ClassName

    /** Styles applied to the root element if `color="info"`. */
    val colorInfo: ClassName

    /** Styles applied to the root element if `color="primary"`. */
    val colorPrimary: ClassName

    /** Styles applied to the root element if `color="secondary"`. */
    val colorSecondary: ClassName

    /** Styles applied to the root element if `color="success"`. */
    val colorSuccess: ClassName

    /** Styles applied to the root element if `color="warning"`. */
    val colorWarning: ClassName

    /** State class applied to the root element if `disabled={true}`. */
    val disabled: ClassName

    /** Styles applied to the root element if `onClick` is defined or `clickable={true}`. */
    val clickable: ClassName

    /** Styles applied to the root element if `onClick` and `color="primary"` is defined or `clickable={true}`.
     * @deprecated Combine the [.MuiChip-clickable](/material-ui/api/chip/#chip-classes-clickable) and [.MuiChip-colorPrimary](/material-ui/api/chip/#chip-classes-colorPrimary) classes instead. See [Migrating from deprecated APIs](/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     */
    val clickableColorPrimary: ClassName

    /** Styles applied to the root element if `onClick` and `color="secondary"` is defined or `clickable={true}`.
     * @deprecated Combine the [.MuiChip-clickable](/material-ui/api/chip/#chip-classes-clickable) and [.MuiChip-colorSecondary](/material-ui/api/chip/#chip-classes-colorSecondary) classes instead. See [Migrating from deprecated APIs](/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     */
    val clickableColorSecondary: ClassName

    /** Styles applied to the root element if `onDelete` is defined. */
    val deletable: ClassName

    /** Styles applied to the root element if `onDelete` and `color="primary"` is defined.
     * @deprecated Combine the [.MuiChip-deletable](/material-ui/api/chip/#chip-classes-deletable) and [.MuiChip-colorPrimary](/material-ui/api/chip/#chip-classes-colorPrimary) classes instead. See [Migrating from deprecated APIs](/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     */
    val deletableColorPrimary: ClassName

    /** Styles applied to the root element if `onDelete` and `color="secondary"` is defined.
     * @deprecated Combine the [.MuiChip-deletable](/material-ui/api/chip/#chip-classes-deletable) and [.MuiChip-colorSecondary](/material-ui/api/chip/#chip-classes-colorSecondary) classes instead. See [Migrating from deprecated APIs](/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     */
    val deletableColorSecondary: ClassName

    /** Styles applied to the root element if `variant="outlined"`. */
    val outlined: ClassName

    /** Styles applied to the root element if `variant="filled"`. */
    val filled: ClassName

    /** Styles applied to the root element if `variant="outlined"` and `color="primary"`.
     * @deprecated Combine the [.MuiChip-outlined](/material-ui/api/chip/#chip-classes-outlined) and [.MuiChip-colorPrimary](/material-ui/api/chip/#chip-classes-colorPrimary) classes instead. See [Migrating from deprecated APIs](/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     */
    val outlinedPrimary: ClassName

    /** Styles applied to the root element if `variant="outlined"` and `color="secondary"`.
     * @deprecated Combine the [.MuiChip-outlined](/material-ui/api/chip/#chip-classes-outlined) and [.MuiChip-colorSecondary](/material-ui/api/chip/#chip-classes-colorSecondary) classes instead. See [Migrating from deprecated APIs](/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     */
    val outlinedSecondary: ClassName

    /** Styles applied to the root element if `variant="filled"` and `color="primary"`.
     * @deprecated Combine the [.MuiChip-filled](/material-ui/api/chip/#chip-classes-filled) and [.MuiChip-colorPrimary](/material-ui/api/chip/#chip-classes-colorPrimary) classes instead. See [Migrating from deprecated APIs](/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     */
    val filledPrimary: ClassName

    /** Styles applied to the root element if `variant="filled"` and `color="secondary"`.
     * @deprecated Combine the [.MuiChip-filled](/material-ui/api/chip/#chip-classes-filled) and [.MuiChip-colorSecondary](/material-ui/api/chip/#chip-classes-colorSecondary) classes instead. See [Migrating from deprecated APIs](/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     */
    val filledSecondary: ClassName

    /** Styles applied to the avatar element. */
    val avatar: ClassName

    /** Styles applied to the avatar element if `size="small"`.
     * @deprecated Combine the [.MuiChip-avatar](/material-ui/api/chip/#chip-classes-avatar) and [.MuiChip-sizeSmall](/material-ui/api/chip/#chip-classes-sizeSmall) classes instead. See [Migrating from deprecated APIs](/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     */
    val avatarSmall: ClassName

    /** Styles applied to the avatar element if `size="medium"`.
     * @deprecated Combine the [.MuiChip-avatar](/material-ui/api/chip/#chip-classes-avatar) and [.MuiChip-sizeMedium](/material-ui/api/chip/#chip-classes-sizeMedium) classes instead. See [Migrating from deprecated APIs](/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     */
    val avatarMedium: ClassName

    /** Styles applied to the avatar element if `color="primary"`.
     * @deprecated Combine the [.MuiChip-avatar](/material-ui/api/chip/#chip-classes-avatar) and [.MuiChip-colorPrimary](/material-ui/api/chip/#chip-classes-colorPrimary) classes instead. See [Migrating from deprecated APIs](/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     */
    val avatarColorPrimary: ClassName

    /** Styles applied to the avatar element if `color="secondary"`.
     * @deprecated Combine the [.MuiChip-avatar](/material-ui/api/chip/#chip-classes-avatar) and [.MuiChip-colorSecondary](/material-ui/api/chip/#chip-classes-colorSecondary) classes instead. See [Migrating from deprecated APIs](/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     */
    val avatarColorSecondary: ClassName

    /** Styles applied to the icon element. */
    val icon: ClassName

    /** Styles applied to the icon element if `size="small"`.
     * @deprecated Combine the [.MuiChip-icon](/material-ui/api/chip/#chip-classes-icon) and [.MuiChip-sizeSmall](/material-ui/api/chip/#chip-classes-sizeSmall) classes instead. See [Migrating from deprecated APIs](/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     */
    val iconSmall: ClassName

    /** Styles applied to the icon element if `size="medium"`.
     * @deprecated Combine the [.MuiChip-icon](/material-ui/api/chip/#chip-classes-icon) and [.MuiChip-sizeMedium](/material-ui/api/chip/#chip-classes-sizeMedium) classes instead. See [Migrating from deprecated APIs](/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     */
    val iconMedium: ClassName

    /** Styles applied to the icon element if `color="primary"`.
     * @deprecated Combine the [.MuiChip-icon](/material-ui/api/chip/#chip-classes-icon) and [.MuiChip-colorPrimary](/material-ui/api/chip/#chip-classes-colorPrimary) classes instead. See [Migrating from deprecated APIs](/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     */
    val iconColorPrimary: ClassName

    /** Styles applied to the icon element if `color="secondary"`.
     * @deprecated Combine the [.MuiChip-icon](/material-ui/api/chip/#chip-classes-icon) and [.MuiChip-colorSecondary](/material-ui/api/chip/#chip-classes-colorSecondary) classes instead. See [Migrating from deprecated APIs](/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     */
    val iconColorSecondary: ClassName

    /** Styles applied to the label `span` element. */
    val label: ClassName

    /** Styles applied to the label `span` element if `size="small"`.
     * @deprecated Combine the [.MuiChip-label](/material-ui/api/chip/#chip-classes-label) and [.MuiChip-sizeSmall](/material-ui/api/chip/#chip-classes-sizeSmall) classes instead. See [Migrating from deprecated APIs](/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     */
    val labelSmall: ClassName

    /** Styles applied to the label `span` element if `size="medium"`.
     * @deprecated Combine the [.MuiChip-label](/material-ui/api/chip/#chip-classes-label) and [.MuiChip-sizeMedium](/material-ui/api/chip/#chip-classes-sizeMedium) classes instead. See [Migrating from deprecated APIs](/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     */
    val labelMedium: ClassName

    /** Styles applied to the deleteIcon element. */
    val deleteIcon: ClassName

    /** Styles applied to the deleteIcon element if `size="small"`.
     * @deprecated Combine the [.MuiChip-deleteIcon](/material-ui/api/chip/#chip-classes-deleteIcon) and [.MuiChip-sizeSmall](/material-ui/api/chip/#chip-classes-sizeSmall) classes instead. See [Migrating from deprecated APIs](/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     */
    val deleteIconSmall: ClassName

    /** Styles applied to the deleteIcon element if `size="medium"`.
     * @deprecated Combine the [.MuiChip-deleteIcon](/material-ui/api/chip/#chip-classes-deleteIcon) and [.MuiChip-sizeMedium](/material-ui/api/chip/#chip-classes-sizeMedium) classes instead. See [Migrating from deprecated APIs](/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     */
    val deleteIconMedium: ClassName

    /** Styles applied to the deleteIcon element if `color="primary"`.
     * @deprecated Combine the [.MuiChip-deleteIcon](/material-ui/api/chip/#chip-classes-deleteIcon) and [.MuiChip-colorPrimary](/material-ui/api/chip/#chip-classes-colorPrimary) classes instead. See [Migrating from deprecated APIs](/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     */
    val deleteIconColorPrimary: ClassName

    /** Styles applied to the deleteIcon element if `color="secondary"`.
     * @deprecated Combine the [.MuiChip-deleteIcon](/material-ui/api/chip/#chip-classes-deleteIcon) and [.MuiChip-colorSecondary](/material-ui/api/chip/#chip-classes-colorSecondary) classes instead. See [Migrating from deprecated APIs](/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     */
    val deleteIconColorSecondary: ClassName

    /** Styles applied to the deleteIcon element if `color="primary"` and `variant="outlined"`.
     * @deprecated Combine the [.MuiChip-deleteIcon](/material-ui/api/chip/#chip-classes-deleteIcon) , [.MuiChip-outlined](/material-ui/api/chip/#chip-classes-outlined) and [.MuiChip-colorPrimary](/material-ui/api/chip/#chip-classes-colorPrimary) classes instead. See [Migrating from deprecated APIs](/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     */
    val deleteIconOutlinedColorPrimary: ClassName

    /** Styles applied to the deleteIcon element if `color="secondary"` and `variant="outlined"`.
     * @deprecated Combine the [.MuiChip-deleteIcon](/material-ui/api/chip/#chip-classes-deleteIcon) , [.MuiChip-outlined](/material-ui/api/chip/#chip-classes-outlined) and [.MuiChip-colorSecondary](/material-ui/api/chip/#chip-classes-colorSecondary) classes instead. See [Migrating from deprecated APIs](/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     */
    val deleteIconOutlinedColorSecondary: ClassName

    /** Styles applied to the deleteIcon element if `color="primary"` and `variant="filled"`.
     * @deprecated Combine the [.MuiChip-deleteIcon](/material-ui/api/chip/#chip-classes-deleteIcon) , [.MuiChip-filled](/material-ui/api/chip/#chip-classes-filled) and [.MuiChip-colorPrimary](/material-ui/api/chip/#chip-classes-colorPrimary) classes instead. See [Migrating from deprecated APIs](/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     */
    val deleteIconFilledColorPrimary: ClassName

    /** Styles applied to the deleteIcon element if `color="secondary"` and `variant="filled"`.
     * @deprecated Combine the [.MuiChip-deleteIcon](/material-ui/api/chip/#chip-classes-deleteIcon) , [.MuiChip-filled](/material-ui/api/chip/#chip-classes-filled) and [.MuiChip-colorSecondary](/material-ui/api/chip/#chip-classes-colorSecondary) classes instead. See [Migrating from deprecated APIs](/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     */
    val deleteIconFilledColorSecondary: ClassName

    /** State class applied to the root element if keyboard focused. */
    val focusVisible: ClassName
}

external val chipClasses: ChipClasses
