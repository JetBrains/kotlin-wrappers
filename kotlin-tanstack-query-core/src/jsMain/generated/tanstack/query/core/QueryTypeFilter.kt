// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package tanstack.query.core

import seskar.js.JsUnion
import seskar.js.JsValue

@JsUnion
sealed external interface QueryTypeFilter {
    companion object {
        @JsValue("all")
        val all: QueryTypeFilter

        @JsValue("active")
        val active: QueryTypeFilter

        @JsValue("inactive")
        val inactive: QueryTypeFilter
    }
}
