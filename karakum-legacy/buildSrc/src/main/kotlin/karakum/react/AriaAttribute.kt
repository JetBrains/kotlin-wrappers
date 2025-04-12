package karakum.react

// https://developer.mozilla.org/en-US/docs/Web/API/Element
private val PROPERTY_NAMES = setOf(
    "ariaAtomic",
    "ariaAutoComplete",
    "ariaBusy",
    "ariaChecked",
    "ariaColCount",
    "ariaColIndex",
    "ariaColIndexText",
    "ariaColSpan",
    "ariaCurrent",
    "ariaDescription",
    "ariaDisabled",
    "ariaExpanded",
    "ariaHasPopup",
    "ariaHidden",
    "ariaKeyShortcuts",
    "ariaLabel",
    "ariaLevel",
    "ariaLive",
    "ariaModal",
    "ariaMultiline",
    "ariaMultiSelectable",
    "ariaOrientation",
    "ariaPlaceholder",
    "ariaPosInSet",
    "ariaPressed",
    "ariaReadOnly",
    "ariaRelevant",
    "ariaRequired",
    "ariaRoleDescription",
    "ariaRowCount",
    "ariaRowIndex",
    "ariaRowIndexText",
    "ariaRowSpan",
    "ariaSelected",
    "ariaSetSize",
    "ariaSort",
    "ariaValueMax",
    "ariaValueMin",
    "ariaValueNow",
    "ariaValueText",

    // manual
    "ariaActiveDescendant",
    "ariaBrailleLabel",
    "ariaBrailleRoleDescription",
    "ariaControls",
    "ariaDescribedBy",
    "ariaDetails",
    "ariaDropEffect",
    "ariaErrorMessage",
    "ariaFlowTo",
    "ariaGrabbed",
    "ariaInvalid",
    "ariaLabelledBy",
    "ariaOwns",
)

private val PROPERTY_NAME_MAP = PROPERTY_NAMES
    .associateBy { it.lowercase() }

internal fun String.ariaPropertyName(): String =
    PROPERTY_NAME_MAP.getValue(replace("aria-", "aria"))
