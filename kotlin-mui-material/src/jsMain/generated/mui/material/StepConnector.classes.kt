// Automatically generated - do not modify!

@file:JsModule("@mui/material/StepConnector")

package mui.material

import web.cssom.ClassName

sealed external interface StepConnectorClasses {
    /** Styles applied to the root element. */
    val root: ClassName

    /** Styles applied to the root element if `orientation="horizontal"`. */
    val horizontal: ClassName

    /** Styles applied to the root element if `orientation="vertical"`. */
    val vertical: ClassName

    /** Styles applied to the root element if `alternativeLabel={true}`. */
    val alternativeLabel: ClassName

    /** State class applied to the root element if `active={true}`. */
    val active: ClassName

    /** State class applied to the root element if `completed={true}`. */
    val completed: ClassName

    /** State class applied to the root element if `disabled={true}`. */
    val disabled: ClassName

    /** Styles applied to the line element. */
    val line: ClassName

    /** Styles applied to the line element if `orientation="horizontal"`.
     * @deprecated Combine the [.MuiStepConnector-horizontal](/material-ui/api/step-connector/#step-connector-classes-horizontal) and [.MuiStepConnector-line](/material-ui/api/step-connector/#step-connector-classes-line) classes instead. See [Migrating from deprecated APIs](/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     */
    val lineHorizontal: ClassName

    /** Styles applied to the line element if `orientation="vertical"`.
     * @deprecated Combine the [.MuiStepConnector-vertical](/material-ui/api/step-connector/#step-connector-classes-vertical) and [.MuiStepConnector-line](/material-ui/api/step-connector/#step-connector-classes-line) classes instead. See [Migrating from deprecated APIs](/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     */
    val lineVertical: ClassName
}

external val stepConnectorClasses: StepConnectorClasses
