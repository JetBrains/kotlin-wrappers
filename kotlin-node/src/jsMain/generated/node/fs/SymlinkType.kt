// Generated by Karakum - do not modify it manually!


package node.fs


@Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@seskar.js.JsVirtual
sealed external interface SymlinkType {
    companion object {
        @seskar.js.JsValue("dir")
        val dir: SymlinkType

        @seskar.js.JsValue("file")
        val file: SymlinkType

        @seskar.js.JsValue("junction")
        val junction: SymlinkType
    }
}
