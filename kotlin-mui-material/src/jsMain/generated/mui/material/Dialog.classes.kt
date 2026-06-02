// Automatically generated - do not modify!

@file:JsModule("@mui/material/Dialog")

package mui.material

import web.cssom.ClassName

sealed external interface DialogClasses {
    /** Styles applied to the root element. */
    val root: ClassName

    /** Styles applied to the container element if `scroll="paper"`. */
    val scrollPaper: ClassName

    /** Styles applied to the container element if `scroll="body"`. */
    val scrollBody: ClassName

    /** Styles applied to the container element. */
    val container: ClassName

    /** Styles applied to the Paper component. */
    val paper: ClassName

    /** Styles applied to the Paper component if `scroll="paper"`.
     * @deprecated Combine the [.MuiDialog-paper](/material-ui/api/dialog/#dialog-classes-paper) and [.MuiDialog-scrollPaper](/material-ui/api/dialog/#dialog-classes-scrollPaper) classes instead. See [Migrating from deprecated APIs](/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     */
    val paperScrollPaper: ClassName

    /** Styles applied to the Paper component if `scroll="body"`.
     * @deprecated Combine the [.MuiDialog-paper](/material-ui/api/dialog/#dialog-classes-paper) and [.MuiDialog-scrollBody](/material-ui/api/dialog/#dialog-classes-scrollBody) classes instead. See [Migrating from deprecated APIs](/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     */
    val paperScrollBody: ClassName

    /** Styles applied to the Paper component if `maxWidth=false`. */
    val paperWidthFalse: ClassName

    /** Styles applied to the Paper component if `maxWidth="xs"`. */
    val paperWidthXs: ClassName

    /** Styles applied to the Paper component if `maxWidth="sm"`. */
    val paperWidthSm: ClassName

    /** Styles applied to the Paper component if `maxWidth="md"`. */
    val paperWidthMd: ClassName

    /** Styles applied to the Paper component if `maxWidth="lg"`. */
    val paperWidthLg: ClassName

    /** Styles applied to the Paper component if `maxWidth="xl"`. */
    val paperWidthXl: ClassName

    /** Styles applied to the Paper component if `fullWidth={true}`. */
    val paperFullWidth: ClassName

    /** Styles applied to the Paper component if `fullScreen={true}`. */
    val paperFullScreen: ClassName
}

external val dialogClasses: DialogClasses
