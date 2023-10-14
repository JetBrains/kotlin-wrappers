package node.readline


typealias AsyncCompleter = (line: String, callback: (err: Throwable /* JsError */? /* use undefined for default */, result: CompleterResult? /* use undefined for default */) -> Unit) -> Unit
