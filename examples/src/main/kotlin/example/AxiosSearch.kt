package example

/**
 * An example of using axios to fetch remote data by Scott_Huang@qq.com (Zhiliang.Huang@gmail.com)
 *
 * This example queries the database of ZIP codes at http://ziptasticapi.com and displays the results.
 */

import kotlinext.js.*
import kotlinx.html.*
import kotlinx.html.js.*
import org.w3c.dom.*
import react.*
import react.dom.*
import kotlin.js.*

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

data class ZipResult(val country: String, val state: String, val city: String)

interface AxiosProps : RProps

interface AxiosState : RState {
    var zipCode: String
    var zipResult: ZipResult
    var errorMessage: String
}

external interface ZipData {
    val country: String
    val state: String
    val city: String
}

class AxiosSearch(props: AxiosProps) : RComponent<AxiosProps, AxiosState>(props) {
    override fun AxiosState.init(props: AxiosProps) {
        zipCode = ""
        zipResult = ZipResult("", "", "")
        errorMessage = ""
    }

    private fun remoteSearchZip(zipCode: String) {
        val config: AxiosConfigSettings = jsObject {
            url = "https://ziptasticapi.com/$zipCode"
            timeout = 3000
        }

        axios<ZipData>(config).then { response ->
            setState {
                zipResult = ZipResult(response.data.country, response.data.state, response.data.city)
                errorMessage = ""
            }
            console.log(response)
        }.catch { error ->
            setState {
                zipResult = ZipResult("", "", "")
                errorMessage = error.message ?: ""
            }
            console.log(error)
        }
    }

    private fun handleChange(targetValue: String) {
        setState {
            zipCode = targetValue
            zipResult = ZipResult("", "", "")
            errorMessage = ""
        }
        if (targetValue.length == 5) {
            remoteSearchZip(targetValue)
        }
    }

    override fun RBuilder.render() {
        val infoText = "Enter a valid US ZIP code below"
        div {
            p { +infoText }
            input(type = InputType.text, name = "zipCode") {
                key = "zipCode"
                attrs {
                    value = state.zipCode
                    placeholder = "Enter ZIP code"
                    title = infoText
                    onChangeFunction = {
                        val target = it.target as HTMLInputElement
                        handleChange(target.value)
                    }
                }
            }
            br {}
            h1 {
                +"${state.zipCode} ZIP code belongs to: "
                +"${state.zipResult.country} ${state.zipResult.state} ${state.zipResult.city} "
                if (!state.errorMessage.isEmpty()) div {
                    attrs.jsStyle = js {
                        color = "red"
                    }
                    +"Error while searching for ZIP code: "
                    +state.errorMessage
                }
            }
        }
    }
}

fun RBuilder.axiosSearch() = child(AxiosSearch::class) {
}
