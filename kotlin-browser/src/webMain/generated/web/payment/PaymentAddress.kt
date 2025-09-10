// Automatically generated - do not modify!

package web.payment

import js.array.ReadonlyArray
import kotlin.js.JsAny
import kotlin.js.JsString

/**
 * The **`ContactAddress`** interface of the Contact Picker API represents a physical address.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ContactAddress)
 */
open external class PaymentAddress
private constructor() {
    /**
     * The **`addressLine`** read-only property of the ContactAddress interface is an array of strings, each specifying a line of the address that is not covered by one of the other properties of `ContactAddress`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ContactAddress/addressLine)
     */
    val addressLine: ReadonlyArray<JsString>

    /**
     * The **`city`** read-only property of the ContactAddress interface returns a string containing the city or town portion of the address.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ContactAddress/city)
     */
    val city: String

    /**
     * The **`country`** read-only property of the ContactAddress interface is a string identifying the address's country using the ISO 3166-1 alpha-2 standard.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ContactAddress/country)
     */
    val country: String

    /**
     * The read-only **`dependentLocality`** property of the ContactAddress interface is a string containing a locality or sublocality designation within a city, such as a neighborhood, borough, district, or, in the United Kingdom, a dependent locality.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ContactAddress/dependentLocality)
     */
    val dependentLocality: String

    /**
     * The **`organization`** read-only property of the ContactAddress interface returns a string containing the name of the organization, firm, company, or institution at the address.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ContactAddress/organization)
     */
    val organization: String

    /**
     * The read-only **`phone`** property of the ContactAddress interface returns a string containing the telephone number of the recipient or contact person at the address.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ContactAddress/phone)
     */
    val phone: String

    /**
     * The **`postalCode`** read-only property of the ContactAddress interface returns a string containing a code used by a jurisdiction for mail routing, for example, the ZIP Code in the United States or the Postal Index Number (PIN code) in India.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ContactAddress/postalCode)
     */
    val postalCode: String

    /**
     * The read-only **`recipient`** property of the ContactAddress interface returns a string containing the name of the recipient, purchaser, or contact person at the address.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ContactAddress/recipient)
     */
    val recipient: String

    /**
     * The read-only **`region`** property of the ContactAddress interface returns a string containing the top-level administrative subdivision of the country in which the address is located.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ContactAddress/region)
     */
    val region: String

    /**
     * The **`sortingCode`** read-only property of the ContactAddress interface returns a string containing a postal sorting code such as is used in France.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ContactAddress/sortingCode)
     */
    val sortingCode: String

    /**
     * The **`toJSON()`** method of the ContactAddress interface is a standard serializer that returns a JSON representation of the `ContactAddress` object's properties.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ContactAddress/toJSON)
     */
    fun toJSON(): JsAny
}
