package wrappers.example.lazy

import js.objects.ReadonlyRecord
import js.promise.Promise
import react.ComponentModule
import react.ComponentType
import react.Props
import react.lazy as reactLazy

private typealias ComponentRecord = ReadonlyRecord<String, ComponentType<Props>>

// TODO: plugin internals
internal fun lazyComponent(
    name: String,
    moduleFactory: () -> Promise<ComponentRecord>,
): ComponentType<Props> =
    reactLazy {
        moduleFactory()
            .then { it[name] }
            .then { requireNotNull(it) }
            .then { ComponentModule(it) }
    }
