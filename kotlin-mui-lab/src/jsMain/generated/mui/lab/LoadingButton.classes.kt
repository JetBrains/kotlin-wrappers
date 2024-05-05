// Automatically generated - do not modify!

@file:JsModule("@mui/lab/LoadingButton")

package mui.lab

import web.cssom.ClassName

sealed external interface LoadingButtonClasses {
    /** Styles applied to the root element. */
    val root: ClassName

    /** Styles applied to the root element if `loading={true}`. */
    val loading: ClassName

    /** Styles applied to the loadingIndicator element. */
    val loadingIndicator: ClassName

    /** Styles applied to the loadingIndicator element if `loadingPosition="center"`. */
    val loadingIndicatorCenter: ClassName

    /** Styles applied to the loadingIndicator element if `loadingPosition="start"`. */
    val loadingIndicatorStart: ClassName

    /** Styles applied to the loadingIndicator element if `loadingPosition="end"`. */
    val loadingIndicatorEnd: ClassName

    /** Styles applied to the endIcon element if `loading={true}` and `loadingPosition="end"`. */
    val endIconLoadingEnd: ClassName

    /** Styles applied to the startIcon element if `loading={true}` and `loadingPosition="start"`. */
    val startIconLoadingStart: ClassName
}

@JsName("default")
external val loadingButtonClasses: LoadingButtonClasses
