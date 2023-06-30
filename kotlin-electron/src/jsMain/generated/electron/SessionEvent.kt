package electron


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName(
    """(/*union*/{EXTENSION_LOADED: 'extension-loaded', EXTENSION_READY: 'extension-ready', EXTENSION_UNLOADED: 'extension-unloaded', HID_DEVICE_ADDED: 'hid-device-added', HID_DEVICE_REMOVED: 'hid-device-removed', HID_DEVICE_REVOKED: 'hid-device-revoked', PRECONNECT: 'preconnect', SELECT_HID_DEVICE: 'select-hid-device', SELECT_SERIAL_PORT: 'select-serial-port', SELECT_USB_DEVICE: 'select-usb-device', SERIAL_PORT_ADDED: 'serial-port-added', SERIAL_PORT_REMOVED: 'serial-port-removed', SERIAL_PORT_REVOKED: 'serial-port-revoked', SPELLCHECK_DICTIONARY_DOWNLOAD_BEGIN: 'spellcheck-dictionary-download-begin', SPELLCHECK_DICTIONARY_DOWNLOAD_FAILURE: 'spellcheck-dictionary-download-failure', SPELLCHECK_DICTIONARY_DOWNLOAD_SUCCESS: 'spellcheck-dictionary-download-success', SPELLCHECK_DICTIONARY_INITIALIZED: 'spellcheck-dictionary-initialized', USB_DEVICE_ADDED: 'usb-device-added', USB_DEVICE_REMOVED: 'usb-device-removed', USB_DEVICE_REVOKED: 'usb-device-revoked', WILL_DOWNLOAD: 'will-download'}/*union*/)"""
)
sealed external interface SessionEvent : node.events.EventType {
    object EXTENSION_LOADED : SessionEvent
    object EXTENSION_READY : SessionEvent
    object EXTENSION_UNLOADED : SessionEvent
    object HID_DEVICE_ADDED : SessionEvent
    object HID_DEVICE_REMOVED : SessionEvent
    object HID_DEVICE_REVOKED : SessionEvent
    object PRECONNECT : SessionEvent
    object SELECT_HID_DEVICE : SessionEvent
    object SELECT_SERIAL_PORT : SessionEvent
    object SELECT_USB_DEVICE : SessionEvent
    object SERIAL_PORT_ADDED : SessionEvent
    object SERIAL_PORT_REMOVED : SessionEvent
    object SERIAL_PORT_REVOKED : SessionEvent
    object SPELLCHECK_DICTIONARY_DOWNLOAD_BEGIN : SessionEvent
    object SPELLCHECK_DICTIONARY_DOWNLOAD_FAILURE : SessionEvent
    object SPELLCHECK_DICTIONARY_DOWNLOAD_SUCCESS : SessionEvent
    object SPELLCHECK_DICTIONARY_INITIALIZED : SessionEvent
    object USB_DEVICE_ADDED : SessionEvent
    object USB_DEVICE_REMOVED : SessionEvent
    object USB_DEVICE_REVOKED : SessionEvent
    object WILL_DOWNLOAD : SessionEvent
}
