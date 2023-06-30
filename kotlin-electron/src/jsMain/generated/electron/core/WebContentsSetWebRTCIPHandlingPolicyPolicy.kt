package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{default: 'default', defaultPublicInterfaceOnly: 'default_public_interface_only', defaultPublicAndPrivateInterfaces: 'default_public_and_private_interfaces', disableNonProxiedUdp: 'disable_non_proxied_udp'}/*union*/)""")
sealed external interface WebContentsSetWebRTCIPHandlingPolicyPolicy {
    companion object {
        val default: WebContentsSetWebRTCIPHandlingPolicyPolicy
        val defaultPublicInterfaceOnly: WebContentsSetWebRTCIPHandlingPolicyPolicy
        val defaultPublicAndPrivateInterfaces: WebContentsSetWebRTCIPHandlingPolicyPolicy
        val disableNonProxiedUdp: WebContentsSetWebRTCIPHandlingPolicyPolicy
    }
}
