@file:JsModule("react-dom")

package react.dom

import js.array.JsTuple3
import js.core.Void
import js.promise.Promise

external fun <State> useFormState(
    action: (state: State /* Awaited<State> */) -> Promise<State>,
    initialState: State, /* Awaited<State> */
    permalink: String?,
): JsTuple3</* state: */ State /* Awaited<State> */, /* dispatch: */ () -> Void, /* isPending: */ Boolean>

external fun <State, Payload> useFormState(
    action: (state: State /* Awaited<State> */, payload: Payload /* Awaited<Payload> */) -> Promise<State>,
    initialState: State, /* Awaited<State> */
    permalink: String?,
): JsTuple3</* state: */ State /* Awaited<State> */, /* dispatch: */ (payload: Payload) -> Void, /* isPending: */ Boolean>
