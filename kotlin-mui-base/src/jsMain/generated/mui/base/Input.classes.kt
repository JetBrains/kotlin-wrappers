// Automatically generated - do not modify!

package mui.base

import seskar.js.JsValue
import seskar.js.JsVirtual
import web.cssom.ClassName

@JsVirtual
sealed external interface InputClasses {
    companion object {
        /** Class name applied to the root element. */
        @JsValue("base-Input-root")
        val root: ClassName

        /** Class name applied to the root element if the component is a descendant of `FormControl`. */
        @JsValue("base-Input-formControl")
        val formControl: ClassName

        /** Class name applied to the root element if `startAdornment` is provided. */
        @JsValue("base-Input-adornedStart")
        val adornedStart: ClassName

        /** Class name applied to the root element if `endAdornment` is provided. */
        @JsValue("base-Input-adornedEnd")
        val adornedEnd: ClassName

        /** State class applied to the root element if the component is focused. */
        @JsValue("base-focused")
        val focused: ClassName

        /** State class applied to the root element if `disabled={true}`. */
        @JsValue("base-disabled")
        val disabled: ClassName

        /** State class applied to the root element if `error={true}`. */
        @JsValue("base-error")
        val error: ClassName

        /** Class name applied to the root element if `multiline={true}`. */
        @JsValue("base-Input-multiline")
        val multiline: ClassName

        /** Class name applied to the input element. */
        @JsValue("base-Input-input")
        val input: ClassName

        /** Class name applied to the input element if `multiline={true}`. */
        @JsValue("base-Input-inputMultiline")
        val inputMultiline: ClassName

        /** Class name applied to the input element if `type="search"`. */
        @JsValue("base-Input-inputTypeSearch")
        val inputTypeSearch: ClassName
    }
}
