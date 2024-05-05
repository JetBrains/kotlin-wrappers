// Automatically generated - do not modify!

@file:JsModule("@mui/base/Input")

package mui.base

import web.cssom.ClassName

sealed external interface InputClasses {
    /** Class name applied to the root element. */
    val root: ClassName

    /** Class name applied to the root element if the component is a descendant of `FormControl`. */
    val formControl: ClassName

    /** Class name applied to the root element if `startAdornment` is provided. */
    val adornedStart: ClassName

    /** Class name applied to the root element if `endAdornment` is provided. */
    val adornedEnd: ClassName

    /** State class applied to the root element if the component is focused. */
    val focused: ClassName

    /** State class applied to the root element if `disabled={true}`. */
    val disabled: ClassName

    /** State class applied to the root element if `error={true}`. */
    val error: ClassName

    /** Class name applied to the root element if `multiline={true}`. */
    val multiline: ClassName

    /** Class name applied to the input element. */
    val input: ClassName

    /** Class name applied to the input element if `multiline={true}`. */
    val inputMultiline: ClassName

    /** Class name applied to the input element if `type="search"`. */
    val inputTypeSearch: ClassName
}

external val inputClasses: InputClasses
