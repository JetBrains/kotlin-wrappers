@file:JsModule("@tanstack/router-core")

package tanstack.router.core

import js.reflect.TypeGuard

external val isRedirect: TypeGuard<Any?, Redirect>
