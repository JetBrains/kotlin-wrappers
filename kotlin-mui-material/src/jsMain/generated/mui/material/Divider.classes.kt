// Automatically generated - do not modify!

@file:JsModule("@mui/material/Divider")

package mui.material

import web.cssom.ClassName

sealed external interface DividerClasses {
    /** Styles applied to the root element. */
    val root: ClassName

    /** Styles applied to the root element if `absolute={true}`. */
    val absolute: ClassName

    /** Styles applied to the root element if `variant="inset"`. */
    val inset: ClassName

    /** Styles applied to the root element if `variant="fullWidth"`. */
    val fullWidth: ClassName

    /** Styles applied to the root element if `light={true}`.
     * @deprecated
     */
    val light: ClassName

    /** Styles applied to the root element if `variant="middle"`. */
    val middle: ClassName

    /** Styles applied to the root element if `orientation="vertical"`. */
    val vertical: ClassName

    /** Styles applied to the root element if `flexItem={true}`. */
    val flexItem: ClassName

    /** Styles applied to the root element if divider have text. */
    val withChildren: ClassName

    /** Styles applied to the root element if divider have text and `orientation="vertical"`.
     * @deprecated Combine the [.MuiDivider-withChildren](/material-ui/api/divider/#divider-classes-withChildren) and [.MuiDivider-vertical](/material-ui/api/divider/#divider-classes-vertical) classes instead.
     */
    val withChildrenVertical: ClassName

    /** Styles applied to the root element if `textAlign="right" orientation="horizontal"`. */
    val textAlignRight: ClassName

    /** Styles applied to the root element if `textAlign="left" orientation="horizontal"`. */
    val textAlignLeft: ClassName

    /** Styles applied to the span children element if `orientation="horizontal"`. */
    val wrapper: ClassName

    /** Styles applied to the span children element if `orientation="vertical"`. */
    val wrapperVertical: ClassName
}

@JsName("default")
external val dividerClasses: DividerClasses
