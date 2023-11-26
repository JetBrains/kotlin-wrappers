// Automatically generated - do not modify!

@file:JsModule("@tanstack/query-core")

package tanstack.query.core

abstract external class Removable {
    open var gcTime: JsDuration
    open fun destroy()
    protected open fun scheduleGc()
    protected open fun updateGcTime(newGcTime: JsDuration?)
    protected open fun clearGcTimeout()
    protected abstract fun optionalRemove()
}
