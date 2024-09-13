package node.fs

import js.buffer.ArrayBufferView
import js.reflect.upcast
import node.buffer.Buffer

suspend fun writeFileTest() {
    val buffer = Buffer.from("no ambiguous")

    writeFile(
        "my-path",
        buffer.upcast<ArrayBufferView>(),
    )
}
