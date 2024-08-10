// Automatically generated - do not modify!

package js.decorators

import seskar.js.JsValue

sealed external interface DecoratorContextKind {
    companion object {
        @JsValue("class")
        val `class`: `class`

        @JsValue("method")
        val method: method

        @JsValue("getter")
        val getter: getter

        @JsValue("setter")
        val setter: setter

        @JsValue("accessor")
        val accessor: accessor

        @JsValue("field")
        val field: field
    }

    sealed interface `class` : DecoratorContextKind
    sealed interface method : DecoratorContextKind
    sealed interface getter : DecoratorContextKind
    sealed interface setter : DecoratorContextKind
    sealed interface accessor : DecoratorContextKind
    sealed interface field : DecoratorContextKind
}
