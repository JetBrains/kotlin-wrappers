@file:JsModule("react")

package react

import js.array.JsTuple3
import js.promise.PromiseResult

external fun <State> useActionState(
    action: (state: State) -> PromiseResult<State>,
    initialState: State,
    permalink: String? = definedExternally,
): JsTuple3<
        /* state: */ State,
        /* dispatch: */ () -> Unit,
        /* isPending: */ Boolean,
        >

external fun <State, Payload> useActionState(
    action: (state: State, payload: Payload) -> PromiseResult<State>,
    initialState: State,
    permalink: String? = definedExternally,
): JsTuple3<
        /* state: */ State,
        /* dispatch: */ (payload: Payload) -> Unit,
        /* isPending: */ Boolean,
        >
