package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{LOCK_SCREEN: 'lock-screen', ON_AC: 'on-ac', ON_BATTERY: 'on-battery', RESUME: 'resume', SHUTDOWN: 'shutdown', SPEED_LIMIT_CHANGE: 'speed-limit-change', SUSPEND: 'suspend', THERMAL_STATE_CHANGE: 'thermal-state-change', UNLOCK_SCREEN: 'unlock-screen', USER_DID_BECOME_ACTIVE: 'user-did-become-active', USER_DID_RESIGN_ACTIVE: 'user-did-resign-active'}/*union*/)""")
sealed external interface PowerMonitorEvent : node.events.EventType {
    object LOCK_SCREEN : PowerMonitorEvent
    object ON_AC : PowerMonitorEvent
    object ON_BATTERY : PowerMonitorEvent
    object RESUME : PowerMonitorEvent
    object SHUTDOWN : PowerMonitorEvent
    object SPEED_LIMIT_CHANGE : PowerMonitorEvent
    object SUSPEND : PowerMonitorEvent
    object THERMAL_STATE_CHANGE : PowerMonitorEvent
    object UNLOCK_SCREEN : PowerMonitorEvent
    object USER_DID_BECOME_ACTIVE : PowerMonitorEvent
    object USER_DID_RESIGN_ACTIVE : PowerMonitorEvent
}
