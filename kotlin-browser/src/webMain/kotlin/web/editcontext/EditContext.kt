package web.editcontext

import js.array.ReadonlyArray
import web.events.EventHandler
import web.events.EventInstance
import web.events.EventTarget
import web.experimental.ExperimentalWebApi
import web.geometry.DOMRect
import web.html.HTMLElement
import web.input.CompositionEvent

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EditContext)
 */
@ExperimentalWebApi
open external class EditContext(
    options: EditContextInit = definedExternally,
) : EventTarget {

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EditContext/updateText)
     */
    open fun updateText(
        rangeStart: Int,
        rangeEnd: Int,
        text: String,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EditContext/updateSelection)
     */
    open fun updateSelection(
        start: Int,
        end: Int,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EditContext/updateControlBounds)
     */
    open fun updateControlBounds(controlBounds: DOMRect)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EditContext/updateSelectionBounds)
     */
    open fun updateSelectionBounds(selectionBounds: DOMRect)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EditContext/updateCharacterBounds)
     */
    open fun updateCharacterBounds(
        rangeStart: Int,
        characterBounds: ReadonlyArray<DOMRect>,
    )

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EditContext/attachedElements)
     */
    open fun attachedElements(): ReadonlyArray<HTMLElement>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EditContext/text)
     */
    open val text: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EditContext/selectionStart)
     */
    open val selectionStart: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EditContext/selectionEnd)
     */
    open val selectionEnd: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EditContext/characterBoundsRangeStart)
     */
    open val characterBoundsRangeStart: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EditContext/characterBounds)
     */
    open fun characterBounds(): ReadonlyArray<DOMRect>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EditContext/textupdate_event)
     */
    open val ontextupdate: EventHandler<TextUpdateEvent, EditContext, EditContext>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EditContext/textformatupdate_event)
     */
    open val ontextformatupdate: EventHandler<TextFormatUpdateEvent, EditContext, EditContext>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EditContext/characterboundsupdate_event)
     */
    open val oncharacterboundsupdate: EventHandler<CharacterBoundsUpdateEvent, EditContext, EditContext>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EditContext/compositionstart_event)
     */
    open val oncompositionstart: EventHandler<CompositionEvent, EditContext, EditContext>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EditContext/compositionend_event)
     */
    open val oncompositionend: EventHandler<CompositionEvent, EditContext, EditContext>
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
