@file:JsModule("react")

package react.raw

import js.promise.PromiseResult
import react.ActionStateInstance1
import react.ActionStateInstance2

external fun <S> useActionStateRaw(
    action: (state: S) -> PromiseResult<S>,
    initialState: S,
    permalink: String? = definedExternally,
): ActionStateInstance1<S>

external fun <S, P> useActionStateRaw(
    action: (state: S, payload: P) -> PromiseResult<S>,
    initialState: S,
    permalink: String? = definedExternally,
): ActionStateInstance2<S, P>
