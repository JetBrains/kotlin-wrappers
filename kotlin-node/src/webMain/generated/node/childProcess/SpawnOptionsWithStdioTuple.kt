// Automatically generated - do not modify!

package node.childProcess

@js.objects.JsPlainObject
sealed external interface SpawnOptionsWithStdioTuple<Stdin : Any? /* StdioNull | StdioPipe */, Stdout : Any? /* StdioNull | StdioPipe */, Stderr : Any? /* StdioNull | StdioPipe */> :
    SpawnOptions {
    @JsName("stdio")
    var stdioTuple: js.array.Tuple3<Stdin, Stdout, Stderr>
}
