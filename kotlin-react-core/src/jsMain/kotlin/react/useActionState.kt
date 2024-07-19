@file:JsModule("react")

package react

import js.array.JsTuple3
import js.promise.PromiseResult

external fun <S> useActionState(
    action: (state: S) -> PromiseResult<S>,
    initialState: S,
    permalink: String? = definedExternally,
): JsTuple3<
        /* state: */ S,
        /* dispatch: */ () -> Unit,
        /* isPending: */ Boolean,
        >

external fun <S, P> useActionState(
    action: (state: S, payload: P) -> PromiseResult<S>,
    initialState: S,
    permalink: String? = definedExternally,
): JsTuple3<
        /* state: */ S,
        /* dispatch: */ (payload: P) -> Unit,
        /* isPending: */ Boolean,
        >
