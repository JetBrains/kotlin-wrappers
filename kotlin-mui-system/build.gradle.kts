plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    jsMainApi(projects.kotlinReactDom)

    webMainApi(npm(jspkg.mui.system))
}
