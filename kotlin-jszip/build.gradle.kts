plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    webMainApi(projects.kotlinWeb)
    webMainApi(npm(jspkg.jszip))
}
