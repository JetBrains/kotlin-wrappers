package react.dom

import js.objects.jso
import kotlinx.html.INPUT
import kotlinx.html.TEXTAREA
import kotlinx.html.Tag
import kotlin.reflect.KProperty

private val events = listOf(
    "onCopy",
    "onCut",
    "onPaste",
    "onCompositionEnd",
    "onCompositionStart",
    "onCompositionUpdate",
    "onKeyDown",
    "onKeyPress",
    "onKeyUp",
    "onFocus",
    "onBlur",
    "onChange",
    "onInput",
    "onInvalid",
    "onReset",
    "onSubmit",
    "onClick",
    "onContextMenu",
    "onDoubleClick",
    "onDrag",
    "onDragEnd",
    "onDragEnter",
    "onDragExit",
    "onDragLeave",
    "onDragOver",
    "onDragStart",
    "onDrop",
    "onMouseDown",
    "onMouseEnter",
    "onMouseLeave",
    "onMouseMove",
    "onMouseOut",
    "onMouseOver",
    "onMouseUp",
    "onPointerDown",
    "onPointerMove",
    "onPointerUp",
    "onPointerCancel",
    "onGotPointerCapture",
    "onLostPointerCapture",
    "onPointerEnter",
    "onPointerLeave",
    "onPointerOver",
    "onPointerOut",
    "onSelect",
    "onTouchCancel",
    "onTouchEnd",
    "onTouchMove",
    "onTouchStart",
    "onScroll",
    "onWheel",
    "onAbort",
    "onCanPlay",
    "onCanPlayThrough",
    "onDurationChange",
    "onEmptied",
    "onEncrypted",
    "onEnded",
    "onError",
    "onLoadedData",
    "onLoadedMetadata",
    "onLoadStart",
    "onPause",
    "onPlay",
    "onPlaying",
    "onProgress",
    "onRateChange",
    "onSeeked",
    "onSeeking",
    "onStalled",
    "onSuspend",
    "onTimeUpdate",
    "onVolumeChange",
    "onWaiting",
    "onLoad",
    "onError",
    "onAnimationStart",
    "onAnimationEnd",
    "onAnimationIteration",
    "onTransitionEnd",
    "onToggle",

    // HTML attributes
    "accept",
    "acceptCharset",
    "accessKey",
    "action",
    "allowFullScreen",
    "alt",
    "async",
    "autoComplete",
    "autoFocus",
    "autoPlay",
    "capture",
    "cellPadding",
    "cellSpacing",
    "challenge",
    "charSet",
    "checked",
    "cite",
    "classID",
    "className",
    "colSpan",
    "cols",
    "content",
    "contentEditable",
    "contextMenu",
    "controls",
    "controlsList",
    "coords",
    "crossOrigin",
    "data",
    "dateTime",
    "default",
    "defer",
    "dir",
    "disabled",
    "download",
    "draggable",
    "encType",
    "form",
    "formAction",
    "formEncType",
    "formMethod",
    "formNoValidate",
    "formTarget",
    "frameBorder",
    "headers",
    "height",
    "hidden",
    "high",
    "href",
    "hrefLang",
    "htmlFor",
    "httpEquiv",
    "icon",
    "id",
    "inputMode",
    "integrity",
    "is",
    "keyParams",
    "keyType",
    "kind",
    "label",
    "lang",
    "list",
    "loop",
    "low",
    "manifest",
    "marginHeight",
    "marginWidth",
    "max",
    "maxLength",
    "media",
    "mediaGroup",
    "method",
    "min",
    "minLength",
    "multiple",
    "muted",
    "name",
    "noValidate",
    "nonce",
    "open",
    "optimum",
    "pattern",
    "placeholder",
    "poster",
    "preload",
    "profile",
    "radioGroup",
    "readOnly",
    "rel",
    "required",
    "reversed",
    "role",
    "rowSpan",
    "rows",
    "sandbox",
    "scope",
    "scoped",
    "scrolling",
    "seamless",
    "selected",
    "shape",
    "size",
    "sizes",
    "span",
    "spellCheck",
    "src",
    "srcDoc",
    "srcLang",
    "srcSet",
    "start",
    "step",
    "style",
    "summary",
    "tabIndex",
    "target",
    "title",
    "type",
    "useMap",
    "value",
    "width",
    "wmode",
    "wrap"
)

private val attrsMap = events.associateBy { it.lowercase() }.toMutableMap().apply {
    put("class", "className")
    put("ondblclick", "onDoubleClick")
}

fun fixAttributeName(event: String): String = attrsMap[event] ?: event

object StringAttr {
    operator fun getValue(thisRef: Tag, property: KProperty<*>): String =
        thisRef.attributes[property.name] ?: ""

    operator fun setValue(thisRef: Tag, property: KProperty<*>, value: String) {
        thisRef.attributes[property.name] = value
    }
}

var Tag.key by StringAttr

// See https://facebook.github.io/react/docs/forms.html
var INPUT.defaultValue by StringAttr

var TEXTAREA.defaultValue by StringAttr

var TEXTAREA.value by StringAttr

var Tag.jsStyle: dynamic
    get() {
        val value = asDynamic()[jsStyleMarker] ?: jso()
        jsStyle = value
        return value
    }
    set(value) {
        asDynamic()[jsStyleMarker] = value
        attributes[jsStyleMarker] = value.hashCode().toString()
    }

const val jsStyleMarker = "${"$"}style${"$"}"

inline fun Tag.jsStyle(handler: dynamic.() -> Unit) =
    handler(jsStyle)
