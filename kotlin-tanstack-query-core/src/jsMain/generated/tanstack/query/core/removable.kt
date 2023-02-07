// Automatically generated - do not modify!

@file:JsModule("@tanstack/query-core")
@file:JsNonModule

package tanstack.query.core

abstract external class Removable {
    open var cacheTime: JsDuration
    open fun destroy()
    protected open fun scheduleGc()
    protected open fun updateCacheTime(newCacheTime: JsDuration?)
    protected open fun clearGcTimeout()
    protected abstract fun optionalRemove()
}
