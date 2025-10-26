package web.editcontext

import js.array.ReadonlyArray
import web.events.EventHandler
import web.events.EventInstance
import web.events.EventTarget
import web.experimental.ExperimentalWebApi
import web.geometry.DOMRect
import web.html.HTMLElement
import web.input.CompositionEvent
import kotlin.js.definedExternally

@ExperimentalWebApi
open external class EditContext(
    options: EditContextInit = definedExternally,
) : EventTarget {

    fun updateText(
        rangeStart: Int,
        rangeEnd: Int,
        text: String,
    )

    fun updateSelection(
        start: Int,
        end: Int,
    )

    fun updateControlBounds(controlBounds: DOMRect)

    fun updateSelectionBounds(selectionBounds: DOMRect)

    fun updateCharacterBounds(
        rangeStart: Int,
        characterBounds: ReadonlyArray<DOMRect>,
    )

    fun attachedElements(): ReadonlyArray<HTMLElement>

    val text: String
    val selectionStart: Int
    val selectionEnd: Int
    val characterBoundsRangeStart: Int
    fun characterBounds(): ReadonlyArray<DOMRect>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EditContext/textupdate_event)
     */
    val ontextupdate: EventHandler<TextUpdateEvent, EditContext, EditContext>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EditContext/textformatupdate_event)
     */
    val ontextformatupdate: EventHandler<TextFormatUpdateEvent, EditContext, EditContext>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EditContext/characterboundsupdate_event)
     */
    val oncharacterboundsupdate: EventHandler<CharacterBoundsUpdateEvent, EditContext, EditContext>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EditContext/compositionstart_event)
     */
    val oncompositionstart: EventHandler<CompositionEvent, EditContext, EditContext>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EditContext/compositionend_event)
     */
    val oncompositionend: EventHandler<CompositionEvent, EditContext, EditContext>
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EditContext/textupdate_event)
 */
@ExperimentalWebApi
inline val <C : EditContext> C.textUpdateEvent: EventInstance<TextUpdateEvent, C, C>
    get() = EventInstance(this, "textupdate")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EditContext/textformatupdate_event)
 */
@ExperimentalWebApi
inline val <C : EditContext> C.textFormatUpdateEvent: EventInstance<TextFormatUpdateEvent, C, C>
    get() = EventInstance(this, "textformatupdate")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EditContext/characterboundsupdate_event)
 */
@ExperimentalWebApi
inline val <C : EditContext> C.characterBoundsUpdateEvent: EventInstance<CharacterBoundsUpdateEvent, C, C>
    get() = EventInstance(this, "characterboundsupdate")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EditContext/compositionstart_event)
 */
@ExperimentalWebApi
inline val <C : EditContext> C.compositionStartEvent: EventInstance<CompositionEvent, C, C>
    get() = EventInstance(this, "compositionstart")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EditContext/compositionend_event)
 */
@ExperimentalWebApi
inline val <C : EditContext> C.compositionEndEvent: EventInstance<CompositionEvent, C, C>
    get() = EventInstance(this, "compositionend")
