@file:Suppress("UnsafeCastFromDynamic")

package example

/**
 * An example to show how to leverage axios lib to fetch remote data by Scott_Huang@qq.com (Zhiliang.Huang@gmail.com)
 * Review by @Hypnosphi
 * Date: Nov 25 ~ 28, 2017
 */

import kotlinext.js.js
import kotlinext.js.jsObject
import kotlinx.html.*
import kotlinx.html.js.*
import org.w3c.dom.HTMLInputElement
import react.*
import react.dom.*
import kotlin.js.Promise

data class ZipResult(val country: String, val state: String, val city: String)
interface AxiosProps : RProps {
}

interface AxiosState : RState {
    var zipCode: String
    var zipResult: ZipResult
    var errorMessage: String
}

//Per Hypnosphi advice, change to common js way.
//you should need "npm install axios --save" in advance in your project folder
@JsModule("axios")
//external fun axios(config: AxiosConfigSettings): dynamic
external fun <T> axios(config: AxiosConfigSettings): Promise<AxiosResponse<T>>

//add enhanced typing for axios
external interface AxiosConfigSettings {
    var url: String
    var method: String  //get, post, head, delete, put, patch and so on.  The default is get if you not set any info
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
    var responseType: String //defauls is json
    var xsrfCookieName: String
    var xsrfHeaderName: String
    var onUploadProgress: dynamic
    var onDowndloadProgress: dynamic
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

//just for this zip code search response data
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
            url = "http://ziptasticapi.com/" + zipCode
            timeout = 3000
        }
        //First, you have to put the { response -> ... } lambda in parentheses, because it's not actually the last argument of then
        axios<ZipData>(config).then({ response ->
            setState {
                zipResult = ZipResult(response.data.country, response.data.state, response.data.city)
                errorMessage = ""
            }
            console.log(response.status)
            console.log(response.statusText)
            console.log(response.config)
            console.log(response.headers)
            console.log(response.data)
        }).catch { error ->
            setState {
                zipResult = ZipResult("", "", "")
                // the Elvis operator is needed because `Throwable::message` is nullable
                errorMessage = error.message ?: ""
            }
            console.log(error.message)
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
        val infoText = "Input USA 5 digit zip code below... such as 90210 or 24124 or any valid zip code."
        div {
            p { +infoText }
            input(type = InputType.text, name = "zipCode") {
                key = "zipCode"
                attrs {
                    value = state.zipCode
                    placeholder = "Input zip code ..."
                    title = infoText
                    onChangeFunction = {
                        val target = it.target as HTMLInputElement
                        handleChange(target.value)
                    }
                }
            }
            br {}
            h1 {
                +"zip code ${state.zipCode} detail result is: "
                +"${state.zipResult.country} ${state.zipResult.state} ${state.zipResult.city} "
                if (!state.errorMessage.isNullOrEmpty()) div {
                    attrs.style = js {
                        color = "red"
                    }
                    +"Find error: "
                    +state.errorMessage
                    +". Please open your console to learn detail"
                }
            }

        }
    }
}

fun RBuilder.axiosSearch() = child(AxiosSearch::class) {
}
