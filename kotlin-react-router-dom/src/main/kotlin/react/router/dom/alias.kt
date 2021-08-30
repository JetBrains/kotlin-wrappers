package react.router.dom

import kotlinext.js.Record

typealias Params = Record<String, String>

typealias GetUserConfirmation = (message: String, callback: (Boolean) -> Unit) -> Unit
