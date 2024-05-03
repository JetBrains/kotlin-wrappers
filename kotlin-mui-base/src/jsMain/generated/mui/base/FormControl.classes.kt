// Automatically generated - do not modify!

package mui.base

import seskar.js.JsValue
import seskar.js.JsVirtual
import web.cssom.ClassName

@JsVirtual
sealed external interface FormControlClasses {
    companion object {
        /** Class applied to the root element. */
        @JsValue("base-FormControl-root")
        val root: ClassName

        /** State class applied to the root element if `disabled={true}`. */
        @JsValue("base-disabled")
        val disabled: ClassName

        /** State class applied to the root element if `error={true}`. */
        @JsValue("base-error")
        val error: ClassName

        /** State class applied to the root element if the inner input has value. */
        @JsValue("base-FormControl-filled")
        val filled: ClassName

        /** State class applied to the root element if the inner input is focused. */
        @JsValue("base-focused")
        val focused: ClassName

        /** State class applied to the root element if `required={true}`. */
        @JsValue("base-required")
        val required: ClassName
    }
}
