// Automatically generated - do not modify!

package web.idb

import web.events.EventHandler

sealed external class IDBOpenDBRequest :
    IDBRequest<IDBDatabase> {
    var onblocked: EventHandler<IDBVersionChangeEvent>?
    var onupgradeneeded: EventHandler<IDBVersionChangeEvent>?
}
