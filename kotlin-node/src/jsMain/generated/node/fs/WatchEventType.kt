// Generated by Karakum - do not modify it manually!


package node.fs


@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@seskar.js.JsVirtual
sealed external interface WatchEventType {
    companion object {
        @seskar.js.JsValue("rename")
        val rename: WatchEventType

        @seskar.js.JsValue("change")
        val change: WatchEventType
    }
}
