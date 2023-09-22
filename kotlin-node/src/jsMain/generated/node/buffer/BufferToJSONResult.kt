package node.buffer


sealed external interface BufferToJSONResult {
    var type: String /* 'Buffer' */
    var data: js.core.ReadonlyArray<Double>
}
