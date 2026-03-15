package testing.library.dom

import js.reflect.Reflect
import web.dom.Node
import web.events.Event
import web.events.EventInstance
import web.events.EventType
import web.window.Window
import kotlin.reflect.KClass

inline fun <reified E : Event> fireEvent(
    instance: EventInstance<E, Node, *>,
): Boolean =
    fireEventInternal(instance, E::class)

inline fun <reified E : Event> fireEvent(
    instance: EventInstance<E, Window, *>,
): Boolean =
    fireEventInternal(instance, E::class)

@PublishedApi
internal fun <E : Event> fireEventInternal(
    instance: EventInstance<E, Node, *>,
    eventClass: KClass<E>,
): Boolean =
    fireEventRaw(
        instance.target as Node,
        createEvent(eventClass, instance.type),
    )

@PublishedApi
internal fun <E : Event> fireEventInternal(
    instance: EventInstance<E, Window, *>,
    eventClass: KClass<E>,
): Boolean =
    fireEventRaw(
        instance.target as Window,
        createEvent(eventClass, instance.type),
    )

private fun <E : Event> createEvent(
    klass: KClass<E>,
    type: EventType<E>,
): E =
    Reflect.construct(
        target = klass.js,
        argumentsList = arrayOf(type),
    )
