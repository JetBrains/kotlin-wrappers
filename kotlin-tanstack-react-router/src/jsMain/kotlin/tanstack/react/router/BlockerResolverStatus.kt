package tanstack.react.router

import seskar.js.JsValue

sealed /* union */
external interface BlockerResolverStatus {
    companion object {
        @JsValue("blocked")
        val blocked: BlockerResolverStatus

        @JsValue("idle")
        val idle: BlockerResolverStatus
    }
}
