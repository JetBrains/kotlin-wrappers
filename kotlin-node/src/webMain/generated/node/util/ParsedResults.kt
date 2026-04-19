// Automatically generated - do not modify!

package node.util

// If ParseArgsConfig extends T, then the user passed config constructed elsewhere.
// So we can't rely on the `"not definitely present" implies "definitely not present"` assumption mentioned above.
external interface ParsedResults<T : ParseArgsConfig> {
    var values:
            js.objects.ReadonlyRecord<String, Any? /* undefined | string | boolean | Array<string | boolean> */>
    var positionals: js.array.ReadonlyArray<String>
    var tokens: js.array.ReadonlyArray<Token>?
}
