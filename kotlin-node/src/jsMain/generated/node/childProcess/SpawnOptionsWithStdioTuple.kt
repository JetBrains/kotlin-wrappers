// Generated by Karakum - do not modify it manually!

package node.childProcess

@kotlinx.js.JsPlainObject
sealed external interface SpawnOptionsWithStdioTuple<Stdin : Any? /* StdioNull | StdioPipe */, Stdout : Any? /* StdioNull | StdioPipe */, Stderr : Any? /* StdioNull | StdioPipe */> :
    SpawnOptions {
    @JsName("stdio")
    var stdioTuple: js.array.JsTuple3<Stdin, Stdout, Stderr>
}
