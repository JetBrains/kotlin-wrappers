// Automatically generated - do not modify!

package node.test.suite

import node.test.SuiteFn
import node.test.TestOptions

@seskar.js.JsAsync
external suspend fun skip(
    name: String = definedExternally,
    options: TestOptions = definedExternally,
    fn: SuiteFn = definedExternally,
): js.core.Void

@seskar.js.JsAsync
external suspend fun skip(
    name: String = definedExternally,
    fn: SuiteFn = definedExternally,
): js.core.Void

@seskar.js.JsAsync
external suspend fun skip(
    options: TestOptions = definedExternally,
    fn: SuiteFn = definedExternally,
): js.core.Void

@seskar.js.JsAsync
external suspend fun skip(fn: SuiteFn = definedExternally): js.core.Void

@seskar.js.JsAsync
external suspend fun skip(): js.core.Void
