plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    webMainApi(projects.kotlinMuiSystem)
    webMainApi(projects.kotlinPopperjsCore)

    webMainApi(npm(jspkg.mui.base))
}
