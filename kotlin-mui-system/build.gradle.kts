plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    webMainApi(projects.kotlinReactDom)

    webMainApi(npm(jspkg.mui.system))
}
