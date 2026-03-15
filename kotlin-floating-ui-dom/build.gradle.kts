plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    webMainApi(npm(jspkg.floatingUi.dom))
}
