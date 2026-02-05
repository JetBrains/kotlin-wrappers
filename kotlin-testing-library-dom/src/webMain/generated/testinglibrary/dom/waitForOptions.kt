// Automatically generated - do not modify!

package testinglibrary.dom

import web.html.HTMLElement
import web.mutation.MutationObserverInit

external interface waitForOptions {
    var container: HTMLElement
    var timeout: Double?
    var interval: Double?
    var onTimeout: ((error: js.errors.JsError) -> js.errors.JsError)?
    var mutationObserverOptions: MutationObserverInit
}
