package tanstack.router.core

import js.array.ReadonlyArray
import js.objects.JsPlainObject

@JsPlainObject
external interface ViewTransitionOptions {
    val types: ReadonlyArray<String> /*
    | ((locationChangeInfo: {
        fromLocation?: ParsedLocation;
        toLocation: ParsedLocation;
        pathChanged: boolean;
        hrefChanged: boolean;
        hashChanged: boolean;
    }) => Array<string> | false);
    */
}
