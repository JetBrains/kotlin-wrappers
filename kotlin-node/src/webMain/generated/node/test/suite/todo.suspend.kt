// Automatically generated - do not modify!

package node.test.suite

import node.test.SuiteFn
import node.test.TestOptions

@seskar.js.JsAsync
external suspend fun todo(): js.core.Void

@seskar.js.JsAsync
external suspend fun todo(
    name: String = definedExternally,
    options: TestOptions = definedExternally,
    fn: SuiteFn = definedExternally,
): js.core.Void

@seskar.js.JsAsync
external suspend fun todo(
    name: String = definedExternally,
    fn: SuiteFn = definedExternally,
): js.core.Void

@seskar.js.JsAsync
external suspend fun todo(
    options: TestOptions = definedExternally,
    fn: SuiteFn = definedExternally,
): js.core.Void

@seskar.js.JsAsync
external suspend fun todo(fn: SuiteFn = definedExternally): js.core.Void
