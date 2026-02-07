// Automatically generated - do not modify!

package popper.core

import js.array.ReadonlyArray
import js.objects.Record
import kotlinx.js.JsPlainObject
import kotlin.js.JsAny
import kotlin.js.JsString

@JsPlainObject
external interface Modifier<Options : JsAny?> {
    val name: ModifierName<Options>
    val enabled: Boolean
    val phase: ModifierPhases?
    val requires: ReadonlyArray<JsString>?
    val requiresIfExists: ReadonlyArray<JsString>?
    val fn: ((ModifierArguments<Options>) -> State?)?
    val effect: ((ModifierArguments<Options>) -> (() -> Unit))?
    val options: Options?
    val data: Record<JsString, *>?
}
