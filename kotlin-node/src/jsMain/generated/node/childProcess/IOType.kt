// Generated by Karakum - do not modify it manually!

package node.childProcess

sealed external interface IOType {
    companion object {
        @seskar.js.JsValue("overlapped")
        val overlapped: IOType

        @seskar.js.JsValue("pipe")
        val pipe: IOType

        @seskar.js.JsValue("ignore")
        val ignore: IOType

        @seskar.js.JsValue("inherit")
        val inherit: IOType
    }
}
