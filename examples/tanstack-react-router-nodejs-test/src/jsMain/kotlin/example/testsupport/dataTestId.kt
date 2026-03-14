package example.testsupport

import react.dom.html.HTMLAttributes

var HTMLAttributes<*>.dataTestId: String?
    get() = asDynamic()["data-testid"]
    set(value) {
        asDynamic()["data-testid"] = value
    }
