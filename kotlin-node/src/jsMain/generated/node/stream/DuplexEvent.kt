// Generated by Karakum - do not modify it manually!

package node.stream


@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@seskar.js.JsVirtual
sealed external interface DuplexEvent : node.events.EventType {
    sealed interface CLOSE : DuplexEvent
    sealed interface DATA : DuplexEvent
    sealed interface DRAIN : DuplexEvent
    sealed interface END : DuplexEvent
    sealed interface ERROR : DuplexEvent
    sealed interface FINISH : DuplexEvent
    sealed interface PAUSE : DuplexEvent
    sealed interface PIPE : DuplexEvent
    sealed interface READABLE : DuplexEvent
    sealed interface RESUME : DuplexEvent
    sealed interface UNPIPE : DuplexEvent

    companion object {
        @seskar.js.JsValue("close")
        val CLOSE: CLOSE

        @seskar.js.JsValue("data")
        val DATA: DATA

        @seskar.js.JsValue("drain")
        val DRAIN: DRAIN

        @seskar.js.JsValue("end")
        val END: END

        @seskar.js.JsValue("error")
        val ERROR: ERROR

        @seskar.js.JsValue("finish")
        val FINISH: FINISH

        @seskar.js.JsValue("pause")
        val PAUSE: PAUSE

        @seskar.js.JsValue("pipe")
        val PIPE: PIPE

        @seskar.js.JsValue("readable")
        val READABLE: READABLE

        @seskar.js.JsValue("resume")
        val RESUME: RESUME

        @seskar.js.JsValue("unpipe")
        val UNPIPE: UNPIPE
    }
}
