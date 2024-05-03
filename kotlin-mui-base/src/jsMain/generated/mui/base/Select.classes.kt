// Automatically generated - do not modify!

package mui.base

import seskar.js.JsValue
import seskar.js.JsVirtual
import web.cssom.ClassName

@JsVirtual
sealed external interface SelectClasses {
    companion object {
        /** Class name applied to the root element. */
        @JsValue("base-Select-root")
        val root: ClassName

        /** Class name applied to the listbox element. */
        @JsValue("base-Select-listbox")
        val listbox: ClassName

        /** Class name applied to the popper element. */
        @JsValue("base-Select-popup")
        val popup: ClassName

        /** State class applied to the root `button` element if `active={true}`. */
        @JsValue("base-active")
        val active: ClassName

        /** State class applied to the root `button` element if `expanded={true}`. */
        @JsValue("base-expanded")
        val expanded: ClassName

        /** State class applied to the root `button` element and the listbox 'ul' element if `disabled={true}`. */
        @JsValue("base-disabled")
        val disabled: ClassName

        /** State class applied to the root `button` element if `focusVisible={true}`. */
        @JsValue("base-focusVisible")
        val focusVisible: ClassName
    }
}
