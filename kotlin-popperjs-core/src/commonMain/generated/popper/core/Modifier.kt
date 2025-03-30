// Automatically generated - do not modify!

package popper.core

import js.array.ReadonlyArray
import js.objects.JsPlainObject
import js.objects.Record

@JsPlainObject
external interface Modifier<Options> {
    val name: ModifierName<Options>
    val enabled: Boolean
    val phase: ModifierPhases
    val requires: ReadonlyArray<String>?
    val requiresIfExists: ReadonlyArray<String>?
    val fn: (ModifierArguments<Options>) -> State?
    val effect: (ModifierArguments<Options>) -> (() -> Unit)?
    val options: Options?
    val data: Record<String, *>?
}
