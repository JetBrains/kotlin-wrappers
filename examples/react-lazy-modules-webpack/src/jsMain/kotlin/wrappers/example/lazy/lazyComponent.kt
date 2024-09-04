package wrappers.example.lazy

import js.objects.ReadonlyRecord
import js.promise.Promise
import react.ComponentModule
import react.ComponentType
import react.Props
import react.lazy as reactLazy

internal external interface ComponentProvider {
    fun get(): ComponentType<Props>
}

internal typealias ComponentRecord = ReadonlyRecord<String, ComponentProvider>

// TODO: plugin internals
internal fun lazyComponent(
    name: String,
    moduleFactory: () -> Promise<ComponentRecord>,
): ComponentType<Props> =
    reactLazy {
        moduleFactory()
            .then { it[name] }
            .then { requireNotNull(it) }
            .then { it.get() }
            .then { ComponentModule(it) }
    }
