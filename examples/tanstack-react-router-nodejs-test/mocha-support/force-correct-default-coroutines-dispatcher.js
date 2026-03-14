// coroutines will only select NodeDispatcher as default dispatcher in jsdom environment when user-agent contains 'jsdom'
// https://github.com/Kotlin/kotlinx.coroutines/blob/master/kotlinx-coroutines-core/js/src/CoroutineContext.kt
// TODO: coroutines issue requesting api to explictly set NodeDispatcher as default dispatchers

Object.defineProperty(navigator, "userAgent", {
    value: navigator.userAgent + " jsdom",
    configurable: true
});
