package example

import csstype.Color
import emotion.react.css
import kotlinx.js.jso
import react.FC
import react.Props
import react.dom.html.InputType
import react.dom.html.ReactHTML.br
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.h1
import react.dom.html.ReactHTML.input
import react.dom.html.ReactHTML.p
import react.useState
import kotlin.js.Promise

/**
 * An example of using axios to fetch remote data by Scott_Huang@qq.com (Zhiliang.Huang@gmail.com)
 *
 * This example queries the database of ZIP codes at http://ziptasticapi.com and displays the results.
 */

@JsModule("axios")
@JsNonModule
external fun <T> axios(config: AxiosConfigSettings): Promise<AxiosResponse<T>>

// Type definition
external interface AxiosConfigSettings {
    var url: String
    var method: String
    var baseUrl: String
    var timeout: Number
    var data: dynamic
    var transferRequest: dynamic
    var transferResponse: dynamic
    var headers: dynamic
    var params: dynamic
    var withCredentials: Boolean
    var adapter: dynamic
    var auth: dynamic
    var responseType: String
    var xsrfCookieName: String
    var xsrfHeaderName: String
    var onUploadProgress: dynamic
    var onDownloadProgress: dynamic
    var maxContentLength: Number
    var validateStatus: (Number) -> Boolean
    var maxRedirects: Number
    var httpAgent: dynamic
    var httpsAgent: dynamic
    var proxy: dynamic
    var cancelToken: dynamic
}

external interface AxiosResponse<T> {
    val data: T
    val status: Number
    val statusText: String
    val headers: dynamic
    val config: AxiosConfigSettings
}

data class ZipResult(
    val country: String,
    val state: String,
    val city: String,
)

external interface AxiosProps : Props

external interface ZipData {
    val country: String
    val state: String
    val city: String
}

val AxiosSearchApp = FC<AxiosProps> {
    var zipCode by useState("")
    var zipResult by useState(ZipResult("", "", ""))
    var errorMessage by useState("")

    fun remoteSearchZip(zipCode: String) {
        val config: AxiosConfigSettings = jso {
            url = "https://ziptasticapi.com/$zipCode"
            timeout = 3000
        }

        axios<ZipData>(config)
            .then { response ->
                zipResult = ZipResult(response.data.country, response.data.state, response.data.city)
                errorMessage = ""
                console.log(response)
            }
            .catch { error ->
                zipResult = ZipResult("", "", "")
                errorMessage = error.message ?: ""
                console.log(error)
            }
    }

    fun handleChange(targetValue: String) {
        zipCode = targetValue
        zipResult = ZipResult("", "", "")
        errorMessage = ""
        if (targetValue.length == 5) {
            remoteSearchZip(targetValue)
        }
    }

    val infoText = "Enter a valid US ZIP code below"
    div {
        p {
            +infoText
        }
        input {
            key = "zipCode"

            type = InputType.text
            name = "zipCode"
            value = zipCode
            placeholder = "Enter ZIP code"
            title = infoText
            onChange = {
                handleChange(it.target.value)
            }
        }
        br()
        h1 {
            +"$zipCode ZIP code belongs to:"
            +"${zipResult.country} ${zipResult.state} ${zipResult.city}"

            if (errorMessage.isNotEmpty()) {
                div {
                    css {
                        color = Color("red")
                    }

                    +"Error while searching for ZIP code: "
                    +errorMessage
                }
            }
        }
    }
}
