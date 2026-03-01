package floating.ui.core

import seskar.js.JsValue

sealed /* union */
external interface ElementContext {
    companion object {
        @JsValue("reference")
        val reference: RootBoundary

        @JsValue("floating")
        val floating: RootBoundary
    }
}
