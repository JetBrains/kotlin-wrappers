package node.childProcess

import node.stream.Readable
import node.stream.Writable

// return this object when stdio option is a tuple of 3

@Suppress("INTERFACE_WITH_SUPERCLASS")

sealed external interface ChildProcessByStdio<I : Writable?, O : Readable?, E : Readable?> : ChildProcess {
    @JsName("stdin")
    var boundStdin: I

    @JsName("stdout")
    var boundStdout: O

    @JsName("stderr")
    var boundStderr: E

    @JsName("stdio")
    val boundStdio: js.core.JsTuple5<I, O, E, Any? /* Readable | Writable | null | undefined */, // extra, no modification
            Any? /* Readable | Writable | null | undefined */// extra, no modification
            >
}
