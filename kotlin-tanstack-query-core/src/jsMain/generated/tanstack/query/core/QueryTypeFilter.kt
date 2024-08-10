// Automatically generated - do not modify!

package tanstack.query.core

import seskar.js.JsValue

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
