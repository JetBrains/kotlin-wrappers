@file:JsModule("react")

package react

import js.promise.PromiseResult

external fun <S> useActionState(
    action: (state: S) -> PromiseResult<S>,
    initialState: S,
    permalink: String? = definedExternally,
): ActionStateInstance1<S>

external fun <S, P> useActionState(
    action: (state: S, payload: P) -> PromiseResult<S>,
    initialState: S,
    permalink: String? = definedExternally,
): ActionStateInstance2<S, P>
