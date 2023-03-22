// Automatically generated - do not modify!

@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.media.key

// language=JavaScript
@JsName("""(/*union*/{individualizationRequest: 'individualization-request', licenseRelease: 'license-release', licenseRenewal: 'license-renewal', licenseRequest: 'license-request'}/*union*/)""")
sealed external interface MediaKeyMessageType {
    companion object {
        val individualizationRequest: MediaKeyMessageType
        val licenseRelease: MediaKeyMessageType
        val licenseRenewal: MediaKeyMessageType
        val licenseRequest: MediaKeyMessageType
    }
}
