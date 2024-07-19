@file:JsModule("react")

package react

import js.array.JsTuple3
import js.promise.PromiseResult

external fun <State> useActionState(
    action: (state: /* awaited */ State) -> PromiseResult<State>,
    initialState: /* awaited */ State,
    permalink: String? = definedExternally,
): JsTuple3<
        /* state: */ /* awaited */ State,
        /* dispatch: */ () -> Unit,
        /* isPending: */ Boolean,
        >

external fun <State, Payload> useActionState(
    action: (state: /* awaited */ State, payload: Payload) -> PromiseResult<State>,
    initialState: /* awaited */ State,
    permalink: String? = definedExternally,
): JsTuple3<
        /* state: */ /* awaited */ State,
        /* dispatch: */ (payload: Payload) -> Unit,
        /* isPending: */ Boolean,
        >
