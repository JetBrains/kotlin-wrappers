// Generated by Karakum - do not modify it manually!

package node.dns


@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@seskar.js.JsVirtual
sealed external interface GetDefaultResultOrderResult {
    companion object {
        @seskar.js.JsValue("ipv4first")
        val ipv4first: GetDefaultResultOrderResult

        @seskar.js.JsValue("verbatim")
        val verbatim: GetDefaultResultOrderResult
    }
}
